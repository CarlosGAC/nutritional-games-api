create table if not exists daily_portion
(
    daily_portion_id int not null auto_increment,

    amount smallint,

    recommended_calories_id int,
    pbc_group_id int,

    PRIMARY KEY (daily_portion_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_general_ci;