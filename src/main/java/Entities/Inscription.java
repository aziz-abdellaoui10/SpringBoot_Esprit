package Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Inscription implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long numInscription;
    private int numSemaine;
    @ManyToOne
    private Skier skier;
    @ManyToOne
    private Cours cours;

}
