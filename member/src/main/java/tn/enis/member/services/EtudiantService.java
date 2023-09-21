package tn.enis.member.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enis.member.repositories.EtudiantRepository;

@Service
public class EtudiantService {
    private final EtudiantRepository etudiantRepository ;
    @Autowired
    public EtudiantService (EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }
}
