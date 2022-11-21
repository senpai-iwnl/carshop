package pl.pb.carshop.uzytkownicy;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import pl.pb.carshop.komentarze.Komentarze;
import pl.pb.carshop.rezerwacje.Rezerwacje;
import pl.pb.carshop.uprawnienia.Uprawnienia;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Uzytkownicy {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private Long id;
    @NonNull
    private String imie;
    @NonNull
    private String nazwisko;
    @NonNull
    private String login;
    @NonNull
    private String haslo;
    @NonNull
    private String email;
    @NonNull
    private String telefon;
    @JsonFormat(pattern="yyyy-MM-dd")
    @NonNull
    private LocalDate urodziny;
    @NonNull
    private String pesel;

    @OneToMany(mappedBy = "uzytkownicy")
    @Setter(AccessLevel.NONE)
    private Set<Komentarze> komentarze;

    @OneToMany(mappedBy = "uzytkownicy")
    @Setter(AccessLevel.NONE)
    private Set<Rezerwacje> rezerwacje;

    @ManyToOne
    @JoinColumn(name = "uprawnienia_id", referencedColumnName = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Uprawnienia uprawnienia;

}
