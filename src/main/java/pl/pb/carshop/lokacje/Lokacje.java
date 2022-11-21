package pl.pb.carshop.lokacje;

import lombok.*;
import pl.pb.carshop.samochody.Samochody;
import pl.pb.carshop.rezerwacje.Rezerwacje;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Lokacje {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private Long id;
    @NonNull
    private String kraj;
    @NonNull
    private String miasto;
    @NonNull
    private String adres;
    @NonNull
    private String email;
    @NonNull
    private String telefon;

    @OneToMany(mappedBy = "lokacje")
    @Setter(AccessLevel.NONE)
    private Set<Samochody> samochody;

    @OneToMany(mappedBy = "lokacje")
    @Setter(AccessLevel.NONE)
    private Set<Rezerwacje> rezerwacje;

}
