package pl.pb.carshop.model;

import javax.persistence.*;

@Entity
public class ParametrySamochodu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String typNadwozia;
    private Integer rokProdukcji;
    private String rodzajPaliwa;
    private Integer moc;
    private String skrzyniaBiegow;
    private Boolean napedNaPrzedniekola;
    private Integer liczabDrzwi;
    private Integer liczbaSiedzen;
    private String kolor;
    private Boolean metaliczny;
    private String urlZdjecia;
    private String opis;

    @ManyToOne
    @JoinColumn(name="samochod_id", nullable=false)
    private Samochody samochody;
}
