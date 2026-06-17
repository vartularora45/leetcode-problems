# Write your MySQL query statement below
Select c.name as Customers  FROM Customers c LEFT JOIN Orders o ON c.id = o.customerId where 
customerId is null 