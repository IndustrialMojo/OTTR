-- SHA-256 generates a 256-bit hash value. You can use CHAR(64) or BINARY(32)
DROP TABLE IF EXISTS ebdb.USR_LOGIN;
CREATE TABLE ebdb.USR_LOGIN (
	ID INT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
	USER_ID INT UNSIGNED NOT NULL,
	PASSWORD BINARY(32) NOT NULL,
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	MODIFY_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,
	PRIMARY KEY (USER_ID),
	FOREIGN KEY (USER_ID) REFERENCES ebdb.USR_USER(ID)
);