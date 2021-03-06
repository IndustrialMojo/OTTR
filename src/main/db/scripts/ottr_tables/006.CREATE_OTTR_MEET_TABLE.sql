DROP TABLE IF EXISTS ebdb.OTTR_MEET;
CREATE TABLE ebdb.OTTR_MEET (
	ID INT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
	YYYY YEAR(4) NOT NULL,
	NAME_ID INT UNSIGNED NOT NULL,
	POOL_ID INT UNSIGNED NOT NULL,
	HOST_ID INT UNSIGNED NOT NULL,
	OPPONENT_ID INT UNSIGNED NULL,	
	START_DATE BIGINT(13) UNSIGNED NOT NULL,
	END_DATE BIGINT(13) UNSIGNED NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	CREATE_BY INT UNSIGNED NOT NULL,
	MODIFY_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,
	MODIFY_BY INT UNSIGNED NOT NULL,
	PRIMARY KEY (YYYY, NAME_ID, POOL_ID, HOST_ID, START_DATE, END_DATE),
	FOREIGN KEY (NAME_ID) REFERENCES ebdb.OTTR_MEET_NAME(ID),
	FOREIGN KEY (POOL_ID) REFERENCES ebdb.OTTR_POOL(ID),
	FOREIGN KEY (HOST_ID) REFERENCES ebdb.OTTR_TEAM(ID),
	FOREIGN KEY (OPPONENT_ID) REFERENCES ebdb.OTTR_TEAM(ID),
	FOREIGN KEY (CREATE_BY) REFERENCES ebdb.USR_USER(ID),
	FOREIGN KEY (MODIFY_BY) REFERENCES ebdb.USR_USER(ID)
);