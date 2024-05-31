package com.example.tareitagtics.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "characters", schema = "marvel")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 500)
    @NotNull
    @Column(name = "name", nullable = false, length = 500)
    private String name;

    @Size(max = 500)
    @NotNull
    @Column(name = "url", nullable = false, length = 500)
    private String url;

    @Size(max = 45)
    @Column(name = "identity", length = 45)
    private String identity;

    @Size(max = 45)
    @Column(name = "align", length = 45)
    private String align;

    @Size(max = 45)
    @Column(name = "eye", length = 45)
    private String eye;

    @Size(max = 45)
    @Column(name = "hair", length = 45)
    private String hair;

    @Size(max = 45)
    @Column(name = "sex", length = 45)
    private String sex;

    @Size(max = 45)
    @Column(name = "gsm", length = 45)
    private String gsm;

    @Size(max = 45)
    @Column(name = "alive", length = 45)
    private String alive;

    @Column(name = "appearances")
    private Integer appearances;

    @Size(max = 45)
    @Column(name = "first_appearance", length = 45)
    private String firstAppearance;

    @Column(name = "year")
    private Integer year;

}