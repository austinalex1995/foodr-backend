package com.backend.foodr.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

import java.util.List;
import java.util.Set;

@Entity
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "recipes")
public class Recipe {

    /**
     *
     * Member Variables
     *
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @OneToMany(targetEntity = Ingredient.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ri_fk", referencedColumnName = "id")
    private List<Ingredient> ingredients;

}
