package pl.pb.carshop.stanrezerwacji;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StanRezerwacjiRepository extends JpaRepository<StanRezerwacji, Long> {
}
