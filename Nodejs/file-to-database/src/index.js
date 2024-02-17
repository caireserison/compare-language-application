const { Pool } = require('pg');
const fs = require('fs');

console.log('Início da aplicação: ' + new Date().toLocaleTimeString('pt-BR'));

console.log('Conexão com banco de dados PostgreSQL');
const conn = new Pool({
    user: 'postgres',
    host: 'localhost',
    database: 'postgres',
    password: 'locaires',
    port: 5432,
    //max: 30 // Limitando o máximo de conexões no pool
});

console.log('Lendo e percorrendo arquivo csv');
const data = fs.readFileSync('../../_files/file-to-database/songs.csv', 'utf8').split('\n');
for (const line of data) {
  const [genre, name, artist, release_year] = line.replace('\r', '').split(',');
  // Verificando gênero
  if (genre === 'Rock') {
    // Inserindo linha na tabela
    const query = {
      text: 'INSERT INTO rock_songs (name, artist, release_year) VALUES ($1, $2, $3)',
      values: [name, artist, release_year],
    };
    conn.query(query, (err) => {
        if (err) {
            console.error('Erro ao inserir linha:', err);
        }
    });
  }
}

console.log('Buscando a quantidade de linhas na tabela');
conn.query('SELECT COUNT(*) FROM rock_songs', (err, result) => {
  const rowCount = result.rows[0].count;
  console.log(`A tabela possui ${rowCount} registro(s) de músicas do gênero Rock.`);
  console.log('Fim da aplicação: ' + new Date().toLocaleTimeString('pt-BR')); 
  conn.end(); // Encerrando a conexão com o banco de dados
});