package pl.pb.carshop.model;

import javax.persistence.*;
import java.lang.reflect.Member;
import java.util.Set;

@Entity
public class StatusSamochodu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String kodStatusu;
    private String opis;

    @OneToMany(mappedBy = "statusSamochodu")
    private Set<Samochody> samochody;
}
