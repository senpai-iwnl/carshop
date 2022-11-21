package pl.pb.carshop.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class StanRezerwacji {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String opis;

    @OneToMany(mappedBy = "stanRezerwacji")
    private Set<Rezerwacje> rezerwacje;
}
