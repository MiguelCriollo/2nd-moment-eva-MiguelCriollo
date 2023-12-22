CREATE TABLE IF NOT EXISTS students (
  id SERIAL,
  full_name VARCHAR (100) NOT NULL,
  email VARCHAR (100) NOT NULL,
  average DECIMAL (7,2),
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS subject (
  id SERIAL,
  description VARCHAR (100) NOT NULL,
  grade DECIMAL (7,2),
  PRIMARY KEY (id)
);
