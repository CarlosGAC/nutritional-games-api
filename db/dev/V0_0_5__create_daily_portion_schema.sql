create table if not exists daily_portion
(
    daily_portion_id int not null auto_increment,

    amount smallint,

    recommended_calories_id int,
    pbc_group_id_ int,

    PRIMARY KEY (daily_portion_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;