CREATE DATABASE mindset;

CREATE TABLE livro (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    isbn VARCHAR(20) NOT NULL,
    anoPublicacao INTEGER NOT NULL,
    genero VARCHAR(80) NOT NULL
);

CREATE TABLE membro (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    contato VARCHAR(100) NOT NULL
);

CREATE TABLE emprestimo (
    id SERIAL PRIMARY KEY,
    livroEmprestado INTEGER REFERENCES Livro(id),
    membroQuePegouEmprestado INTEGER REFERENCES Membro(id),
    dataEmprestimo DATE NOT NULL,
    dataDevolucaoPrevista DATE NOT NULL
);