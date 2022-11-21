package pl.pb.carshop.statussamochodu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusSamochoduRepository extends JpaRepository<StatusSamochodu, Long> {
}
