package pl.pb.carshop.parametrysamochodu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametrySamochoduRepository extends JpaRepository<ParametrySamochodu, Long> {
}
