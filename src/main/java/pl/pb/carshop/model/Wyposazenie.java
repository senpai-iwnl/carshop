package pl.pb.carshop.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Wyposazenie {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nazwa;
    private String opis;

    @OneToMany(mappedBy = "wyposazenie")
    private Set<WyposazenieSamochodyRegistration> wyposazenieSamochodyRegistration;
}
