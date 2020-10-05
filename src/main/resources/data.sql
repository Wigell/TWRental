INSERT INTO CAR (NAME, MODEL, PRICE)
VALUES ('Peugeot', '308', 990),
       ('Volkswagen', 'Golf VII', 1290),
       ('Renault', 'Laguna', 1290),
       ('Corvette', 'C8', 4999);


INSERT INTO CUSTOMER (NAME, ADDRESS, PHONE)
VALUES ('Tiger Persson', 'Hermelinvägen 11, 86232 Kvissleby', '0701234567'),
       ('Tomas Wigell', 'Hermelinvägen 11, 86232 Kvissleby', '0701234568'),
       ('Tiffany Person', 'Hipphippgränd 97, 12345 Tomelilla', '0709876543'),
       ('Stanley Paulsson', 'Kizzkingdom 4, 56700, Overthere', '0701112233'),
       ('Tyra Banks', 'Hyllowood road 9, 55544, Hyllowood', '0707778899');


INSERT INTO BOOKING (CUSTOMER_ID, CAR_ID, DATE)
VALUES ('2', '3', '2020-12-12'),
        ('1', '5', '2018-06-04'),
        ('1', '4', '2020-10-11'),
        ('3', '1', '2020-01-07'),
        ('4', '1', '2020-04-02');