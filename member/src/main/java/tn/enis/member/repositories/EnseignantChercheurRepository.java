package tn.enis.member.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.enis.member.entities.EnseignantChercheur;

public interface EnseignantChercheurRepository extends JpaRepository<Long, EnseignantChercheur> {
}
