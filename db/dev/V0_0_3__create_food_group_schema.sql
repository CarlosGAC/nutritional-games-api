create table if not exists food_group
(
    group_id int not null auto_increment,
    name varchar(50) default null,

    pbc_group_id int,

    PRIMARY KEY (group_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_general_ci;