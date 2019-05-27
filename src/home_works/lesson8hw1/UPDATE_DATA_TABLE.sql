--- Удаляет последние три колонки из таблицы Employees
ALTER TABLE EMPLOYEES
DROP COLUMN PHOTO;

ALTER TABLE EMPLOYEES
DROP COLUMN NOTES;

ALTER TABLE EMPLOYEES
DROP COLUMN REPORTS_TO;

--- Измененяет PK таблицы Suppliers с SupplierID на Phone
ALTER TABLE SUPPLIERS
DROP CONSTRAINT SUPPLIER_PK;

ALTER TABLE SUPPLIERS
ADD CONSTRAINT PK_PHONE PRIMARY KEY(PHONE);

--- Добавляет в таблицу Customers колонку IS_ACTIVE, которая должна принимать одно из двух значений - 0 или 1 и не быть пустой
ALTER TABLE CUSTOMERS
ADD IS_ACTIVE NUMBER(1) NOT NULL CHECK(IS_ACTIVE IN (0,1));

--- Обновите длину поля Picture в таблице Categories до 100 символов
ALTER TABLE CATEGORIES
MODIFY PICTURE NVARCHAR2(100);