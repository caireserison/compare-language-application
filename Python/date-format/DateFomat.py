import datetime

# Data e hora atuais com formatação padrão
now = datetime.datetime.now()
print(now)

# Formatando para dd/MM/aaaa HH:mm:ss
formatDate = now.strftime('%d/%m/%Y %H:%M:%S')
print(formatDate)
