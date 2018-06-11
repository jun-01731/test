
drop database if exists test1db;
create database test1db;
use test1db;

create table test1_table(
user_id int,
user_name varchar(255),
password varchar(255)
);

insert into test1_table values(1,"taro","123");
insert into test1_table values(2,"jiro","456");
insert into test1_table values(3,"hanako","789");