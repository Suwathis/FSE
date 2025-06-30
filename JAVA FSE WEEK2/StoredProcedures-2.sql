CREATE TABLE Employees (
    EmployeeID  NUMBER PRIMARY KEY,
    Name        VARCHAR2(100),
    Position    VARCHAR2(50),
    Salary      NUMBER,
    Department  VARCHAR2(50),
    HireDate    DATE
);
INSERT INTO Employees VALUES (1, 'Ravi Kumar', 'Manager', 60000, 'HR', TO_DATE('2020-01-15', 'YYYY-MM-DD'));
INSERT INTO Employees VALUES (2, 'Anita Sharma', 'Developer', 50000, 'IT', TO_DATE('2021-03-20', 'YYYY-MM-DD'));
INSERT INTO Employees VALUES (3, 'Meena Patel', 'Analyst', 55000, 'HR', TO_DATE('2022-06-10', 'YYYY-MM-DD'));
INSERT INTO Employees VALUES (4, 'John Dsouza', 'Tester', 48000, 'QA', TO_DATE('2023-08-05', 'YYYY-MM-DD'));

COMMIT;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    dept_name IN VARCHAR2,
    bonus_pct IN NUMBER
) AS
BEGIN
    
    UPDATE Employees
    SET Salary = Salary + (Salary * bonus_pct / 100)
    WHERE Department = dept_name;

    DBMS_OUTPUT.PUT_LINE('Bonus of ' || bonus_pct || '% applied to department: ' || dept_name);
END;
/
BEGIN
    UpdateEmployeeBonus('HR', 10);
END;
/