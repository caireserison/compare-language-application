using System.Data;
using Newtonsoft.Json;
using OfficeOpenXml;

// Lendo arquivo json
string json = File.ReadAllText("example.json");
DataTable jsonDataTable = JsonConvert.DeserializeObject<DataTable>(json);

// Escrevendo arquivo excel
var file = new FileInfo("Example.xlsx");
using var package = new ExcelPackage(file);
var worksheet = package.Workbook.Worksheets.Add("Movies");
worksheet.Cells[1, 1].LoadFromDataTable(jsonDataTable, true);
package.Save();
