package br.com.axioma.accounting.entity;

import br.com.axioma.accounting.enums.OrganizationMemberType;
import lombok.*;
import jakarta.persistence.*;

//liga usuario organizacao e funcao

@Entity
@Table(name = "User")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter

public class OrganizationMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column
    private String organization;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrganizationMemberType type;



}
