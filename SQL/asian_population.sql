# Link - https://www.hackerrank.com/challenges/asian-population/problem?isFullScreen=true

SELECT 
SUM(C.POPULATION) 
FROM CITY AS C 
JOIN COUNTRY AS CON ON C.COUNTRYCODE = CON.CODE 
WHERE CON.CONTINENT = "Asia";
