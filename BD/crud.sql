-- Crear la base de dades DAM2
create database DAM2;
use DAM2;

-- Crear la taula Professors
create table Professors(
    id int auto_increment primary key,
    nom varchar(50) not null,
    cognoms varchar(50) not null
);