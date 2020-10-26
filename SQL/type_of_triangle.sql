# Link - https://www.hackerrank.com/challenges/what-type-of-triangle/problem?isFullScreen=true

SELECT IF(A + B > C AND A + C > B AND B + C > A, 
          IF(A = B AND B = C, 'Equilateral', 
          IF(A = B OR B = C OR A = C, 'Isosceles', 
          'Scalene')), 'Not A Triangle') 
FROM TRIANGLES;
