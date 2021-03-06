package com.igorcoura.documentmanager.domain.entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee extends BaseEntity{

    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String cpf;
    @ManyToOne
    private Company company;
    @OneToMany(mappedBy = "entity")
    private List<Document> document;

}
