
create table Person (
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key (id)
);

insert into Person (id, name, location, birth_date)
                   values(12001, 'Juan', 'Medellin', sysdate());
insert into Person (id, name, location, birth_date)
                    values(13001, 'Pablo', 'Bogota', sysdate());
insert into Person (id, name, location, birth_date)
                   values(14001, 'Andres', 'Medellin', sysdate());
insert into Person (id, name, location, birth_date)
                   values(15001, 'Laura', 'Pasto', sysdate());
insert into Person (id, name, location, birth_date)
                   values(16001, 'Victor', 'Miami', sysdate());
insert into Person (id, name, location, birth_date)
                   values(17001, 'Jose', 'Cartagena', sysdate());
insert into Person (id, name, location, birth_date)
                   values(18001, 'Luis', 'Bogota', sysdate());