package tn.enis.member.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.enis.member.entities.Etudiant;

@Repository
public interface EnseignantChercheurRepository extends JpaRepository<Etudiant,Long> {
}
