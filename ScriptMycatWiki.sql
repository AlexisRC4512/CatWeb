create database MyCatWiki 
use MyCatWiki 
create table tb_Cat(
	id int Identity(1,1) not null,
	raza varchar(50)not null,
	descripcion varchar(100)not null,
	foto varchar(200) null
)
insert into tb_Cat values('Korat','Esta extraordinaria belleza de pelaje azul plateado ','https://www.zooplus.es/magazine/wp-content/uploads/2020/02/korat-katze-768x512.jpeg')
select*from tb_Cat
create table tb_LoginUser(
id int Identity(1,1)primary key not null,
email varchar(100)not null,
password varchar(20)not null,
)
create table tb_User(
id int Identity(1,1)primary key not null,
name varchar(60)not null,
lastName varchar(60)not null,
Address varchar(100)null,
phone int null,
LoginID int FOREIGN KEY REFERENCES tb_LoginUser(id)
)
insert into tb_LoginUser values('Franck123@hotmail.com','123456');
select*from tb_LoginUser