create table if not exists pbc_group
(
    pbc_group_id int not null auto_increment,
    name varchar(50) default null,

    PRIMARY KEY (pbc_group_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;