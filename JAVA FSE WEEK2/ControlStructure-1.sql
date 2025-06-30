CREATE TABLE cus_table (
    customer_id     NUMBER PRIMARY KEY,
    name            VARCHAR2(100),
    age             NUMBER,
    interest_rate   NUMBER(5,2)  -- e.g., 10.50%
);
INSERT INTO cus_table VALUES (1, 'Ravi Kumar', 65, 10.50);
INSERT INTO cus_table VALUES (2, 'Anita Sharma', 59, 9.75);
INSERT INTO cus_table VALUES (3, 'John Dsouza', 70, 11.00);
INSERT INTO cus_table VALUES (4, 'Meena Patel', 45, 8.90);
INSERT INTO cus_table VALUES (5, 'Suresh Raina', 61, 10.00);

COMMIT;
DECLARE
    -- Cursor to select all customers
    CURSOR cust_cursor IS
        SELECT customer_id, age, interest_rate
        FROM cus_table;

    -- Variables to hold customer data
    v_id cus_table.customer_id%TYPE;
    v_age cus_table.age%TYPE;
    v_rate cus_table.interest_rate%TYPE;
BEGIN
    -- Open cursor
    OPEN cust_cursor;

    LOOP
        -- Fetch one row at a time
        FETCH cust_cursor INTO v_id, v_age, v_rate;
        EXIT WHEN cust_cursor%NOTFOUND;

        -- Check if age > 60
        IF v_age > 60 THEN
            -- Apply 1% discount (reduce interest rate by 1%)
            UPDATE cus_table
            SET interest_rate = interest_rate - 1
            WHERE customer_id = v_id;
        END IF;
    END LOOP;

    -- Close cursor
    CLOSE cust_cursor;

    -- Show completion message
    DBMS_OUTPUT.PUT_LINE('Discount applied to eligible customers.');
END;
/