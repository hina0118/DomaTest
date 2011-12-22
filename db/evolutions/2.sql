# --- !Ups
INSERT INTO User VALUES(0, 'a@mail.com', 'pass', 'tanaka ichirou', true);
INSERT INTO User VALUES(1, 'b@mail.com', 'pass', 'tanaka jirou', false);
INSERT INTO User VALUES(2, 'c@mail.com', 'pass', 'tanaka suburou', false);
INSERT INTO User VALUES(3, 'd@mail.com', 'pass', 'tanaka tarou', false);

# --- !Downs
DELETE FROM User;