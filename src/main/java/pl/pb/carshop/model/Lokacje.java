package pl.pb.carshop.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Lokacje {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String kraj;
    private String miasto;
    private String adres;
    private String email;
    private String telefon;

    @OneToMany(mappedBy = "lokacje")
    private Set<Samochody> samochody;

    @OneToMany(mappedBy = "lokacje")
    private Set<Rezerwacje> rezerwacje;

}
