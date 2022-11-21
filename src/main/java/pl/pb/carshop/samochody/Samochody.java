package pl.pb.carshop.samochody;


import lombok.*;
import pl.pb.carshop.gwiazdki.Gwiazdki;
import pl.pb.carshop.komentarze.Komentarze;
import pl.pb.carshop.lokacje.Lokacje;
import pl.pb.carshop.parametrysamochodu.ParametrySamochodu;
import pl.pb.carshop.rezerwacje.Rezerwacje;
import pl.pb.carshop.statussamochodu.StatusSamochodu;
import pl.pb.carshop.wyposazenie.Wyposazenie;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Samochody {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private Long id;
    @NonNull
    private String rejestracja;
    @NonNull
    private String marka;
    @NonNull
    private String model;
    @NonNull
    private Double dziennyKoszt;
    //nie wiem co to
    @NonNull
    private Boolean najlepszaOferta;


    //ManyToOne
    //Lokalizacja
    @ManyToOne
    @JoinColumn(name = "lokacja_id", referencedColumnName = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Lokacje lokacje;

    //Status
    @ManyToOne
    @JoinColumn(name = "statusSamochodu_id", referencedColumnName = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private StatusSamochodu statusSamochodu;


    //OneToMany
    //Gwiazdki
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gwiazdki_id", referencedColumnName = "id")
    @Setter(AccessLevel.NONE)
    private Gwiazdki gwiazdki;

    //Parametry
    @OneToMany(mappedBy = "samochody")
    @Setter(AccessLevel.NONE)
    private Set<ParametrySamochodu> parametrySamochodu;

    //Wyposarzenie
    @ManyToMany(mappedBy = "enrolledSamochody")
    @Setter(AccessLevel.NONE)
    private Set<Wyposazenie> wyposazenie = new HashSet<>();

    //Rezerwacje
    @OneToMany(mappedBy = "samochody")
    @Setter(AccessLevel.NONE)
    private Set<Rezerwacje> rezerwacje;

    //Komentarze
    @OneToMany(mappedBy = "samochody")
    @Setter(AccessLevel.NONE)
    private Set<Komentarze> komentarze;

}
