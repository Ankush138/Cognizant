CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from_acc IN NUMBER,
    p_to_acc IN NUMBER,
    p_amount IN NUMBER
)
AS
    v_balance NUMBER;
BEGIN

    SELECT Balance INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_acc;

    IF v_balance >= p_amount THEN

        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_from_acc;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_to_acc;

        COMMIT;

        DBMS_OUTPUT.PUT_LINE('Transfer successful');

    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient balance');
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Account not found');
END;
/