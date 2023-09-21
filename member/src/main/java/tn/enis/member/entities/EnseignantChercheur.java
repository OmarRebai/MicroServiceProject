package tn.enis.member.entities;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class EnseignantChercheur extends Member {
    private String grade;
    private String etabmlissement;

}
