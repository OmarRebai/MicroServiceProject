package tn.enis.member.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enis.member.entities.EnseignantChercheur;
import tn.enis.member.entities.Etudiant;
import tn.enis.member.repositories.EnseignantChercheurRepository;

import java.util.List;

@Service
public class EnseignantChercheurService {
    private final EnseignantChercheurRepository enseignantChercheurRepository;

    @Autowired
    public EnseignantChercheurService (EnseignantChercheurRepository enseignantChercheurRepository) {
        this.enseignantChercheurRepository = enseignantChercheurRepository;
    }
//    public EnseignantChercheur addEnseignantChercheur (EnseignantChercheur enseignantChercheur) {
//        return enseignantChercheurRepository.save(enseignantChercheur);
//    }
//
//    public List<EnseignantChercheur> findAllEnseignantChercheurs () {
//        return enseignantChercheurRepository.findAll();
//    }
//
//    public List<EnseignantChercheur> findByGrade(String grade) {
//        return enseignantChercheurRepository.findByGrade(grade);
//    }
//
//    public  List<EnseignantChercheur> findByEtablissement(String etablissement) {
//        return enseignantChercheurRepository.findByEtablissement(etablissement);
//    }

}
