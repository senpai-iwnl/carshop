package pl.pb.carshop.lokacje;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LokacjeRepository extends JpaRepository<Lokacje, Long> {
}
