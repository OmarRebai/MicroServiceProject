package tn.enis.member.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.enis.member.entities.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByCin (String cin);
    Optional<Member> findById (String id);

    List<Member> findByNomStartingWith (String caractere);

    Member findByEmail (String email);
    void deleteMemberById(Long id);
}
