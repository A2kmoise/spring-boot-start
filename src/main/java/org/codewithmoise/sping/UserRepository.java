package org.codewithmoise.sping;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @EntityGraph(attributePaths = {"profile"})
    List<UserSummary> findByProfileLoyaltyPointsGreaterThan(int points);
}
