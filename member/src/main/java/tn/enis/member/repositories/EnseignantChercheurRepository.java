package tn.enis.member.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.enis.member.entities.EnseignantChercheur;

import java.util.List;

public interface EnseignantChercheurRepository extends JpaRepository<Long, EnseignantChercheur> {
    List<EnseignantChercheur> findByGrade(String grade);
    List<EnseignantChercheur>findByEtablissement(String etablissement);
}
