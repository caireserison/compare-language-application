const xlsx = require('xlsx');
const fs = require('fs');

// Lendo arquivo json
fs.readFile('example.json', 'utf8', (err, data) => {
  const jsonData = JSON.parse(data);

  // Escrevendo arquivo Excel
  const workbook = xlsx.utils.book_new();
  const worksheet = xlsx.utils.json_to_sheet(jsonData);
  xlsx.utils.book_append_sheet(workbook, worksheet, 'Movies');
  xlsx.writeFile(workbook, 'Example.xlsx');
});
