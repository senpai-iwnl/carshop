package pl.pb.carshop.parametrysamochodu;

import lombok.*;
import pl.pb.carshop.samochody.Samochody;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class ParametrySamochodu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private Long id;
    @NonNull
    private String typNadwozia;
    @NonNull
    private Integer rokProdukcji;
    @NonNull
    private String rodzajPaliwa;
    @NonNull
    private Integer moc;
    @NonNull
    private String skrzyniaBiegow;
    @NonNull
    private Boolean napedNaPrzedniekola;
    @NonNull
    private Integer liczabDrzwi;
    @NonNull
    private Integer liczbaSiedzen;
    @NonNull
    private String kolor;
    @NonNull
    private Boolean metaliczny;
    @NonNull
    private String urlZdjecia;
    @NonNull
    private String opis;

    @ManyToOne
    @JoinColumn(name = "samochod_id", referencedColumnName = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Samochody samochody;
}
