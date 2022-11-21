package pl.pb.carshop.model;

import javax.persistence.*;

@Entity
public class Gwiazdki {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Double sredniaGwiazdek;

    @ManyToOne
    @JoinColumn(name="samochod_id", nullable=false)
    private Samochody samochody;
}
