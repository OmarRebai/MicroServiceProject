package tn.enis.member.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enis.member.repositories.EtudantRepository;

@Service
public class EtudiantService {
    private final EtudantRepository etudantRepository;
    @Autowired
    public EtudiantService (EtudantRepository etudantRepository) {
        this.etudantRepository = etudantRepository;
    }
}
