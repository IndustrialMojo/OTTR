INSERT INTO ebdb.NTT_LOCATION (ID, DESCRIPTION, CITY_STATE_ID) 
VALUES (UNHEX(REPLACE(uuid(),'-','')),
'LOAD TEST',
(SELECT ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Saint Paul'));