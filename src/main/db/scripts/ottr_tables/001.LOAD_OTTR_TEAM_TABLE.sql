INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'OMNI Otters Swim Club',
'Otters',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a, ebdb.NTT_CITY_STATE b WHERE a.CITY_STATE_ID = b.ID AND b.CITY = 'Oakdale' AND a.DESCRIPTION = ''),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'Tigersharks Swim Club',
'Tigersharks',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a, ebdb.NTT_CITY_STATE b WHERE a.CITY_STATE_ID = b.ID AND b.CITY = 'Farmington' AND a.DESCRIPTION = ''),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'Otters Swim Team',
'Otters',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a, ebdb.NTT_CITY_STATE b WHERE a.CITY_STATE_ID = b.ID AND b.CITY = 'Minneapolis' AND a.DESCRIPTION = ''),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'STAR Swim Team',
'',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a, ebdb.NTT_CITY_STATE b WHERE a.CITY_STATE_ID = b.ID AND b.CITY = 'Saint Paul' AND a.DESCRIPTION = ''),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'Hudson Area Swim Association',
'Sharks',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a, ebdb.NTT_CITY_STATE b WHERE a.CITY_STATE_ID = b.ID AND b.CITY = 'Hudson' AND a.DESCRIPTION = ''),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'South East Metro Sharks Swim Club',
'Sharks',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a, ebdb.NTT_CITY_STATE b WHERE a.CITY_STATE_ID = b.ID AND b.CITY = 'Woodbury' AND a.DESCRIPTION = ''),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'North Suburban Aquatic Club',
'Mako Sharks',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a, ebdb.NTT_CITY_STATE b WHERE a.CITY_STATE_ID = b.ID AND b.CITY = 'North Oaks' AND a.DESCRIPTION = ''),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'Hill-Murray',
'Pioneers',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a WHERE a.DESCRIPTION = 'Hill-Murray School'),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'Hastings',
'Raiders',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a WHERE a.DESCRIPTION = 'Hastings High School'),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'Henry Sibley',
'Warriors',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a WHERE a.DESCRIPTION = 'Henry Sibley High School'),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'Mahtomedi',
'Zephyrs',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a WHERE a.DESCRIPTION = 'Mahtomedi High School'),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'North',
'Polars',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a WHERE a.DESCRIPTION = 'North High School'),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'Simley',
'Spartans',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a WHERE a.DESCRIPTION = 'Simley High School'),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'South Saint Paul',
'Packers',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a WHERE a.DESCRIPTION = 'South Saint Paul High School'),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

INSERT INTO ebdb.OTTR_TEAM (NAME, NICKNAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'Tartan',
'Titans',
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a WHERE a.DESCRIPTION = 'Tartan High School'),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));
