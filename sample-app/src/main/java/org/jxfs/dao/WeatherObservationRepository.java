package org.jxfs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherObservationRepository extends JpaRepository<WeatherObservatonEntity, Long> {

}
