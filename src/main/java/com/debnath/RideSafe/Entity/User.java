package com.debnath.RideSafe.Entity;

import com.debnath.RideSafe.Enum.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tbltUser")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long userId;

    @Column(name="name")
    private String name;

    @Column(name="mobile_no")
    private String mobileNumber;

    @Column(name="email")
    private String emailId;

    @Column(name="role")
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name="image_path")
    private String imagePath;
}
