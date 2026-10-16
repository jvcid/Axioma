package br.com.axioma.accounting.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Account")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

//conta do plano de contas

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
}
