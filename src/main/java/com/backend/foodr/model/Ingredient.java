package com.backend.foodr.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ingredients")
public class Ingredient {

    /**
     *
     * Member Variables
     *
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String title;

}
