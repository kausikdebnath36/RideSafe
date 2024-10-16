package com.debnath.RideSafe.Entity;

import com.debnath.RideSafe.Enum.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tbltUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;

    private Long mobileNumber;

    private String emailId;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String imagePath;
}
