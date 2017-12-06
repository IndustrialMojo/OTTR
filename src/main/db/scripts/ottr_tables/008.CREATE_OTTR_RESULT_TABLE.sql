DROP TABLE IF EXISTS ebdb.OTTR_RESULT;
CREATE TABLE ebdb.OTTR_RESULT (
	ID INT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
	RESULT DECIMAL(6, 2) UNSIGNED NOT NULL,
	EVENT_DATE BIGINT(13) UNSIGNED NOT NULL,
	EVENT_ID INT UNSIGNED NOT NULL,
	MEET_ID INT UNSIGNED NOT NULL,
	ROSTER_ENTRY_ID INT UNSIGNED NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CREATE_BY INT UNSIGNED NOT NULL,
	MODIFY_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	MODIFY_BY INT UNSIGNED NOT NULL,
	PRIMARY KEY (EVENT_DATE, EVENT_ID, MEET_ID, ROSTER_ENTRY_ID),
	FOREIGN KEY (EVENT_ID) REFERENCES ebdb.OTTR_EVENT(ID),
	FOREIGN KEY (MEET_ID) REFERENCES ebdb.OTTR_MEET(ID),
	FOREIGN KEY (ROSTER_ENTRY_ID) REFERENCES ebdb.OTTR_ATHLETE(ID),
	FOREIGN KEY (CREATE_BY) REFERENCES ebdb.USR_USER(ID),
	FOREIGN KEY (MODIFY_BY) REFERENCES ebdb.USR_USER(ID)
);