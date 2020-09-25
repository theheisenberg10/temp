-- begin JNJREPOSITORY_STAGING
create table JNJREPOSITORY_STAGING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    API varchar(255) not null,
    DESCRIPTION longvarchar not null,
    OWNER varchar(255) not null,
    DEPARTMENT varchar(255) not null,
    REVISION decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end JNJREPOSITORY_STAGING
-- begin JNJREPOSITORY_MAIN
create table JNJREPOSITORY_MAIN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    API varchar(255) not null,
    DESCRIPTION longvarchar not null,
    OWNER varchar(255) not null,
    DEPARTMENT varchar(255) not null,
    REVISION decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end JNJREPOSITORY_MAIN
