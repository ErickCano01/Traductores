inicio-programa
    variables: numeroDeElementos, promedio, i, elemento
    
    leer numeroDeElementos
    promeido = 0
    i = 0

    mientras (i < numeroDeElementos)
        leer elemento
        promedio = promedio + elemento
        i = i + 1
    fin-mientras

    promedio = promedio / numeroDeElementos
    escribir "El promedio es ", promedio
fin-programa