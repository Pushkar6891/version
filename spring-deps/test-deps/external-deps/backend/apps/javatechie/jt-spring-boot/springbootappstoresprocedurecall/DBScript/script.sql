# Manually Create below stored procedure in mysql

CREATE PROCEDURE `getTickets` ()
BEGIN
select * FROM Ticket;
END

CREATE PROCEDURE `getTicketsByCategory` (in tcategory varchar(20))
BEGIN
select * FROM Ticket where category=tcategory;
END