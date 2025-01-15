package org.marouanedbibih.client.module;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.micrometer.observation.annotation.Observed;

@Repository
@Observed
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
