select name as Customers
from Customers
where id not in (select CustomerId from Orders);