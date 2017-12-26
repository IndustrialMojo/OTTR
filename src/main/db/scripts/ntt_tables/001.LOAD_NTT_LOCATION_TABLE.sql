INSERT INTO ebdb.NTT_LOCATION (CITY_STATE_ID) 
VALUES ((SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Saint Paul'));

INSERT INTO ebdb.NTT_LOCATION (CITY_STATE_ID) 
VALUES ((SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Maplewood'));

INSERT INTO ebdb.NTT_LOCATION (CITY_STATE_ID) 
VALUES ((SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Oakdale'));

INSERT INTO ebdb.NTT_LOCATION (CITY_STATE_ID) 
VALUES ((SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Hastings'));

INSERT INTO ebdb.NTT_LOCATION (CITY_STATE_ID) 
VALUES ((SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Farmington'));

INSERT INTO ebdb.NTT_LOCATION (CITY_STATE_ID) 
VALUES ((SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Hudson'));

INSERT INTO ebdb.NTT_LOCATION (CITY_STATE_ID) 
VALUES ((SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Inver Grove Heights'));

INSERT INTO ebdb.NTT_LOCATION (CITY_STATE_ID) 
VALUES ((SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'South Saint Paul'));

INSERT INTO ebdb.NTT_LOCATION (CITY_STATE_ID) 
VALUES ((SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'North Oaks'));

INSERT INTO ebdb.NTT_LOCATION (CITY_STATE_ID) 
VALUES ((SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Minneapolis'));

INSERT INTO ebdb.NTT_LOCATION (CITY_STATE_ID) 
VALUES ((SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Woodbury'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Saint Catherine University',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Saint Paul'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Skyview Community School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Oakdale'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Hamline University',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Saint Paul'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Hastings High School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Hastings'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Henry Sibley High School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Mendota Heights'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Hill-Murray School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Maplewood'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Mahtomedi High School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Mahtomedi'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'North High School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'North Saint Paul'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Simley High School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Inver Grove Heights'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'South Saint Paul High School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'South Saint Paul'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Tartan High School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Oakdale'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Levi Dodge Middle School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Farmington'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Hudson Middle School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Hudson'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Central Square Community Center',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'South Saint Paul'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Hastings Middle School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Hastings'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Heritage Middle School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'West Saint Paul'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Maplewood Middle School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Maplewood'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'Veterans Memorial Community Center',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Inver Grove Heights'));

INSERT INTO ebdb.NTT_LOCATION (DESCRIPTION, CITY_STATE_ID) VALUES (
'White Bear Lake High School',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'White Bear Lake'));