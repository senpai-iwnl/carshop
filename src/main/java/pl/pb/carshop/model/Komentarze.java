package pl.pb.carshop.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Komentarze {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String komentarz;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataUtworzenia;
    private Integer ocena;

    @ManyToOne
    @JoinColumn(name = "samochody_id", nullable = false)
    private Samochody samochody;

    @ManyToOne
    @JoinColumn(name = "uzytkownicy_id", nullable = false)
    private Uzytkownicy uzytkownicy;
}
