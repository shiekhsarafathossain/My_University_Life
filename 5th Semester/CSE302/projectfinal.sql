DROP TABLE InventoryUser cascade constraints;
DROP TABLE ProductCategory cascade constraints;
DROP TABLE SubCategory cascade constraints;
DROP TABLE Customer cascade constraints;
DROP TABLE Orders cascade constraints;
DROP TABLE Transactions cascade constraints;
DROP TABLE Bill cascade constraints;
DROP TABLE CustomerName CASCADE CONSTRAINTS;
DROP TABLE Customer CASCADE CONSTRAINTS;
DROP TABLE CustomerPhone CASCADE CONSTRAINTS;
drop view Product;
drop view TOTAL_ORDER;
drop view PHONE_NUMBER;
drop view TOTAL_PURCHASE_AMOUNT;
drop view TOTAL_TRANS_VAT;
drop view CUSTOMER_TABLE;
-- Inventory User --
CREATE TABLE InventoryUser (
    ID INT PRIMARY KEY,
    Name VARCHAR2(100),
    Email VARCHAR2(100),
    Phone VARCHAR2(15),
    Address VARCHAR2(255),
    DOB DATE,
    role VARCHAR2(20) CHECK (role IN ('admin', 'user')) NOT NULL,
    Password VARCHAR(50)
);
INSERT INTO InventoryUser VALUES(101,'SARAFAT','SARAFATGMAIL.COM','01445400607','UTTARKHAN DHAKA',to_date('22-12-2002','dd-mm-yyyy'),'admin','12345478');
INSERT INTO InventoryUser VALUES(103,'Rafi','RAfiGMAIL.COM','','UTTARKHAN DHAKA',to_date('22-12-2002','dd-mm-yyyy'),'admin','12345478');
select * from InventoryUser;
-- END --

CREATE VIEW PHONE_NUMBER AS
SELECT *
FROM InventoryUser
WHERE ID IN (
    SELECT ID
    FROM InventoryUser
    WHERE Phone IS NOT NULL -- 1
);

SELECT * FROM PHONE_NUMBER;


CREATE TABLE ProductCategory (
    C_ID INT PRIMARY KEY,
    C_Name VARCHAR(100) NOT NULL
);

CREATE TABLE SubCategory (
    C_ID INT,
    S_ID INT PRIMARY KEY,
    S_Name VARCHAR2(100),
    BuyingPrice DECIMAL(10, 2),
    SellingPrice DECIMAL(10, 2),
    QUANTITY NUMBER CHECK( QUANTITY >=0) NOT NULL,
    FOREIGN KEY (C_ID) REFERENCES ProductCategory(C_ID)
);
INSERT INTO ProductCategory VALUES(101,'Grocery');
INSERT INTO ProductCategory VALUES(102,'Soap');
INSERT INTO SUBCATEGORY VALUES(102,1000,'LUX',15,20,5);
INSERT INTO SUBCATEGORY VALUES(101,1200,'PULSE',60,100,12);


-- Subcategory and product category join --
CREATE VIEW PRODUCT AS
SELECT PC.C_ID,PC.C_Name, 
       (SELECT SUM(SB.QUANTITY) 
        FROM SubCategory SB 
        WHERE SB.C_ID = PC.C_ID) AS Total_Quantity -- 2
FROM ProductCategory PC;

SELECT * FROM PRODUCT; -- TO SEE VIEW

-- end --
-- sub categroy --
select * from SUBCATEGORY;
--end --
DROP TABLE CustomerName CASCADE CONSTRAINTS;
DROP TABLE Customer CASCADE CONSTRAINTS;
DROP TABLE CustomerPhone CASCADE CONSTRAINTS;
-- Customer table with non-composite and single-valued attributes
CREATE TABLE Customer (
    Customer_ID INT PRIMARY KEY,
    MembershipDate DATE DEFAULT SYSDATE
);

-- CustomerName table for the composite attribute Name
CREATE TABLE CustomerName (
    Customer_ID INT,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    PRIMARY KEY (Customer_ID),
    FOREIGN KEY (Customer_ID) REFERENCES Customer(Customer_ID)
        ON DELETE CASCADE
);

-- CustomerPhone table for the multivalued attribute Phone
CREATE TABLE CustomerPhone (
    Customer_ID INT,
    Phone VARCHAR(15),
    PRIMARY KEY (Customer_ID, Phone),
    FOREIGN KEY (Customer_ID) REFERENCES Customer(Customer_ID)
        ON DELETE CASCADE
);


INSERT INTO CUSTOMER VALUES(1,SYSDATE);
INSERT INTO CustomerName VALUES (1, 'Sheikh', 'Sarafat Hossain');
INSERT INTO CustomerPhone VALUES(1, '01627400607');

drop view CUSTOMER_TABLE;
-- Customer join --
CREATE VIEW CUSTOMER_TABLE AS
SELECT 
    c.Customer_ID,
    cn.FirstName,
    cn.LastName,
    cp.Phone,
    c.MembershipDate
FROM 
    Customer c
JOIN 
    CustomerName cn ON c.Customer_ID = cn.Customer_ID -- 3
LEFT JOIN 
    CustomerPhone cp ON c.Customer_ID = cp.Customer_ID;
    
-- end -- 
SELECT * FROM CUSTOMER_TABLE;
-- ORDERS --
CREATE TABLE Orders (
    Order_ID number PRIMARY KEY,
    S_ID INT,
    TotalAmount DECIMAL(10, 2),
    Customer_ID number,
    FOREIGN KEY (Customer_ID) REFERENCES Customer(Customer_ID) ON DELETE CASCADE,
    FOREIGN KEY (S_ID) REFERENCES SubCategory(S_ID)ON DELETE CASCADE
);
SELECT * FROM ORDERS;

INSERT INTO ORDERS VALUES(101,1200,100.00,1);
INSERT INTO ORDERS VALUES(102,1000,20.00,1);

DELETE FROM ORDERS
WHERE ORDER_ID = 101;
-- end --
drop view TOTAL_ORDER;

CREATE VIEW TOTAL_ORDER AS
SELECT C.*,
       (SELECT COUNT(*) 
        FROM Orders 
        WHERE Customer_ID = C.Customer_ID) AS TotalOrders -- 4
FROM CUSTOMER_TABLE C;

SELECT * FROM TOTAL_ORDER;

DROP VIEW TOTAL_PURCHASE_AMOUNT;

-- TOTAL PURCHASE VIEW --
CREATE VIEW TOTAL_PURCHASE_AMOUNT AS 
SELECT 
    c.Customer_ID,
    c.FirstName,
    c.LastName,
    (SELECT SUM(TotalAmount) FROM Orders WHERE Orders.Customer_ID = c.Customer_ID) AS Total_Purchase_Amount -- 5
FROM 
    CUSTOMER_TABLE c;
-- END --
SELECT * FROM TOTAL_PURCHASE_AMOUNT; -- TOTAL PURCHASE VIEW

-- bill --

CREATE TABLE Bill ( 
    Bill_ID number PRIMARY KEY,
    BILL_DATE TIMESTAMP DEFAULT SYSTIMESTAMP,
    Order_ID number,
    VAT number,
    Discount number,
    Quantity number,
    FOREIGN KEY (Order_ID) REFERENCES Orders(Order_ID) ON DELETE CASCADE
);

insert into bill values(1011,SYSTIMESTAMP,101,33,44,5);

select * from bill;
-- bill end --


CREATE TABLE Transactions(
    TRANS_ID number PRIMARY KEY,
    Bill_ID number,
    DATES  DATE DEFAULT SYSDATE,
    FOREIGN KEY (Bill_ID) REFERENCES BILL(Bill_ID)
);

drop view TOTAL_TRANS_VAT;
-- total transactions and total VAT for each bill --
CREATE VIEW TOTAL_TRANS_VAT AS
SELECT 
    b.Bill_ID,
    b.BILL_DATE,
    b.Order_ID,
    b.VAT,
    b.Discount,
    b.Quantity,
    (SELECT COUNT(*) FROM Transactions t WHERE t.Bill_ID = b.Bill_ID) AS Total_Transactions, -- 6
    (SELECT SUM(b2.VAT) FROM Bill b2 WHERE b2.Bill_ID = b.Bill_ID) AS Total_VAT,
    (SELECT SUM(b3.Discount) FROM Bill b3 WHERE b3.Bill_ID = b.Bill_ID) AS Total_Discount
FROM 
    Bill b;

select * from TOTAL_TRANS_VAT;





