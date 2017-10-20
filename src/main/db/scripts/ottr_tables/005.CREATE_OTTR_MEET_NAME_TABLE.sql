DROP TABLE IF EXISTS ebdb.OTTR_MEET_NAME;
CREATE TABLE ebdb.OTTR_MEET_NAME (
	ID INT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
	NAME VARCHAR(65) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL UNIQUE,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	CREATE_BY INT UNSIGNED NOT NULL,
	MODIFY_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,
	MODIFY_BY INT UNSIGNED NOT NULL,
	PRIMARY KEY (NAME),
	FOREIGN KEY (CREATE_BY) REFERENCES ebdb.USR_USER(ID),
	FOREIGN KEY (MODIFY_BY) REFERENCES ebdb.USR_USER(ID)
);