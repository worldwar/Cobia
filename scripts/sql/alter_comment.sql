ALTER TABLE `COMMENT`
	ADD COLUMN `RECEIVER` VARCHAR(16) NULL AFTER `TARGET_TYPE`;

ALTER TABLE `COMMENT`
	CHANGE COLUMN `TARGET_TYPE` `TYPE` INT(11) NULL DEFAULT NULL AFTER `TARGET`;