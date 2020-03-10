create table if not exists score
(

    score_id int not null auto_increment,
    amount int not null,
    date date not null,
    starting_time time,
    ending_time time,

    player_id int,
    game_id int,

    PRIMARY KEY (score_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_general_ci;