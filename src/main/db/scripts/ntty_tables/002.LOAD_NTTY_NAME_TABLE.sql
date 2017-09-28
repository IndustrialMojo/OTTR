INSERT INTO ebdb.OTTR_ATHLETE 
(ID, BIRTH_DATE, NAME_LAST, NAME_MIDDLE, NAME_FIRST, GENDER, CREATE_BY, MODIFY_BY) 
VALUES (
UNHEX(REPLACE(uuid(),'-','')), 
(UNIX_TIMESTAMP('2005-03-30')*1000),
'Bennett', 'Elizabeth', 'Adeline', 'F',
(SELECT ID FROM ebdb.USR_USER a WHERE a.EMAIL = 'spencer.bennett@gmail.com'),
(SELECT ID FROM ebdb.USR_USER a WHERE a.EMAIL = 'spencer.bennett@gmail.com')
);