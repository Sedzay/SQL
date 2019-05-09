-- количество фильмов снятых каждым режисером (Director)
SELECT DIRECTOR, COUNT(*) FROM  MOVIE
GROUP BY DIRECTOR;

-- количество DOMESTIC_SALES и INTERNATIONAL_SALES для каждого режиссера (Director)
SELECT DIRECTOR, SUM(DOMESTIC_SALES), SUM(DOMESTIC_SALES) FROM MOVIE, MOVIE_STAT
WHERE ID = MOVIE_STAT.MOVIE_ID
GROUP BY DIRECTOR