package tn.enis.member.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.enis.member.entities.Etudiant;
import tn.enis.member.entities.Member;

import java.util.List;

public interface EtudantRepository extends JpaRepository<Long, Etudiant> {
    Member findByCin(String cin);
    List<Member> findByNomStartingWith(String caractere);
    Member findByEmail(String email);
}
