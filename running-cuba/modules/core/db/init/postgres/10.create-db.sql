-- begin RUNNINGCUBA_RUNNER
create table RUNNINGCUBA_RUNNER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NOM varchar(255),
    --
    primary key (ID)
)^
-- end RUNNINGCUBA_RUNNER
