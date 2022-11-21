package pl.pb.carshop.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Uprawnienia {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nazwa;
    private Boolean otwieranie;
    private Boolean dodawanie;
    private Boolean aktualizowanie;
    private Boolean usuwanie;

    @OneToMany(mappedBy = "uprawnienia")
    private Set<Uzytkownicy> uzytkownicy;
}
