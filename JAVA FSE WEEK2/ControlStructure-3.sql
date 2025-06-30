CREATE TABLE loan_table (
    loan_id       NUMBER PRIMARY KEY,
    customer_name VARCHAR2(100),
    loan_amount   NUMBER(10,2),
    due_date      DATE
);
INSERT INTO loan_table VALUES (201, 'Ravi Kumar',    50000, SYSDATE + 10);
INSERT INTO loan_table VALUES (202, 'Anita Sharma',  70000, SYSDATE + 5);
INSERT INTO loan_table VALUES (203, 'John Dsouza',   30000, SYSDATE + 40);
INSERT INTO loan_table VALUES (204, 'Meena Patel',   60000, SYSDATE + 25);
INSERT INTO loan_table VALUES (205, 'Suresh Raina',  40000, SYSDATE - 1);
DECLARE
    CURSOR loan_cursor IS
        SELECT loan_id, customer_name, due_date
        FROM loan_table
        WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30;

    v_loan_id       loan_table.loan_id%TYPE;
    v_customer_name loan_table.customer_name%TYPE;
    v_due_date      loan_table.due_date%TYPE;
BEGIN
    OPEN loan_cursor;

    LOOP
        FETCH loan_cursor INTO v_loan_id, v_customer_name, v_due_date;
        EXIT WHEN loan_cursor%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear ' || v_customer_name ||
            ', your loan (ID: ' || v_loan_id ||
            ') is due on ' || TO_CHAR(v_due_date, 'DD-Mon-YYYY') || '. Please make the payment.'
        );
    END LOOP;

    CLOSE loan_cursor;
END;
/