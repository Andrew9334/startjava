\echo '--вывод всей таблицы'
SELECT * 
  FROM jaegers;

\echo '--вывод только не уничтоженных роботов'
SELECT * 
  FROM jaegers 
 WHERE status != ('Destroyed');
 
\echo '--вывод роботов серий: Mark-1 и Mark-4'
SELECT * 
  FROM jaegers 
 WHERE mark 
    IN ('Mark-1', 'Mark-4');  

\echo '--вывод всех роботов, кроме Mark-1 и Mark-4'
SELECT * 
  FROM jaegers 
 WHERE mark 
NOT IN ('Mark-1', 'Mark-4'); 

\echo '--сортировка таблицы по убыванию'
  SELECT * 
    FROM jaegers 
ORDER BY mark 
    DESC; 

\echo '--информация о самом старом роботе'
SELECT * 
  FROM jaegers 
 WHERE launch = (SELECT MIN(launch) 
  		   FROM jaegers
		);

\echo '--роботы, которые унитожили больше всех kaiju'
SELECT * 
  FROM jaegers 
 WHERE kaijuKill = (SELECT MAX(kaijuKill) 
  		      FROM jaegers
		   ); 

\echo '--средний вес роботов'
SELECT 
   AVG(weight) 
  FROM jaegers; 

\echo '--увеличение на единицу количества уничтоженных kaiju у роботов, которые до сих пор не разрушены'
UPDATE jaegers 
   SET kaijuKill = kaijuKill + 1 
 WHERE status = 'Active'; 

\echo '--удаление уничтоженных роботов'
DELETE 
  FROM jaegers 
 WHERE status = 'Destroyed'; 
