DECLARE
    v_age Customers.Age%TYPE;
BEGIN

    FOR c IN (SELECT CustomerID, Age FROM Customers)
    LOOP
        v_age := c.Age;

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = c.CustomerID;
        END IF;

    END LOOP;

    COMMIT;
END;
/