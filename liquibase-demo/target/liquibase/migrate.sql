SET SEARCH_PATH TO public, "$user","public";

-- Lock Database
UPDATE databasechangeloglock SET LOCKED = TRUE, LOCKEDBY = 'KRISH (192.168.0.93)', LOCKGRANTED = NOW() WHERE ID = 1 AND LOCKED = FALSE;

SET SEARCH_PATH TO public, "$user","public";

SET SEARCH_PATH TO public, "$user","public";

-- *********************************************************************
-- Update Database Script
-- *********************************************************************
-- Change Log: src/main/resources/db/changelog/db.changelog-master.xml
-- Ran at: 17/03/25, 3:52 pm
-- Against: postgres@jdbc:postgresql://localhost:5432/postgres
-- Liquibase version: 4.24.0
-- *********************************************************************

SET SEARCH_PATH TO public, "$user","public";

-- Release Database Lock
SET SEARCH_PATH TO public, "$user","public";

UPDATE databasechangeloglock SET LOCKED = FALSE, LOCKEDBY = NULL, LOCKGRANTED = NULL WHERE ID = 1;

SET SEARCH_PATH TO public, "$user","public";

