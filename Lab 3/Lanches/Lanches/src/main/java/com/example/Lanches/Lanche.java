package com.example.Lanches;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lanche {

    private String id;
    private String nome;

    public Lanche(String name) {
        this.id = UUID.randomUUID().toString();
        this.nome = name;
    }
}
