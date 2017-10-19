DROP TABLE IF EXISTS ebdb.NTT_LOCATION;
CREATE TABLE ebdb.NTT_LOCATION (
	ID INT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
	DESCRIPTION VARCHAR(75) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' DEFAULT '' NOT NULL,
	ADDRESS_1 VARCHAR(75) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' DEFAULT '' NOT NULL,
	ADDRESS_2 VARCHAR(75) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' DEFAULT '' NOT NULL,
	CITY_STATE_ID INT UNSIGNED NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	MODIFY_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,
	PRIMARY KEY (DESCRIPTION, ADDRESS_1, ADDRESS_2, CITY_STATE_ID),
	FOREIGN KEY (CITY_STATE_ID) REFERENCES ebdb.NTT_CITY_STATE(ID)
);