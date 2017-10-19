DROP TABLE IF EXISTS ebdb.OTTR_RESULT;
CREATE TABLE ebdb.OTTR_RESULT (
	ID INT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
	RESULT INT UNSIGNED NOT NULL,
	MEET_ID INT UNSIGNED NOT NULL,
	EVENT_ID INT UNSIGNED NOT NULL,
	ATHLETE_ID INT UNSIGNED NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CREATE_BY INT UNSIGNED NOT NULL,
	MODIFY_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	MODIFY_BY INT UNSIGNED NOT NULL,
	PRIMARY KEY (MEET_ID, EVENT_ID, ATHLETE_ID),
	FOREIGN KEY (MEET_ID) REFERENCES ebdb.OTTR_MEET(ID),
	FOREIGN KEY (EVENT_ID) REFERENCES ebdb.OTTR_EVENT(ID),
	FOREIGN KEY (ATHLETE_ID) REFERENCES ebdb.OTTR_ATHLETE(ID),
	FOREIGN KEY (CREATE_BY) REFERENCES ebdb.USR_USER(ID),
	FOREIGN KEY (MODIFY_BY) REFERENCES ebdb.USR_USER(ID)
);