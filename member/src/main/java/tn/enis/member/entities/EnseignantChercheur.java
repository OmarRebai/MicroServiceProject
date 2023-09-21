package tn.enis.member.entities;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

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

}
