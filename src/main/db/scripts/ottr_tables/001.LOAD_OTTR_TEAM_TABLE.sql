INSERT INTO ebdb.OTTR_TEAM (NAME, LOCATION_ID, CREATE_BY, MODIFY_BY) VALUES (
'OMNI Otters Swim Club',
(SELECT DISTINCT a.ID FROM ebdb.NTT_CITY_STATE a WHERE a.CITY = 'Saint Paul')
(SELECT DISTINCT a.ID FROM ebdb.NTT_LOCATION a, ebdb.NTT_CITY_STATE b WHERE a.CITY_STATE_ID = b.ID AND b.CITY = 'Oakdale'),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));

'Farmington Tigersharks'
'Minneapolis Otters'
'STAR Swim Team'
'Hudson Area Swim Association'
'SEMS Swim Club'
'North Suburban Aquatic Club'