package pl.pb.carshop.stanrezerwacji;

import lombok.*;
import pl.pb.carshop.rezerwacje.Rezerwacje;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class StanRezerwacji {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private Long id;
    @NonNull
    private String opis;

    @OneToMany(mappedBy = "stanRezerwacji")
    @Setter(AccessLevel.NONE)
    private Set<Rezerwacje> rezerwacje;
}
