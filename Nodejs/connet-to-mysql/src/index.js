const mysql = require('mysql');

// Configuração da conexão com o banco de dados
const connection = mysql.createConnection({
  host: 'localhost',
  user: 'principal', // Alterar 'user'
  password: 'usual.00', // Alterar para 'password'
  database: 'mysql' // Alterar para 'db_test'
});

// Conecta ao banco de dados
connection.connect((err) => {
  if (err) throw err;
  console.log('Conectado ao banco de dados MySQL!');
});

// Seleciona a tabela
connection.query('SELECT * FROM artists', (err, rows) => {
  if (err) throw err;
  
  console.log('Os seguintes artistas foram encontradas:');
  console.log(rows);
});

// Fecha a conexão com o banco de dados
connection.end((err) => {
  if (err) throw err;
  console.log('Conexão com o banco de dados encerrada.');
});
