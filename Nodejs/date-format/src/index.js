const moment = require('moment');

// Data e hora atuais com formatação padrão
const now = moment();
console.log(now);

// Formatando para dd/MM/aaaa HH:mm:ss
const formatDate = now.format('DD/MM/YYYY HH:mm:ss');
console.log(formatDate);
