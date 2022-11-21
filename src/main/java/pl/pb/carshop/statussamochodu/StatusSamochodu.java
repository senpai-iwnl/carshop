package pl.pb.carshop.statussamochodu;

import lombok.*;
import pl.pb.carshop.samochody.Samochody;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class StatusSamochodu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private Long id;
    @NonNull
    private String kodStatusu;
    @NonNull
    private String opis;

    @OneToMany(mappedBy = "statusSamochodu")
    @Setter(AccessLevel.NONE)
    private Set<Samochody> samochody;
}
