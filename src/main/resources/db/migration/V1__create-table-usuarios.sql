create table usuarios
(

    id         SERIAL PRIMARY KEY,
    nome       varchar(100) not null,
    email      varchar(100) not null unique,
    cpf        varchar(14)  not null unique,
    nascimento DATE         not null


);