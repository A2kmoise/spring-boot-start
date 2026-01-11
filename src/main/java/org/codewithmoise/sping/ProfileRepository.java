package org.codewithmoise.sping;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {

    List<ProfileEntity> findByLoyaltyPointsGreaterThan(int points);

}
