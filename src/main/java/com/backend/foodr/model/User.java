package com.backend.foodr.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    /**
     *
     * Member Variables
     *
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String email;

    @Column
    private String password;

}
