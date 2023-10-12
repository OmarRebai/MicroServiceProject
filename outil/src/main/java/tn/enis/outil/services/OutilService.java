package tn.enis.outil.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.enis.outil.entities.Outil;
import tn.enis.outil.repositories.OutilRepository;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class OutilService implements IOutilService {
    private final OutilRepository outilRepository;


    @Override
    public Outil addOutil (Outil m) {
        return null;
    }

    @Override
    public void deleteOutil (Long id) {

    }

    @Override
    public Outil updateOutil (Outil p) {
        return null;
    }

    @Override
    public Optional<Outil> findOutil (Long id) {
        return Optional.empty();
    }

    @Override
    public List<Outil> findAll () {
        return null;
    }
}
