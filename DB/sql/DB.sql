drop database if exists db;
create database db;
use db;

create table db_table(
user_id int,
user_name varchar(255),
password varchar(255)
);


insert into db_table values(1,"taro","123");
insert into db_table values(2,"jiro","456");
insert into db_table values(3,"haako","789");