create table if not exists player
(

    player_id int not null auto_increment,
    name varchar(50) not null,
    password varchar(50) not null,
    age smallint(2) not null,
    genre ENUM('M', 'F') not null,

    recommended_calories_id int,

    PRIMARY KEY (player_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;