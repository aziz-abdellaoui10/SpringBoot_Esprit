package Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Moniteur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long numMoniteur;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;
    @OneToMany(mappedBy = "moniteur")
    private List<Cours> coursList;
}
