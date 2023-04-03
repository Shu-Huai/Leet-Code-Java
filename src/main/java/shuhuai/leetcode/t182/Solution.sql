select Email
from (select Email, count(email) as times
      from Person
      group by Email) as a
where times > 1;
select Email
from Person
group by Email
having count(Email) > 1;