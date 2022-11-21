package pl.pb.carshop.rezerwacje;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import pl.pb.carshop.lokacje.Lokacje;
import pl.pb.carshop.samochody.Samochody;
import pl.pb.carshop.stanrezerwacji.StanRezerwacji;
import pl.pb.carshop.uzytkownicy.Uzytkownicy;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Rezerwacje {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private Long id;
    @JsonFormat(pattern="yyyy-MM-dd")
    @NonNull
    private LocalDate dataOdbioru;
    @JsonFormat(pattern="yyyy-MM-dd")
    @NonNull
    private LocalDate dataZwrotu;
    @NonNull
    private Double calkowityKoszt;

    @ManyToOne
    @JoinColumn(name="samochody_id", referencedColumnName = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Samochody samochody;

    @ManyToOne
    @JoinColumn(name="lokacje_id", referencedColumnName = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Lokacje lokacje;

    @ManyToOne
    @JoinColumn(name="stanrezerwacji_id", referencedColumnName = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private StanRezerwacji stanRezerwacji;

    @ManyToOne
    @JoinColumn(name="uzytkownicy_id", referencedColumnName = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Uzytkownicy uzytkownicy;


}
