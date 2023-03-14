CREATE DATABASE jaegers;

CREATE TABLE jaegers (
id SERIAL PRIMARY KEY NOT NULL,
modelName TEXT,
mark TEXT,
height INTEGER NOT null, 
weight INTEGER NOT null,
status TEXT,
origin TEXT, 
launch TEXT,
kaijuKill INTEGER);

\i init_db.sql;
\i queries.sql;

DROP TABLE jaegers;
DROP DATABASE jaegers;
