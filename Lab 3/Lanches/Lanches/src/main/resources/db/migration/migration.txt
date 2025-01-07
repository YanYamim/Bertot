CREATE TABLE Cliente (
    id_cli integer Primary Key,
    nome_cli varchar(30)

);

CREATE TABLE Lanche (
    id_lan integer,
    nome_lan varchar(20),
    tipo_lan varchar(10) NOT NULL,
    Primary Key(id_lan)

);

CREATE TABLE Compra (
    id_comp integer,
    id_cli integer,
    id_lan integer,
    data_comp Data,
    Primary Key(id_comp),
    Foreign Key (id_cli) references Cliente (id_cli),
    Foreign Key (id_lan) references Lanche (id_lan)
);

CREATE TABLE Cliente_Lanche (
    id_cli integer,
    id_lan integer,
    Primary Key (id_cli, id_lan)
);
