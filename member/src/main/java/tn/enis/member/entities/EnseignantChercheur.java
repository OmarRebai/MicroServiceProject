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
    private String etabmlissement;
    @OneToMany(mappedBy = "enseignantChercheur")
    private List<Etudiant> etudiants=new ArrayList<>();
    @Builder
    public EnseignantChercheur (String cin, String nom, String prenom, Date dateNaissance, String email, String password, @NonNull String grade, @NonNull String etabmlissement) {
        super(cin, nom, prenom, dateNaissance, email, password);
        this.grade = grade;
        this.etabmlissement = etabmlissement;
    }
}
