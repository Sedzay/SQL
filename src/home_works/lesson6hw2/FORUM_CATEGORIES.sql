CREATE TABLE FORUM_CATEGORIES(
 ID NUMBER,
 CONSTRAINT FORUM_CATEGORY_PK PRIMARY KEY(ID),
 TITLE NVARCHAR2(64),
 DESCRIPTION CLOB,
 DATE_CATEGORY TIMESTAMP,
 IP NVARCHAR2(20)
);