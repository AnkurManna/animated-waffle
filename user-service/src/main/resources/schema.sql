create table if not exists User (
 userId int  not null AUTO_INCREMENT,
 departmentId int not null,
 firstName varchar(25) not null,
 lastName varchar(25) not null ,
 email varchar(30) not null
);