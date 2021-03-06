CREATE TABLE FORUM_SUBCATEGORIES(
 ID NUMBER,
 CONSTRAINT FORUM_SUBCATEGORY_PK PRIMARY KEY(ID),
 ID_CATEGORY NUMBER,
 CONSTRAINT CATEGORY_FK FOREIGN KEY(ID_CATEGORY) REFERENCES FORUM_CATEGORIES(ID),
 TITLE NVARCHAR2(45),
 DESCRIPTION CLOB,
 DATE_SUBCATEGORY TIMESTAMP,
 IP NVARCHAR2(20)
);