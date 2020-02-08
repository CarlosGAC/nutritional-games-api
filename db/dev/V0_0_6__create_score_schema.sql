create table if not exists score
(

    score_id int not null auto_increment,
    amount int not null,
    date datetime not null,
    starting_time time,
    ending_time time,
    password varchar(50) not null,
    age smallint(2) not null,
    genre ENUM('M', 'F') not null,

    player_id int,
    game_id int,

    PRIMARY KEY (score_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;