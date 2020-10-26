# Link - https://www.hackerrank.com/challenges/weather-observation-station-12/problem?isFullScreen=true


SELECT DISTINCT CITY FROM STATION WHERE UPPER(LEFT(CITY,1)) NOT IN ('A','E','I','O','U')  AND UPPER(RIGHT(CITY,1)) NOT IN ('A','E','I','O','U') ORDER BY CITY
