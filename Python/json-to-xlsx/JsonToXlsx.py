import pandas as pd

# Lendo arquivo json
df_json = pd.read_json('example.json')

# Escrevendo arquivo Excel
df_json.to_excel('Example.xlsx', sheet_name='Movies', index=False)
