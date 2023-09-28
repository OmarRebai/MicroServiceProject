package tn.enis.member.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.enis.member.entities.Member;
import tn.enis.member.repositories.MemberRepository;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService (MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member addMember (Member member) {
        return memberRepository.save(member);
    }

    public List<Member> findAllMembers () {
        return memberRepository.findAll();
    }

    public List<Member> findByNomStartingWith (String caractere) {
        return memberRepository.findByNomStartingWith(caractere);
    }

    public Member findByCin (String cin) {
        return memberRepository.findByCin(cin);
    }

    public Member findByEmail (String email) {
        return memberRepository.findByEmail(email);
    }

    public Member updateMember (Member member) {
        return memberRepository.save(member);
    }

    @Transactional
    public void deleteMemberById (Long id) {
        memberRepository.deleteMemberById(id);
    }
}
