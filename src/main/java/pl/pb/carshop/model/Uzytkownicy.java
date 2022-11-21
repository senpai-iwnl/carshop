package pl.pb.carshop.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Uzytkownicy {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imie;
    private String nazwisko;
    private String login;
    private String haslo;
    private String email;
    private String telefon;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate urodziny;
    private String pesel;

    @OneToMany(mappedBy = "uzytkownicy")
    private Set<Komentarze> komentarze;

    @OneToMany(mappedBy = "uzytkownicy")
    private Set<Rezerwacje> rezerwacje;

    @ManyToOne
    @JoinColumn(name = "uprawnienia_id", nullable = false)
    private Uprawnienia uprawnienia;

}
