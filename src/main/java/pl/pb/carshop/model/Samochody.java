package pl.pb.carshop.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Samochody {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String rejestracja;
    private String marka;
    private String model;
    private Double dziennyKoszt;
    //nie wiem co to
    private Boolean najlepszaOferta;


    //ManyToOne
    @ManyToOne
    @JoinColumn(name="lokacja_id", nullable=false)
    private Lokacje lokacje;

    @ManyToOne
    @JoinColumn(name="statusSamochodu_id", nullable=false)
    private StatusSamochodu statusSamochodu;


    //OneToMany
    @OneToMany(mappedBy = "samochody")
    private Set<ParametrySamochodu> parametrySamochodu;

    @OneToMany(mappedBy = "samochody")
    private Set<Gwiazdki> gwiazdki;

    @OneToMany(mappedBy = "samochody")
    private Set<WyposazenieSamochodyRegistration> wyposazenieSamochodyRegistration;

    @OneToMany(mappedBy = "samochody")
    private Set<Rezerwacje> rezerwacje;

    @OneToMany(mappedBy = "samochody")
    private Set<Komentarze> komentarze;

}
