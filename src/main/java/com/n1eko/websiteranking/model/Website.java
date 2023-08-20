package com.n1eko.websiteranking.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Website {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private String baseUrl;

    @Column(nullable = false)
    private String fullUrl;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

    @Column(nullable = false)
    private int votes;

}
