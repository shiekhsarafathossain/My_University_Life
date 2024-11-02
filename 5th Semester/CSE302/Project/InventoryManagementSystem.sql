DROP TABLE InventoryUser CASCADE CONSTRAINTS;
DROP TABLE ProductCategory CASCADE CONSTRAINTS;
DROP TABLE SubCategory CASCADE CONSTRAINTS;
DROP TABLE Customer CASCADE CONSTRAINTS;
DROP TABLE CustomerName CASCADE CONSTRAINTS;
DROP TABLE CustomerPhone CASCADE CONSTRAINTS;
DROP TABLE Orders CASCADE CONSTRAINTS;

CREATE TABLE InventoryUser (
    ID INT PRIMARY KEY,
    Name VARCHAR2(100),
    Email VARCHAR2(100),
    Phone VARCHAR2(15),
    Address VARCHAR2(255),
    DOB DATE,
    role VARCHAR2(20) CHECK (role IN ('admin', 'user')) NOT NULL,
    user_activated number default 0,
    Password VARCHAR(50)
);

INSERT INTO InventoryUser VALUES(1,'Sheikh Sarafat Hossain','sarafat@gmail.com','01746843343','UK','','user',1,'11222');
INSERT INTO InventoryUser VALUES(2,'Sarafat Hossain','sarafat@gmail.com','01746843343','UK','','admin',1,'11222');
INSERT INTO InventoryUser VALUES(3,'Hossain','sarafat@gmail.com','01746843343','UK','','user',1,'11222');
CREATE TABLE ProductCategory (
    C_ID INT PRIMARY KEY,
    C_Name VARCHAR(100) NOT NULL
);

INSERT INTO ProductCategory VALUES(1,'Grocery');
INSERT INTO ProductCategory VALUES(2,'Baby Care');
INSERT INTO ProductCategory VALUES(3,'Stationery');
INSERT INTO ProductCategory VALUES(4,'Cosmetics');
INSERT INTO ProductCategory VALUES(5,'Pet Care');

CREATE TABLE SubCategory (
    C_ID INT,
    S_ID INT PRIMARY KEY,
    S_Name VARCHAR2(100),
    BuyingPrice DECIMAL(10, 2),
    SellingPrice DECIMAL(10, 2),
    Stock NUMBER CHECK( Stock >=0) NOT NULL,
    FOREIGN KEY (C_ID) REFERENCES ProductCategory(C_ID)
);

INSERT INTO SubCategory VALUES(1,101,'Rice',70,80,100);
INSERT INTO SubCategory VALUES(1,102,'Oil',100,120,0);
INSERT INTO SubCategory VALUES(1,103,'Salt',30,40,200);
INSERT INTO SubCategory VALUES(1,104,'Pulse',50,55,2);
INSERT INTO SubCategory VALUES(3,301,'Pen',5,10,35);
INSERT INTO SubCategory VALUES(4,401,'Lipstick',300,500,2);
INSERT INTO SubCategory VALUES(5,501,'Cat Food',800,1000,7);

-- CUSTOMER TABLE --
CREATE TABLE Customer (
    Customer_ID INT PRIMARY KEY,
    Customer_Address VARCHAR2(100),
    MembershipDate DATE DEFAULT SYSDATE
);

INSERT INTO Customer VALUES(01,'Helal Market, Uttarkhan, Dhaka-1230',SYSDATE);
INSERT INTO Customer VALUES(02,'Taltola, Khilgaon, Dhaka-1219',SYSDATE);
INSERT INTO Customer VALUES(03,'Aftab Nagar, Rampura, Dhaka-1218',SYSDATE);
INSERT INTO Customer VALUES(04,'Banasree, Rampura, Dhaka-1218',SYSDATE);

CREATE TABLE CustomerName (
    Customer_ID INT,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    PRIMARY KEY (Customer_ID),
    FOREIGN KEY (Customer_ID) REFERENCES Customer(Customer_ID)
        ON DELETE CASCADE
);

INSERT INTO CustomerName VALUES(01,'Sheikh Sarafat', 'Hossain');
INSERT INTO CustomerName VALUES(02,'Rijia Parveen', 'Raya');
INSERT INTO CustomerName VALUES(03,'Saleh', 'Rafi');
INSERT INTO CustomerName VALUES(04,'Wasibul Rahat', 'Bari');

CREATE TABLE CustomerPhone (
    Customer_ID INT,
    Phone VARCHAR(15),
    PRIMARY KEY (Customer_ID, Phone),
    FOREIGN KEY (Customer_ID) REFERENCES Customer(Customer_ID)
        ON DELETE CASCADE
);

INSERT INTO CustomerPhone VALUES(01,'01147400849');
INSERT INTO CustomerPhone VALUES(02,'01247400849');
INSERT INTO CustomerPhone VALUES(03,'01347400849');
INSERT INTO CustomerPhone VALUES(04,'01447400849');
-- END --

CREATE TABLE Orders (
    Order_ID number PRIMARY KEY,
    S_ID INT,
    Product_Amount DECIMAL(10, 2),
    Customer_ID NUMBER,
    Order_Quantity NUMBER,
    Order_Date  DATE DEFAULT SYSDATE,
    FOREIGN KEY (Customer_ID) REFERENCES Customer(Customer_ID) ON DELETE CASCADE,
    FOREIGN KEY (S_ID) REFERENCES SubCategory(S_ID)ON DELETE CASCADE
);

INSERT INTO Orders VALUES(1,101,80,01,50,SYSDATE);
INSERT INTO Orders VALUES(2,103,40,01,10,SYSDATE);
INSERT INTO Orders VALUES(3,401,500,02,1,SYSDATE);
INSERT INTO Orders VALUES(4,301,10,03,5,SYSDATE);
INSERT INTO Orders VALUES(5,501,1000,04,2,SYSDATE);
INSERT INTO Orders VALUES(6,NULL,80,01,50,SYSDATE);
INSERT INTO Orders VALUES(7,501,80,NULL,50,SYSDATE);
INSERT INTO Orders VALUES(8,501,80,100,50,SYSDATE);
-- 1 --
SELECT * FROM Orders;
-- Customer Table Join View--
CREATE OR REPLACE VIEW Customer_Details AS
SELECT 
    Customer.Customer_ID,
    CustomerName.FirstName,
    CustomerName.LastName,
    Customer.Customer_Address,
    CustomerPhone.Phone,
    MembershipDate
FROM 
    Customer
JOIN 
    CustomerName ON Customer.Customer_ID = CustomerName.Customer_ID
JOIN 
    CustomerPhone ON Customer.Customer_ID = CustomerPhone.Customer_ID;

-- END -- 
SELECT * FROM Customer_Details;


-- 2 --
-- Product VIEW--
CREATE OR REPLACE VIEW Product AS
SELECT
    ProductCategory.C_ID,
    ProductCategory.C_NAME,
    SubCategory.S_ID,
    SubCategory.S_NAME,
    SubCategory.BuyingPrice,
    SubCategory.SellingPrice,
    SubCategory.Stock
FROM ProductCategory Left Join SubCategory ON (ProductCategory.C_ID = SubCategory.C_ID); 
-- END --
SELECT * FROM PRODUCT;

-- 3 --
-- ORDER VIEW --
CREATE OR REPLACE VIEW Order_Details AS
SELECT
    Order_ID,
    Customer_ID,
    S_ID,
    Product_Amount,
    Order_Quantity,
    (Product_Amount * Order_Quantity) AS TotalAmount, -- RAFI
    Order_Date
FROM Orders;
-- END --
SELECT * FROM Order_Details;


CREATE OR REPLACE VIEW Inventory_Manager AS
SELECT *
FROM InventoryUser
WHERE ID NOT IN (SELECT ID
                    FROM InventoryUser   -- RAFI
                    WHERE role = 'admin')
;

SELECT * FROM Inventory_Manager;
-- 4 --
-- Customer_Order --
CREATE OR REPLACE VIEW Customer_Order AS
SELECT
    Orders.Order_ID,
    Orders.Customer_ID,
    Customer_Details.FirstName,
    Customer_Details.LastName,
    Customer_Details.Customer_Address,
    Orders.S_ID,
    Product.S_NAME,
    Orders.Order_Quantity,
    Orders.Product_Amount,
    Orders.Product_Amount * Orders.Order_Quantity AS Total_Amount,  -- RAHAT
    Orders.Order_Date
FROM Orders JOIN Customer_Details ON (Orders.Customer_ID = Customer_Details.Customer_ID)
JOIN Product ON (Orders.S_ID = Product.S_ID);

-- END --

SELECT * FROM Customer_Order;

-- RANDOM CUSTOMER --
CREATE OR REPLACE VIEW Random_Customer AS
SELECT 
    Order_ID,
    S_ID,
    Product_Amount,
    Customer_ID,
    Order_Quantity,
    Order_Date
FROM 
    Orders
WHERE 
    Customer_ID IS NULL 
    OR Customer_ID NOT IN (SELECT Customer_ID FROM Customer); -- Rahat

-- END -- 



-- VIP CUSTOMER VIEW --
CREATE OR REPLACE VIEW VIP_CUSTOMER AS
SELECT 
    Order_ID,
    Customer_ID,
    S_ID,
    Product_Amount,
    Order_Quantity,
    (Product_Amount * Order_Quantity) AS TotalAmount, -- RAYA
    Order_Date
FROM Orders
WHERE (Product_Amount * Order_Quantity) > (
    SELECT AVG(Product_Amount * Order_Quantity) 
    FROM Orders
);
-- END --

-- Old CUSTOMERS VIEW-- 
CREATE OR REPLACE VIEW Old_Customer AS
SELECT 
    Order_ID,
    Customer_ID,
    S_ID,
    Product_Amount,
    Order_Quantity,
    (Product_Amount * Order_Quantity) AS TotalAmount, -- RAYA
    Order_Date
FROM Orders
WHERE Customer_ID IN (
    SELECT Customer_ID 
    FROM Customer 
    WHERE SYSDATE - MembershipDate > 365
);
-- END--

-- Category wise customer --
CREATE OR REPLACE VIEW Category_Customer AS
SELECT 
    Order_ID,
    Customer_ID,
    S_ID,
    Product_Amount,
    Order_Quantity,
    (Product_Amount * Order_Quantity) AS TotalAmount, -- SARAFAT
    Order_Date
FROM Orders
WHERE S_ID IN (
    SELECT S_ID 
    FROM SubCategory 
    WHERE C_ID IN (
        SELECT C_ID 
        FROM ProductCategory 
        WHERE Lower(C_Name) = Lower('Grocery')
    )
);

-- end --
select * from Category_Customer;

-- TOTAL Revenue/Cost/Profit --

CREATE OR REPLACE VIEW Total_Cost AS
SELECT
    Orders.Order_ID,
    Orders.Customer_ID,
    Customer_Details.FirstName,
    Customer_Details.LastName,
    Customer_Details.Customer_Address,
    Orders.S_ID,
    Product.S_NAME,
    Orders.Order_Quantity,
    Orders.Product_Amount,
    Product.BuyingPrice * Orders.Order_Quantity AS Total_Cost,   
    Orders.Order_Date
FROM Orders JOIN Customer_Details ON (Orders.Customer_ID = Customer_Details.Customer_ID)
JOIN Product ON (Orders.S_ID = Product.S_ID);

SELECT * FROM TOTAL_cost;

CREATE OR REPLACE VIEW Total_Profit AS
WITH Revenue AS (
    SELECT SUM(Total_Amount) AS Total_Revenue     -- SARAFAT
    FROM Customer_Order
),
Cost AS (
    SELECT SUM(Total_Cost) AS Total_Cost   -- SARAFAT
    FROM Total_Cost
)
SELECT 
    Revenue.Total_Revenue,
    Cost.Total_Cost,
    Revenue.Total_Revenue - Cost.Total_Cost AS Total_Profit
FROM Revenue, Cost;

-- END --

SELECT * FROM Total_Profit;





    