SELECT a.query_name,
       ROUND(AVG(rating / position), 2) AS quality,
       ROUND(AVG(IF(rating < 3, 1, 0)) * 100, 2) AS poor_query_percentage
FROM Queries AS a
WHERE a.query_name IS NOT NULL
GROUP BY a.query_name;

