package pl.pb.carshop.komentarze;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KomentarzeRepository extends JpaRepository<Komentarze, Long> {
}
