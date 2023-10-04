package tn.enis.member.entities;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("ens")
public class EnseignantChercheur extends Member {
    @NonNull
    private String grade;
    @NonNull
    private String etablissement;
    @OneToMany(mappedBy = "enseignantChercheur")
    private List<Etudiant> etudiants=new ArrayList<>();
    @Builder
    public EnseignantChercheur (Long id, @NonNull String cin, @NonNull String nom, @NonNull String prenom, @NonNull Date dateNaissance, Byte photo, String cv, @NonNull String email, @NonNull String password, @NonNull String grade, @NonNull String etablissement) {
        super(id, cin, nom, prenom, dateNaissance, photo, cv, email, password);
        this.grade = grade;
        this.etablissement = etablissement;
    }
}
