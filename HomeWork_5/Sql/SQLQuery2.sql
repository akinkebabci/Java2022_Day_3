--select
select CompanyName Adi,ContactName SirketAdi,City Sehir from Customers 

--Filter
select * from Customers where City ='London'
select * from Products where CategoryID = 1 or CategoryID  = 3
select * from Products where CategoryID = 1 and UnitPrice >= 10

--Order by Gruplama 
select * from Products order by ProductName

select * from Products order by CategoryID,ProductName

select * from Products order by UnitPrice  asc --Ascending(Artan sıralama) Defaultdur

select * from Products order by UnitPrice  desc --descendig(Azalan sırlama) 

select * from Products where CategoryID = 1 order by UnitPrice  desc --descendig(Azalan sırlama) 

select count(*) from Products

select count(*) adet from Products where CategoryID = 1

--Guruplama
select categoryID ,count(*) from Products where UnitPrice>20  

group by CategoryID having count(*)<10


select Products.ProductID ,Products.ProductName,Products.UnitPrice,Categories.CategoryName
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice<20

Select * From Products p left join [Order Details] od
on p.ProductID = od.ProductID

Select * From Customers c left join Orders o 
on c.CustomerID = o.CustomerID
where o.CustomerID is null