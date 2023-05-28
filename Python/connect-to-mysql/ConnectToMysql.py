import mysql.connector

# Configuração da conexão com o banco de dados
connection = mysql.connector.connect(
    host="localhost",
    user="principal", # Alterar 'user'
    password="usual.00", # Alterar para 'password'
    database="mysql" # Alterar para 'db_test'
)

# Seleciona a tabela
cursor = connection.cursor()
cursor.execute("SELECT * FROM artists")
rows = cursor.fetchall()

# Exibe as músicas encontradas
print("As seguintes músicas foram encontradas:")
print(rows)

# Fecha a conexão com o banco de dados
cursor.close()
connection.close()