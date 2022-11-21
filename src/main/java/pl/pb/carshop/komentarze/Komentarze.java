package pl.pb.carshop.komentarze;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import pl.pb.carshop.samochody.Samochody;
import pl.pb.carshop.uzytkownicy.Uzytkownicy;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Komentarze {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private Long id;
    @NonNull
    private String komentarz;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @NonNull
    private LocalDateTime dataUtworzenia;
    @NonNull
    private Integer ocena;

    @ManyToOne
    @JoinColumn(name = "samochody_id", referencedColumnName = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Samochody samochody;

    @ManyToOne
    @JoinColumn(name = "uzytkownicy_id", referencedColumnName = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Uzytkownicy uzytkownicy;
}
