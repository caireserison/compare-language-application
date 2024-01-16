from datetime import datetime
import pandas as pd
import psycopg2

print('Início da aplicação: ' + datetime.now().strftime("%H:%M:%S.%f")[:-3])
print("Lendo arquivo csv")
read_file = pd.read_csv('../../_files/file-to-database/songs.csv')

print("Conexão com banco de dados PostgreSQL")
conn = psycopg2.connect(
    host="localhost",
    database="postgres",
    user="postgres",
    password="locaires"
)
execdb = conn.cursor()

print("Percorrendo arquivo csv")
for idx, row in read_file.iterrows():
    # Verificando gênero
    genre = row.iloc[0]
    if (genre == 'Rock'):
        # Inserindo linha na tabela
        name = row.iloc[1]
        artist = row.iloc[2]
        release_year = row.iloc[3]
        insert_command = "INSERT INTO rock_songs (name, artist, release_year) VALUES (%s, %s, %s)"
        execdb.execute(insert_command, (name, artist, release_year))
        conn.commit()

print("Buscando a quantidade de linhas na tabela")
count_query = "SELECT COUNT(*) FROM rock_songs"
execdb.execute(count_query)
row_count = execdb.fetchone()[0]
print("A tabela possui " + str(row_count) + " registro(s) de músicas do gênero Rock.")

# Fechando conexão com banco de dados
execdb.close()
conn.close()

print('Fim da aplicação: ' + datetime.now().strftime("%H:%M:%S.%f")[:-3])
