CREATE TABLE Accounts (
    AccountID      NUMBER PRIMARY KEY,
    CustomerID     NUMBER,
    AccountType    VARCHAR2(20),
    Balance        NUMBER(10, 2),
    LastModified   DATE
);
INSERT INTO Accounts VALUES (101, 1, 'Savings', 10000, SYSDATE);
INSERT INTO Accounts VALUES (102, 2, 'Savings', 15000, SYSDATE);
INSERT INTO Accounts VALUES (103, 3, 'Current', 20000, SYSDATE);  

COMMIT;
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01),
        LastModified = SYSDATE
    WHERE AccountType = 'Savings';

    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all savings accounts.');
END;
/
BEGIN
    ProcessMonthlyInterest;
END;
/
SELECT * FROM Accounts;