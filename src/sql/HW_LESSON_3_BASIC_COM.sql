--INSERT orders fields
INSERT INTO ORDERS
VALUES(1001, 'test1', 140, TO_DATE('2017/05/03 21:02:44', 'yyyy/mm//dd hh24:mi:ss'), TO_DATE('2017/05/03 23:02:44', 'yyyy/mm//dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1002, 'test2', 140, TO_DATE('2017/05/03 21:02:44', 'yyyy/mm//dd hh24:mi:ss'), TO_DATE('2017/05/03 23:02:44', 'yyyy/mm//dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1003, 'test3', 140, TO_DATE('2017/05/03 21:02:44', 'yyyy/mm//dd hh24:mi:ss'), TO_DATE('2017/05/03 23:02:44', 'yyyy/mm//dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1004, 'test4', 222, TO_DATE('2016/05/03 21:02:44', 'yyyy/mm//dd hh24:mi:ss'), TO_DATE('2016/05/03 23:02:44', 'yyyy/mm//dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1005, 'test5', 150, TO_DATE('2016/05/03 21:02:44', 'yyyy/mm//dd hh24:mi:ss'), TO_DATE('2016/05/03 23:02:44', 'yyyy/mm//dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1006, 'test6', 170, TO_DATE('2016/05/03 21:02:44', 'yyyy/mm//dd hh24:mi:ss'), TO_DATE('2016/05/03 23:02:44', 'yyyy/mm//dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1007, 'test7', 300, TO_DATE('2016/05/03 21:02:44', 'yyyy/mm//dd hh24:mi:ss'), TO_DATE('2016/05/03 23:02:44', 'yyyy/mm//dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1008, 'test8', 1500, TO_DATE('2016/05/03 21:02:44', 'yyyy/mm//dd hh24:mi:ss'), TO_DATE('2016/05/03 23:02:44', 'yyyy/mm//dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1009, 'test9', 10, TO_DATE('2016/05/03 21:02:44', 'yyyy/mm//dd hh24:mi:ss'), TO_DATE('2016/05/03 23:02:44', 'yyyy/mm//dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1010, 'test10', 1, TO_DATE('2016/05/03 21:02:44', 'yyyy/mm//dd hh24:mi:ss'), TO_DATE('2016/05/03 23:02:44', 'yyyy/mm//dd hh24:mi:ss'));

--INSERT product fields
INSERT INTO PRODUCT
VALUES(1001, 'candy', 'test1', 10);

INSERT INTO PRODUCT
VALUES(1002, 't-shirt', 'china11', 20);

INSERT INTO PRODUCT
VALUES(1003, 'candy', 'test1', 30);

INSERT INTO PRODUCT
VALUES(1004, 'prod4', 'manname4', 40);

INSERT INTO PRODUCT
VALUES(1005, 'toy123', 'manname5', 50);

INSERT INTO PRODUCT
VALUES(1006, 'prod6', 'manname6', 60);

INSERT INTO PRODUCT
VALUES(1007, 'prod7', 'manname7', 70);

INSERT INTO PRODUCT
VALUES(1008, 'prod8', 'manname8', 80);

INSERT INTO PRODUCT
VALUES(1009, 'prod9', 'manname9', 90);

INSERT INTO PRODUCT
VALUES(1010, 'prod10', 'someMANUFACTURER', 100);

--SELECT
SELECT * FROM PRODUCT WHERE COST_PRICE = 50 AND NAME = 'toy123';
SELECT * FROM PRODUCT WHERE ID = 1005 OR COST_PRICE < 50;
SELECT * FROM PRODUCT WHERE ID > 1005 AND MANUFACTURER_NAME = 'someMANUFACTURER';
SELECT * FROM PRODUCT;

--UPDATE
UPDATE PRODUCT SET MANUFACTURER_NAME = 'china' WHERE NAME = 't-shirt';

DELETE FROM PRODUCT
WHERE ID < 1050;