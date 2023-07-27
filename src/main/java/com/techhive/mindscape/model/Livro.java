package com.techhive.mindscape.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Livro {
    private String livro;
    private String autor;
    private String isbn;
    private int anoPublicacao;
    private String genero;
}
