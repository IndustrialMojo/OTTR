INSERT INTO ebdb.OTTR_ATHLETE (PERSON_ID, CREATE_BY, MODIFY_BY) VALUES (
(SELECT DISTINCT a.ID FROM ebdb.NTT_PERSON a LIMIT 1 OFFSET 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1),
(SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1));