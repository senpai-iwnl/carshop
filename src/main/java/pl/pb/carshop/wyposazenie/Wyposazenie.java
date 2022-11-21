package pl.pb.carshop.wyposazenie;

import lombok.*;
import pl.pb.carshop.samochody.Samochody;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Wyposazenie {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private Long id;
    @NonNull
    private String nazwa;
    @NonNull
    private String opis;

    @ManyToMany
    @JoinTable(
            name = "samochod_enrolled",
            joinColumns = @JoinColumn(name = "wyposarzenie_id"),
            inverseJoinColumns = @JoinColumn(name = "samochody_id")
    )
    @Setter(AccessLevel.NONE)
    private Set<Samochody> enrolledSamochody = new HashSet<>();
}
