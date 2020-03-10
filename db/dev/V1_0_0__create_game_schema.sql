create table if not exists game
(

    game_id int not null auto_increment,
    name varchar(50) not null,
    max_score int not null,

    PRIMARY KEY (game_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_general_ci;