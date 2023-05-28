CREATE TABLE artists (
    id INT(11) NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    genre VARCHAR(255),
    start_year INT(4),
    PRIMARY KEY (id)
);

insert into artists (name, genre, start_year) values ('Foo Fighters', 'Rock', 1995);
insert into artists (name, genre, start_year) values ('Lady Gaga', 'Pop', 2005);
insert into artists (name, genre, start_year) values ('Drake', 'Rap', 2006);

/*
 * select * from artists
 * */
