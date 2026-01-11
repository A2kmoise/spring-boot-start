package org.codewithmoise.sping;

import jakarta.persistence.*;

@Entity
public class ProfileEntity {
    @Id
    private Long id; // Same as User ID
    private String bio;
    private int loyaltyPoints;

    @OneToOne @MapsId
    @JoinColumn(name = "id")
    private UserEntity user;
}
