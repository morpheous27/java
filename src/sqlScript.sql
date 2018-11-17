use mysql;

select * from sys_config;

create database springuser;
create user 'springuser'@'localhost' identified by 'springuser';
use springuser;
grant all privileges on springuser.* to 'springuser'@'localhost';
select * from department;