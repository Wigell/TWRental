DROP TABLE IF EXISTS CUSTOMER;

CREATE TABLE CUSTOMER (
                               id INT AUTO_INCREMENT  PRIMARY KEY,
                               name VARCHAR(250) NOT NULL,
                               address VARCHAR(250) NOT NULL,
                               phone VARCHAR(250) DEFAULT NULL
);

DROP TABLE IF EXISTS CAR;

CREATE TABLE CAR (
                          id INT AUTO_INCREMENT  PRIMARY KEY,
                          name VARCHAR(250) NOT NULL,
                          model VARCHAR(250) NOT NULL,
                          price DOUBLE(250) DEFAULT NULL
);