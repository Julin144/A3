CREATE DATABASE SAFEPLACE;

USE SAFEPLACE;

/* Usar a tabela USUARIO no lugar
CREATE TABLE Admin(
	idAdmin INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    senha VARCHAR(50)
);*/

#DROP TABLE Condominio;
CREATE TABLE Condominio(
    idCondominio INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    endereco VARCHAR(200)
);
DROP TABLE Usuario;
CREATE TABLE Usuario(
    idUsuario INT PRIMARY KEY AUTO_INCREMENT,
    login VARCHAR(100),
    senha VARCHAR(50),
    tipo  VARCHAR(20)
);
#DROP TABLE Area;
CREATE TABLE Area(
    idArea INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(200),
    dosesRequisitadas INT
);
#DROP TABLE Vacina;
CREATE TABLE Vacina(
    idVacina INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(19),
    qtdDose INT
);
#DROP TABLE Inquilino;
CREATE TABLE Inquilino(
    idInquilino INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    cpf VARCHAR(14),
    aprtNumero INT
);
#DROP TABLE InquilinoVacinado;
CREATE TABLE InquilinoVacinado(
    idVacinado INT PRIMARY KEY AUTO_INCREMENT,
    idInquilino INT,
    idVacina INT,
    FOREIGN KEY (idInquilino) REFERENCES inquilino (idInquilino),
    FOREIGN KEY (idVacina) REFERENCES Vacina (idVacina)
);
#DROP TABLE AcessoArea;
CREATE TABLE AcessoArea(
    idAcesso INT PRIMARY KEY AUTO_INCREMENT,
    idInquilino INT,
    idArea INT,
    hrIni DATETIME,
    hrFim DATETIME,
    numDoses INT,
    FOREIGN KEY (idInquilino) REFERENCES inquilino (idInquilino),
    FOREIGN KEY (idArea) REFERENCES Area (idArea)
);

select 	idUsuario,tipo 
from 	Usuario 
where 	senha = ?
and 	nome = ? ;
	
