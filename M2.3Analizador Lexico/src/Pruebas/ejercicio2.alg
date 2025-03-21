inicio-programa
    variables: numeroDeElementos, promedio, i, elemento
    
    leer numeroDeElementos
    promeido = 0
    i = 0

    repite (i < numeroDeElementos)
        leer elemento
        promedio = promedio + elemento
        i = i + 1
    fin-repite

    promedio = promedio / numeroDeElementos
    escribir "El promedio es ", promedio
fin-programa