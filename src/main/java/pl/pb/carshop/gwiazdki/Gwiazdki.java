package pl.pb.carshop.gwiazdki;

import lombok.*;
import pl.pb.carshop.samochody.Samochody;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Gwiazdki {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private Long id;
    @NonNull
    private Double sredniaGwiazdek;

    @OneToOne(mappedBy = "gwiazdki")
    @Setter(AccessLevel.NONE)
    private Samochody samochody;
}
