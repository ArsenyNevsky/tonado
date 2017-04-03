CREATE TABLE User (
  id         INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  firstname  VARCHAR(50),
  middleName VARCHAR(50)         DEFAULT '',
  lastname   VARCHAR(50),
  email      VARCHAR(80) UNIQUE,
  password   VARCHAR(64),
  active     BOOLEAN,
  role       VARCHAR(15),
  login      VARCHAR(50) UNIQUE,
  lastVisit  DATETIME
);
