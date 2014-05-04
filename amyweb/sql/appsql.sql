CREATE TABLE user(
id int PRIMARY KEY,
userName varchar(20),
password varchar(20),
createTime datetime,
imageUrl varchar(20)
);

CREATE TABLE student(
id int PRIMARY KEY,
studentName varchar(20),
courseId int
);

CREATE TABLE course(
id int PRIMARY KEY,
courseName varchar(20)
);

insert into student(id,studentName,courseId) values(NULL,'张三',1);
insert into student(id,studentName,courseId) values(NULL,'李四',2);
insert into student(id,studentName,courseId) values(NULL,'王五',3);
insert into student(id,studentName,courseId) values(NULL,'赵六',4);
insert into student(id,studentName,courseId) values(NULL,'田七',5);
insert into student(id,studentName,courseId) values(NULL,'王八',6);

insert into course(id,courseName) values(NULL,'语文');
insert into course(id,courseName) values(NULL,'数学');
insert into course(id,courseName) values(NULL,'英语');
insert into course(id,courseName) values(NULL,'物理');
insert into course(id,courseName) values(NULL,'化学');
insert into course(id,courseName) values(NULL,'生物');
