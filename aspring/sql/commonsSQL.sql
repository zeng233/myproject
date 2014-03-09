
-- exist的用法
select * from t exist;


-- case when用法

-- 自身连接测试
select x.* from sclass x,sclass y
where x.cno=''101'' and x.degree>y.degree and y.sno=''9505201'' and y.cno=''101''
order by x.degree desc
