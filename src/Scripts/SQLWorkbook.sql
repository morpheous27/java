select * from all_tables;
select * from all_users;
alter session set "_ORACLE_SCRIPT"=true; 
CREATE USER nitin IDENTIFIED BY password;
GRANT CONNECT, RESOURCE, DBA TO nitin;
GRANT ALL PRIVILEGES TO nitin;
GRANT UNLIMITED TABLESPACE TO nitin;
--GRANT SELECT, INSERT, UPDATE, DELETE ON schema.books TO books_admin;

