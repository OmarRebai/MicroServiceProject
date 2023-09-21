package tn.enis.member.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enis.member.repositories.EnseignantChercheurRepository;

@Service
public class EnseignantChercheurService {
    private final EnseignantChercheurRepository enseignantChercheurRepository;

    @Autowired

    public EnseignantChercheurService (EnseignantChercheurRepository enseignantChercheurRepository) {
        this.enseignantChercheurRepository = enseignantChercheurRepository;
    }
}
