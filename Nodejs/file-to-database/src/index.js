const { Pool } = require('pg');
const fs = require('fs');
const csv = require('csv-parser');

console.log('Início da aplicação: ' + new Date().toISOString().substr(11, 12));

console.log('Conexão com banco de dados PostgreSQL');
const conn = new Pool({
  user: 'postgres',
  host: 'localhost',
  database: 'postgres',
  password: 'locaires',
  port: 5432
  //,max: 5 // Limitando o máximo de conexões no pool
});

console.log('Lendo e percorrendo arquivo csv');
fs.createReadStream('../../_files/file-to-database/songs.csv')
  .pipe(csv())
  .on('data', (row) => {
    //Verificando gênero
    if (row.genre === 'Rock') {
      // Inserindo linha na tabela
      const query = {
        text: 'INSERT INTO rock_songs (name, artist, release_year) VALUES ($1, $2, $3)',
        values: [row.name, row.artist, row.release_year],
      };
      conn.query(query);
    }
  })
  .on('end', () => {
    console.log('Buscando a quantidade de linhas na tabela');
    conn.query('SELECT COUNT(*) FROM rock_songs', (err, result) => {
    const rowCount = result.rows[0].count;
    console.log(`A tabela possui ${rowCount} registro(s) de músicas do gênero Rock.`);
    console.log('Fim da aplicação: ' + new Date().toISOString().substr(11, 12));
    });
  });
