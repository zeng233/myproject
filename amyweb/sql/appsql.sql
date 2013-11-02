
select a.company
,sum(a.money) money
,count(a.id) num
from (
select o.id
,dc.company
,ifnull((select sum(op.deliverymoney) from order_payment op where o.id=op._order and op.payment not in (0,15,20,21)),0) money
from _order o,`deliverycompany` dc
where o.deliverycompany=dc.id
and o.processstatus in (8009)
{and o.lastprocesstime >=:startDate}
{and o.lastprocesstime <date_add(:endDate,INTERVAL 1 DAY)}
{and o.channel in (:channel)}
{and dc.id in (:company)}
group by o.id
) a group by a.company order by sum(a.money) desc


SELECT 
SUM(o.deliverylistprice) AS 'listprice'
,SUM(o.deliverysaleprice) AS 'saleprice'
,SUM(o.deliveryfee) as 'deliveryfee'
,SUM(o.saleprice + o.deliveryfee) as 'subtotal'
,SUM(o.deliverysaleprice * 0.92) AS 'financprice'
 FROM _order o
WHERE o.processstatus in (8004,8005,8011,8009)
{AND o.deliverytime >= :startDate}
{AND o.deliverytime < ADDDATE(:endDate,INTERVAL 1 DAY)}
{AND o.shop IN (:shop)}
{AND o.channel IN (:channel)}
{and o.paytype in (:payTypes)}
{AND o.transferresult IN (:transfer)}



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
