SET SERVEROUTPUT ON;

DECLARE
BEGIN

    FOR l IN (
        SELECT CustomerName, LoanID, DueDate
        FROM Customers c, Loans l
        WHERE c.CustomerID = l.CustomerID
        AND DueDate <= SYSDATE + 30
        AND DueDate >= SYSDATE
    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder for '
            || l.CustomerName
            || ' - Loan '
            || l.LoanID
            || ' due on '
            || l.DueDate
        );

    END LOOP;

END;
/