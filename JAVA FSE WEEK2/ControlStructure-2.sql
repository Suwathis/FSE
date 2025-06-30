CREATE TABLE c_table (
    customer_id     NUMBER PRIMARY KEY,
    name            VARCHAR2(100),
    age             NUMBER,
    interest_rate   NUMBER(5,2),
    balance NUMBER

);

ALTER TABLE c_table
ADD IsVIP VARCHAR2(5); 


INSERT INTO c_table VALUES (1, 'Ravi Kumar', 65, 10.50,9000);
INSERT INTO c_table VALUES (2, 'Anita Sharma', 59, 9.75,11000);
INSERT INTO c_table VALUES (3, 'John Dsouza', 70, 11.00,15000);
INSERT INTO c_table VALUES (4, 'Meena Patel', 45, 8.90,18000);
INSERT INTO c_table VALUES (5, 'Suresh Raina', 61, 10.00,7000);

COMMIT;
DECLARE
    CURSOR cust_cursor IS
        SELECT customer_id, balance,IsVIP
        FROM c_table;

    v_id  c_table.customer_id%TYPE;
    v_balance c_table.balance%TYPE;
BEGIN
    OPEN cust_cursor;

    LOOP
        FETCH cust_cursor INTO v_id, v_balance;
        EXIT WHEN cust_cursor%NOTFOUND;

        IF v_balance > 10000 THEN
            UPDATE c_table
            SET IsVIP = 'TRUE'
            WHERE customer_id = v_id;
        ELSE
            UPDATE c_table
            SET IsVIP = 'FALSE'
            WHERE customer_id = v_id;
        END IF;
    END LOOP;

    CLOSE cust_cursor;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP status updated successfully.');
END;
/