create table if not exists food
(
    food_id int not null auto_increment,
    name varchar(50) default null,
    image varchar(70) default null,
    measure varchar(70) default null,
    portion_amount smallint,
    calories smallint,

    subgroup_id int,
    group_id int,

    PRIMARY KEY (food_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_general_ci;