package tn.enis.evenement.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tn.enis.evenement.entities.Evenement;
import tn.enis.evenement.services.EvenementService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/outils")
@CrossOrigin("*")
@AllArgsConstructor
public class OutilController {
    private final EvenementService outilService;

    @GetMapping
    public ResponseEntity<List<Evenement>> getAllOutils () {
        List<Evenement> evenements = outilService.findAll();
        return new ResponseEntity<>(evenements, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Evenement>> getOutilById (@PathVariable Long id) {
        Optional<Evenement> member = outilService.findEvenement(id);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Evenement> addOutil (@Validated @RequestBody Evenement evenement) {
        Evenement newClient = outilService.addEvenement(evenement);
        return new ResponseEntity<>(newClient, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOutil (@PathVariable("id") Long id) {
        outilService.deleteEvenement(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Evenement> updateOutil (@RequestBody Evenement evenement) {
        Evenement updatedEvenement = outilService.updateEvenement(evenement);
        return new ResponseEntity<>(updatedEvenement, HttpStatus.OK);
    }
}