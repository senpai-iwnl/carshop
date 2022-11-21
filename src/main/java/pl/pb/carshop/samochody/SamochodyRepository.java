package pl.pb.carshop.samochody;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SamochodyRepository extends JpaRepository<Samochody, Long> {
}
