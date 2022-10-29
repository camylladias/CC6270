from datetime import date, datetime
import os
arquivos = []

entrada = ''

while entrada != 'sair':
    entrada = input("Informe o diretorio: ")
    #exemplo entrada = "C:\\Users\\user\\Documents\\test"
    
    data_m = os.path.getmtime(entrada)
    data_modificacao = date.fromtimestamp(data_m)
    data_c = os.path.getctime(entrada)
    data_criacao = date.fromtimestamp(data_c)
    autor = os.stat(entrada).st_uid

    for dirpath, dirname, filenames in os.walk(entrada):
        for item in os.scandir(entrada):
            print("arquivo: {:20s}      autor: {}      tamanho: {:d} Bytes        data criacao: {}          data modificacao: {}".format(
                item.name, autor, item.stat().st_size, data_criacao, data_modificacao))