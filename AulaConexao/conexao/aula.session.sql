/*Apagar base se ela existir*/
drop database if exists aula_serratec;
create database aula_serratec;
use aula_serratec;
create table cliente(
    codigo int primary key auto_increment,
    nome varchar(50),
    telefone varchar(11), 
    email varchar(30));

insert into cliente values(null,'Carol','2222-1015','carol@gmail.com');
insert into cliente (nome,telefone,email) values ('Jorge','2245-1015','jorge@hotmail.com');

SELECT * from cliente;