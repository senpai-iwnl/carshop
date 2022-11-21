package pl.pb.carshop.uprawnienia;

import lombok.*;
import pl.pb.carshop.uzytkownicy.Uzytkownicy;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Uprawnienia {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private Long id;
    @NonNull
    private String nazwa;
    @NonNull
    private Boolean otwieranie;
    @NonNull
    private Boolean dodawanie;
    @NonNull
    private Boolean aktualizowanie;
    @NonNull
    private Boolean usuwanie;

    @OneToMany(mappedBy = "uprawnienia")
    @Setter(AccessLevel.NONE)
    private Set<Uzytkownicy> uzytkownicy;
}
