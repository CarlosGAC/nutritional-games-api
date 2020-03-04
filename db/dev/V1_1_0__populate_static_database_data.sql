INSERT INTO pbc_group (pbc_group_id, name)
VALUES	(1, 'Frutas y verduras'),
          (2, 'Cereales'),
          (3, 'Alimentos de origen animal y leguminosas'),
          (4, 'Grasas');

INSERT INTO food_group (group_id, name, pbc_group_id)
VALUES	(1, 'Frutas', 1),
          (2, 'Verduras', 1),
          (3, 'Cereales sin grasa', 2),
          (4, 'Cereales con grasa/azucar', 2),
          (5, 'Leguminosas', 3),
          (6, 'Leche', 3),
          (7, 'Queso', 3),
          (8, 'Pescados y mariscos', 3),
          (9, 'Aves', 3),
          (10, 'Carnes rojas', 3),
          (11, 'Carnes procesadas', 3),
          (12, 'Grasas saludables de consumo regular', 4),
          (13, 'Grasas de consumo ocasional', 4);

INSERT INTO food_subgroup (subgroup_id, name)
VALUES	(1, 'Rojo'),
          (2, 'Naranja / Amarillo'),
          (3, 'Verde'),
          (4, 'Morado'),
          (5, 'Blanco'),
          (6, 'Amarillo'),
          (7, 'Gris');



INSERT INTO recommended_calories (recommended_calories_id, amount)
VALUES	(1, 1500),
          (2, 1600),
          (3, 1700),
          (4, 1800);


INSERT INTO daily_portion (daily_portion_id, recommended_calories_id, pbc_group_id, amount)
VALUES	(1, 1, 1, 2),
          (2, 2, 1, 2),
          (3, 3, 1, 2),
          (4, 4, 1, 2),
          (5, 1, 2, 3),
          (6, 2, 2, 3),
          (7, 3, 2, 3),
          (8, 4, 2, 3),
          (9, 1, 3, 6),
          (10, 2, 3, 7),
          (11, 3, 3, 7.5),
          (12, 4, 3, 7.5),
          (13, 1, 4, 6),
          (14, 2, 4, 7),
          (15, 3, 4, 7.5),
          (16, 4, 4, 7.5),
          (17, 1, 5, 1.5),
          (18, 2, 5, 1.5),
          (19, 3, 5, 1.5),
          (20, 4, 5, 2),
          (21, 1, 6, 2),
          (22, 2, 6, 2),
          (23, 3, 6, 2),
          (24, 4, 6, 2),
          (25, 1, 7, 2),
          (26, 2, 7, 2),
          (27, 3, 7, 2),
          (28, 4, 7, 2),
          (29, 1, 8, 1.5),
          (30, 2, 8, 2),
          (31, 3, 8, 2.5),
          (32, 4, 8, 3),
          (33, 1, 9, 1.5),
          (34, 2, 9, 2),
          (35, 3, 9, 2.5),
          (36, 4, 9, 3),
          (37, 1, 10, 1.5),
          (38, 2, 10, 2),
          (39, 3, 10, 2.5),
          (40, 4, 10, 3),
          (41, 1, 11, 1.5),
          (42, 2, 11, 2),
          (43, 3, 11, 2.5),
          (44, 4, 11, 3),
          (45, 1, 12, 4),
          (46, 2, 12, 4),
          (47, 3, 12, 4),
          (48, 4, 12, 4),
          (49, 1, 13, 2),
          (50, 2, 13, 2),
          (51, 3, 13, 2),
          (52, 4, 13, 2);

INSERT INTO food(food_id, name, measure, portion_amount, calories, group_id, subgroup_id)
VALUES	(1, 'Sandia', 'Taza', 1, 48, 1, 1),
          (2, 'Fresa', 'Pieza', 17, 65, 1, 1),
          (3, 'Naranja', 'Pieza', 2, 72, 1, 2),
          (4, 'PiÒa', 'Taza', 0.75, 62, 1, 2),
          (5, 'Limon', 'Pieza', 4, 31, 1, 3),
          (6, 'Uva', 'Pieza', 18, 61, 1, 4),
          (7, 'Platano', 'Pieza', 0.5, 48, 1, 5),
          (8, 'Pera', 'Pieza', 0.5, 196, 1, 5),
          (9, 'Manzana', 'Pieza', 1, 55, 1, 5),
          (10, 'Jitomate', 'Pieza', 2, 22, 2, 1),
          (11, 'Zanahoria', 'Taza', 0.5, 26, 2, 2),
          (12, 'Lechuga', 'Taza', 3, 23, 2, 3),
          (13, 'Brocoli', 'Taza', 0.5, 26, 2, 3),
          (14, 'Ejotes', 'Taza', 0.5, 22, 2, 3),
          (15, 'Betabel', 'Taza', 0.25, 18, 2, 4),
          (16, 'Cebolla', 'Taza', 0.5, 23, 2, 5),
          (17, 'Tortilla de maiz', 'Pieza', 1, 64, 3, 6),
          (18, 'Elote cocido', 'Pieza', 1.5, 71, 3, 6),
          (19, 'Papa cocida', 'Pieza', 0.5, 73, 3, 6 ),
          (20, 'Arroz cocido', 'Taza', 0.25, 60, 3, 6),
          (21, 'Pan de caja', 'Rebanada', 1, 297, 3, 6),
          (22, 'Galletas dulces', 'Pieza', 2, 64, 4, 6),
          (23, 'Papas a la francesa', 'Pieza', 4, 112, 4, 6),
          (24, 'Frijoles', 'Taza', 0.5, 114, 5, 1),
          (25, 'Leche', 'Taza', 1, 148, 6, 1),
          (26, 'Yogurth','Taza', 1, 139, 6, 1),
          (27, 'Queso fresco/panela', 'Palma de la mano', 1, 58, 7, 1),
          (28, 'Pescado', 'Palma de la mano', 1, 148, 8, 1),
          (29, 'Pollo', 'Palma de la mano', 1, 166, 9, 1),
          (30, 'Huevo', 'Pieza', 1, 68, 9, 1),
          (31, 'Carne de res/cerdo', 'Palma de la mano', 1, 105, 10, 1),
          (32, 'Salchicha', 'Pieza', 1, 86, 11, 1),
          (33, 'Aguacate', 'Pieza', 0.33, 54, 12, 7),
          (34, 'Aceite de oliva', 'Cucharadita', 1, 44, 12, 7),
          (35, 'Cacahuate', 'Pieza', 14, 73, 12, 7),
          (36, 'Mantequilla', 'Cucharadita', 1, 39, 13, 7),
          (37, 'Tocino', 'Rebanada', 1, 44, 13, 7);
