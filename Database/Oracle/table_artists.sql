CREATE TABLE artists (
    id NUMBER(11) NOT NULL,
    name VARCHAR2(255) NOT NULL,
    genre VARCHAR2(255),
    start_year NUMBER(4),
    CONSTRAINT artists_pk PRIMARY KEY (id)
);

INSERT INTO artists (id, name, genre, start_year) VALUES (1, 'Foo Fighters', 'Rock', 1995);
INSERT INTO artists (id, name, genre, start_year) VALUES (2, 'Lady Gaga', 'Pop', 2005);
INSERT INTO artists (id, name, genre, start_year) VALUES (3, 'Drake', 'Rap', 2006);

-- Para reiniciar a sequência (AUTO_INCREMENT) no Oracle
CREATE SEQUENCE artists_id_seq START WITH 4;

/*
SELECT * FROM artists;
*/
