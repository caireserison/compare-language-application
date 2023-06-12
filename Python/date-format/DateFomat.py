import datetime
import pytz

# Data e hora atuais com formatação padrão
now = datetime.datetime.now()
print(now)

# Formatando para dd/MM/aaaa HH:mm:ss
formatDate = now.strftime('%d/%m/%Y %H:%M:%S')
print(formatDate)

# Alterando região para fuso específico
region = pytz.timezone("Asia/Tokyo")
regionDate = now.astimezone(region)
print(regionDate)
