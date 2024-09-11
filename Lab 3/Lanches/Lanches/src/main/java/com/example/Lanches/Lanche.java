package com.example.Lanches;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class Lanche {
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String nome;

    public Lanche() {

    }

    public Lanche(String name) {
        this.id = UUID.randomUUID().toString();
        this.nome = name;
    }
}
