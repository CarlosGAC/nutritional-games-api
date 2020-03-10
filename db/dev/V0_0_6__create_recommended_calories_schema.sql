create table if not exists recommended_calories
(
    recommended_calories_id int not null auto_increment,
    amount smallint,

    PRIMARY KEY (recommended_calories_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_general_ci;