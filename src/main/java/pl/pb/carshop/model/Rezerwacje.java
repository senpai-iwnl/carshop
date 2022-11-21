package pl.pb.carshop.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Rezerwacje {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dataOdbioru;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dataZwrotu;
    private Double calkowityKoszt;

    @ManyToOne
    @JoinColumn(name="samochody_id", nullable = false)
    private Samochody samochody;

    @ManyToOne
    @JoinColumn(name="lokacje_id", nullable = false)
    private Lokacje lokacje;

    @ManyToOne
    @JoinColumn(name="stanrezerwacji_id", nullable = false)
    private StanRezerwacji stanRezerwacji;

    @ManyToOne
    @JoinColumn(name="uzytkownicy_id", nullable = false)
    private Uzytkownicy uzytkownicy;


}
