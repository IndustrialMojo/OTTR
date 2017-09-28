DROP TABLE IF EXISTS ebdb.OTTR_EVENT;
CREATE TABLE ebdb.OTTR_EVENT (
	ID BINARY(16) NOT NULL,
	DISTANCE VARCHAR(1) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL,
	UNITS VARCHAR(1) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL,
	STROKE VARCHAR(1) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL,
	IS_RELAY VARCHAR(1) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL DEFAULT 'N',
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CREATE_BY BINARY(16) NOT NULL,
	MODIFY_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	MODIFY_BY BINARY(16) NOT NULL,
	PRIMARY KEY (ID),
	FOREIGN KEY (CREATE_BY) REFERENCES ebdb.USR_USER(ID),
	FOREIGN KEY (MODIFY_BY) REFERENCES ebdb.USR_USER(ID)
);