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
public class Skier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long numSkier;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String Ville;
    @ManyToMany(mappedBy = "skierList")
    private List<Piste> pisteList;
    @OneToMany(mappedBy = "skier")
    private List<Inscription> inscriptionList;
}
