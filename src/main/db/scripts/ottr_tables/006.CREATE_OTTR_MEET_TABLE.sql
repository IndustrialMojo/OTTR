DROP TABLE IF EXISTS ebdb.OTTR_MEET;
CREATE TABLE ebdb.OTTR_MEET (
	ID INT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
	NAME VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL,
	POOL_ID INT UNSIGNED NOT NULL,
	HOST_ID INT UNSIGNED NOT NULL,
	MEET_START_DATE BIGINT(13) UNSIGNED NOT NULL,
	MEET_END_DATE BIGINT(13) UNSIGNED NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	CREATE_BY INT UNSIGNED NOT NULL,
	MODIFY_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,
	MODIFY_BY INT UNSIGNED NOT NULL,
	PRIMARY KEY (NAME, POOL_ID, HOST_ID),
	FOREIGN KEY (POOL_ID) REFERENCES ebdb.OTTR_POOL(ID),
	FOREIGN KEY (HOST_ID) REFERENCES ebdb.OTTR_TEAM(ID),
	FOREIGN KEY (CREATE_BY) REFERENCES ebdb.USR_USER(ID),
	FOREIGN KEY (MODIFY_BY) REFERENCES ebdb.USR_USER(ID)
);