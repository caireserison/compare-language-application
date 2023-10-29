CREATE TABLE artists (
    id INT IDENTITY(1,1) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    genre VARCHAR(255),
    start_year INT
);

INSERT INTO artists (name, genre, start_year) VALUES ('Foo Fighters', 'Rock', 1995);
INSERT INTO artists (name, genre, start_year) VALUES ('Lady Gaga', 'Pop', 2005);
INSERT INTO artists (name, genre, start_year) VALUES ('Drake', 'Rap', 2006);

/*
SELECT * FROM artists;
*/
