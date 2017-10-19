DROP TABLE IF EXISTS ebdb.OTTR_EVENT;
CREATE TABLE ebdb.OTTR_EVENT (
	ID INT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
	DISTANCE CHAR(1) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL,
	UNITS CHAR(1) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL,
	STROKE CHAR(1) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL,
	IS_RELAY CHAR(1) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL DEFAULT 'N',
	COURSE_TYPE CHAR(1) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	CREATE_BY INT UNSIGNED NOT NULL,
	MODIFY_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,
	MODIFY_BY INT UNSIGNED NOT NULL,
	PRIMARY KEY (DISTANCE, UNITS, STROKE, IS_RELAY, COURSE_TYPE),
	FOREIGN KEY (CREATE_BY) REFERENCES ebdb.USR_USER(ID),
	FOREIGN KEY (MODIFY_BY) REFERENCES ebdb.USR_USER(ID)
);