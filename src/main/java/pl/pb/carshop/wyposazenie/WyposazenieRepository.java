package pl.pb.carshop.wyposazenie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WyposazenieRepository extends JpaRepository<Wyposazenie, Long> {
}
