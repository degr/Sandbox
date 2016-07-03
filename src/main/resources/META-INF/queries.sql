create database sandbox;
create table client (
 id integer(11) auto_increment not null,
 username varchar(255),
 password varchar(255),
 email varchar(255),
 donator bit(1),
 primary key (id));

CREATE INDEX username_idx ON client (username);
CREATE INDEX email_idx ON client (email);

create table account (
 id integer(11) auto_increment not null,
 client INTEGER (11),
 primary key (id));

CREATE INDEX client_idx ON account (client);