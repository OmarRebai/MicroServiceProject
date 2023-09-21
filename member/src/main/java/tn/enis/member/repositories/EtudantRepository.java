package tn.enis.member.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.enis.member.entities.Etudiant;

public interface EtudantRepository extends JpaRepository<Long, Etudiant> {
}
