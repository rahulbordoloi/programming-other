# Link - https://www.hackerrank.com/challenges/average-population-of-each-continent/problem?

SELECT 
CON.CONTINENT, FLOOR(AVG(C.POPULATION))
FROM CITY AS C 
JOIN COUNTRY AS CON ON C.COUNTRYCODE = CON.CODE 
GROUP BY CON.CONTINENT;
