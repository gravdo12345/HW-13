-- Insert clients
INSERT INTO client (name) VALUES ('Client 1'), ('Client 2'), ('Client 3'), ('Client 4'), ('Client 5'), ('Client 6'), ('Client 7'), ('Client 8'), ('Client 9'), ('Client 10');

-- Insert planets
INSERT INTO planet (id, name) VALUES ('MARS', 'Mars'), ('VEN', 'Venus'), ('EAR', 'Earth'), ('SAT', 'Saturn'), ('JUP', 'Jupiter');

-- Insert tickets
INSERT INTO ticket (client_id, from_planet_id, to_planet_id) VALUES
(1, 'MARS', 'VEN'),
(2, 'MARS', 'EAR'),
(3, 'VEN', 'SAT'),
(4, 'JUP', 'MARS'),
(5, 'EAR', 'JUP'),
(6, 'SAT', 'MARS'),
(7, 'VEN', 'EAR'),
(8, 'MARS', 'SAT'),
(9, 'JUP', 'VEN'),
(10, 'EAR', 'SAT');
