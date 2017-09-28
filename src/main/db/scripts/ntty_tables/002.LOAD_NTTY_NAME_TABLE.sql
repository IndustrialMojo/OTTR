INSERT INTO ebdb.NTTY_NAME 
(ID, FIRST, SECOND, THIRD, CREATE_BY, MODIFY_BY) 
VALUES (UNHEX(REPLACE(uuid(),'-','')), 
'Spencer', 'Hill', 'Bennett',
(SELECT ID FROM ebdb.USR_USER a WHERE a.EMAIL = 'spencer.bennett@gmail.com'),
(SELECT ID FROM ebdb.USR_USER a WHERE a.EMAIL = 'spencer.bennett@gmail.com')
);

INSERT INTO ebdb.NTTY_NAME 
(ID, FIRST, SECOND, THIRD, CREATE_BY, MODIFY_BY) 
VALUES (UNHEX(REPLACE(uuid(),'-','')), 
'Adeline', 'Elizabeth', 'Bennett',
(SELECT ID FROM ebdb.USR_USER a WHERE a.EMAIL = 'spencer.bennett@gmail.com'),
(SELECT ID FROM ebdb.USR_USER a WHERE a.EMAIL = 'spencer.bennett@gmail.com')
);
