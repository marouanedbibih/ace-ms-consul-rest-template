package org.marouanedbibih.car.modules.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.micrometer.observation.annotation.Observed;

@Repository
@Observed
public interface CarRepository extends JpaRepository<Car, Long> {

}
