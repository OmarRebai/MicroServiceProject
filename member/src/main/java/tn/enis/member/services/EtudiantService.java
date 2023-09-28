package tn.enis.member.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enis.member.entities.Etudiant;
import tn.enis.member.repositories.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantService {
    private final EtudiantRepository etudiantRepository;

    @Autowired
    public EtudiantService (EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    public Etudiant addEtudiant (Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public List<Etudiant> findAllEtudiants () {
        return etudiantRepository.findAll();
    }

    public List<Etudiant> findByDiplome (String diplome) {
        return etudiantRepository.findByDiplome(diplome);
    }

    public List<Etudiant> findByDiplomeOrderByDateInscriptionDesc (String diplome) {
        return etudiantRepository.findByDiplomeOrderByDateInscriptionDesc(diplome);
    }

}
