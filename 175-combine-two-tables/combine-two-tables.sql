-- Write your PostgreSQL query statement below
select Person.firstName , Person.lastName , Address.city,Address.state from Person
Left Join Address On Person.personId=Address.personId;