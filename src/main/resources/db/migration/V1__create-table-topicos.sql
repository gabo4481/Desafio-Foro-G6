
create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null unique ,
    mensaje varchar(200) not null unique ,
    fecha datetime not null ,
    status varchar(100),
    autor varchar(100) not null,
    curso varchar(100) not null,

    primary key(id)

);
