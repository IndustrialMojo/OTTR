INSERT INTO ebdb.USR_USER 
(ID, EMAIL) 
VALUES (
UNHEX(REPLACE(uuid(),'-','')),
'spencer.bennett@gmail.com'
);