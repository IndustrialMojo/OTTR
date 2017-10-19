ALTER TABLE ebdb.NTT_NAME ADD COLUMN CREATE_BY INT UNSIGNED NOT NULL AFTER CREATE_DATE;
UPDATE ebdb.NTT_NAME SET CREATE_BY = (SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1); 
ALTER TABLE ebdb.NTT_NAME ADD CONSTRAINT FOREIGN KEY (CREATE_BY) REFERENCES ebdb.USR_USER(ID);

ALTER TABLE ebdb.NTT_NAME ADD COLUMN MODIFY_BY INT UNSIGNED NOT NULL AFTER MODIFY_DATE;
UPDATE ebdb.NTT_NAME SET MODIFY_BY = (SELECT DISTINCT a.ID FROM ebdb.USR_USER a LIMIT 1); 
ALTER TABLE ebdb.NTT_NAME ADD CONSTRAINT FOREIGN KEY (MODIFY_BY) REFERENCES ebdb.USR_USER(ID);