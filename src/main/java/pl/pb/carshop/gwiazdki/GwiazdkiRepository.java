package pl.pb.carshop.gwiazdki;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GwiazdkiRepository extends JpaRepository<Gwiazdki, Long> {
}
