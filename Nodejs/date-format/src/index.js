const moment = require('moment');
const tz = require('moment-timezone');

// Data e hora atuais com formatação padrão
const now = moment();
console.log(now);

// Formatando para dd/MM/aaaa HH:mm:ss
const formatDate = now.format('DD/MM/YYYY HH:mm:ss');
console.log(formatDate);

// Alterando região para fuso específico
const regionDate = now.tz("Asia/Tokyo");
console.log(regionDate);
