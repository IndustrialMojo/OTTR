DROP TABLE IF EXISTS ebdb.NTT_CITY_STATE;
CREATE TABLE ebdb.NTT_CITY_STATE (
	ID INT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
	CITY VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL,
	STATE VARCHAR(2) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	MODIFY_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,
	PRIMARY KEY (CITY, STATE)
);