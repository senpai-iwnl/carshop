package pl.pb.carshop.model;

import javax.persistence.*;

@Entity
public class WyposazenieSamochodyRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name="samochody_id", nullable=false)
    private Samochody samochody;

    @ManyToOne
    @JoinColumn(name="wyposarzenie_id", nullable=false)
    private Wyposazenie wyposazenie;
}
