// Inteiro para String
int intType = 123;
string intToString = intType.ToString();
Console.WriteLine(intToString);
// String para Inteiro
int stringToInt = Convert.ToInt32(intToString);
Console.WriteLine(stringToInt);

// Double para String
double doubleType = 123.12;
string doubleToString = doubleType.ToString();
Console.WriteLine(doubleToString);
// String para double
double stringToDouble = Convert.ToDouble(doubleToString);
Console.WriteLine(stringToDouble);

// Boleano para Inteiro
bool booleanType = true;
int booleanToInt = booleanType ? 1 : 0;
Console.WriteLine(booleanToInt);
