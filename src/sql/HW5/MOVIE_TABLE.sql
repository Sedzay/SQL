CREATE TABLE MOVIE(
ID NUMBER,
CONSTRAINT ID_PK PRIMARY KEY(ID),
TITLE NVARCHAR2(50)UNIQUE NOT NULL,
DIRECTOR NVARCHAR2(20) NOT NULL,
YEAR NUMERIC(4,0),
CONSTRAINT YEAR_CHECK CHECK(YEAR >= 1900 AND YEAR <= 2019),
LENGTH_MINS NUMBER,
CONSTRAINT LENGTH_MINS_CHECK CHECK(LENGTH_MINS >= 10 AND LENGTH_MINS <= 200)
);