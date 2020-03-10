create table if not exists food_subgroup
(
    subgroup_id int not null auto_increment,
    name varchar(50) default null,

    PRIMARY KEY (subgroup_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_general_ci;