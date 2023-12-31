# Write your MySQL query statement below
select P.product_id,
ifnull(round(sum(P.price * U.units) * 1.0 / sum(U.units), 2),0) as "average_price"
from Prices P
left join UnitsSold U
on U.product_id = P.product_id
and (U.purchase_date between P.start_date and P.end_date)
or u.purchase_date is null
group by P.product_id;
