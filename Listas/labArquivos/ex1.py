import os

todosArquivos = (os.path.join(diretoriobase, arquivo) for diretoriobase, dirs, files in os.walk('.') for arquivo in files)
arquivosOrdenados = sorted(todosArquivos, key = os.path.getsize, reverse=True)

print(*arquivosOrdenados, sep="\n")
