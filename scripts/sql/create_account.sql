create table ACCOUNT(
    CODE VARCHAR(16) PRIMARY KEY,
    EMAIL VARCHAR(64) UNIQUE,
    PASSWORD VARCHAR(64)
)