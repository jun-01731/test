drop database if exists simpledb;
create database simpledb;
use simpledb;

create table simple_table(
No int,
name varchar(50),
age int,
Mail varchar(50)
);

insert into simple_table values(1,"Yamada",21,"xxx@yahoo.co.jp");
insert into simple_table values(2,"Sato",39,"yyy@google.com");
insert into simple_table values(3,"Harada",44,"zzz@yahoo.co.jp");