set names utf8;
set foreign_key_checks = 0;
drop database if exists todo;

create database if not exists todo;
use todo;

drop table if exists todo_list;

create table todo_list(
 id int not null primary key auto_increment,
 todo varchar(255),
 insert_date datetime,
 update_date datetime
 );