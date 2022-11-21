package pl.pb.carshop.uprawnienia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UprawnieniaRepository extends JpaRepository<Uprawnienia, Long> {
}
