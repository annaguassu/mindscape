package model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class Emprestimo {
    private Livro livroEmprestado;
    private Membro membroQuePegouEmprestado;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
}
