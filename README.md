link : https://youtu.be/oS15UKy4sms?si=LHImdy5R8js7BI47


PROBLEMA 1:
La universidad otorga descuentos en la pensión de los estudiantes basándose en su promedio ponderado del ciclo anterior. Construya un programa que solicite el promedio del alumno y la pensión base a pagar.

Los descuentos se rigen bajo la siguiente tabla:

Promedio de 18 a 20: 20% de descuento.

Promedio de 15 a 17.99: 10% de descuento.

Promedio de 13 a 14.99: 5% de descuento.

Promedio menor a 13: 0% de descuento,

Condición Especial: Además, se debe preguntar al usuario si va a pagar al contado (1 para Sí, 2 para No). Si el estudiante paga al contado, se le otorga un bono extra de S/50 de reducción sobre el total. Debe utilizar obligatoriamente el operador ternario para calcular y aplicar esta reducción de 50 soles.

Requerimientos:

1. Utilizar estructuras if, else if y else para calcular el porcentaje de descuento por promedio.

2. Utilizar el operador ternario para calcular si se restan los S/ 50 extra.

3. Imprimir el desglose de los montos utilizando System.out.printf con 2 decimales.

4. Importante: La entrega de este ejercicio requiere subir capturas de pantalla del código completo (pueden ser varias si el código es largo, lo vital es que se visualice todo para su corrección) y de la ejecución. En caso de no subir estas capturas, se le anulará la pregunta.

Ejemplo de salida esperada:

Ingrese la pensión base: 1000.00

Ingrese el promedio ponderado: 16.5.

¿Pagará al contado? (1: Sí/2: No): 1

DESGLOSE DE MATRÍCULA

Pensión base: S/ 1000.00

Descuento por promedio (10%): 5/100.00

Bono pago al contado: 5/ 50.00

Monto final a pagar: S/ 850.00


PROBLEMA 2:
Construya un programa que funcione como una casa de cambio. El programa debe solicitar al usuario que ingrese una cantidad de dinero en Soles (PEN) y mostrarle un menú para convertirla a distintas divisas internacionales.

Menú de Opciones:

1. Dólares Americanos (1 Sol = 0.27 USD)

2. Euros (1 Sol = 0.25 EUR)

3. Libras Esterlinas (1 Sol = 0.21 GBP)

4. Pesos Mexicanos (1 Sol = 4.50 MXN)

Requerimientos:

1. Solicitar los Soles utilizando Scanner.

2. Mostrar el menú y solicitar la opción deseada (número del 1 al 4).

3. Utilizar la estructura switch (ya sea el tradicional o el mejorado con patrones) para procesar la opción elegida y calcular la conversión multiplicando los soles por la tasa indicada.

4. Si el usuario ingresa una opción fuera del rango (ej. 5), el programa debe imprimir un mensaje de error como "Moneda no disponible".

5. Imprimir el resultado de la conversión usando System.out.printf, mostrando el resultado con 2 decimales y la abreviatura de la moneda destino (USD, EUR, etc).

6. Importante: La entrega de este ejercicio requiere subir capturas de pantalla del código completo (pueden ser varias si el código es largo, lo vital es que se visualice todo para su corrección) y de la ejecución. En caso de no subir estas capturas, se le anulará la pregunta.

Ejemplo de salida esperada:

Ingrese la cantidad en Soles (PEN): 100.0

Seleccione la moneda destino:

1. Dólares Americanos (USD)

2. Euros (EUR)

3. Libras Esterlinas (GBP)

4. Pesos Mexicanos (MXN)

Opción elegida: 2

Resultado: 100.00 Soles equivalen a 25.00 EUR..

PROBLEMA 3:
Escribir un programa en Java que lea las horas, minutos y segundos individualmente, y calcule qué hora sería en el siguiente segundo.

Requerimientos:

1. Solicitar mediante teclado la entrada de horas, minutos y segundos.

2. Validar que los valores ingresados sean correctos: horas (0-23), minutos (0-59) y segundos (0-59). En caso de ingresar datos inválidos, mostrar un error.

3. Calcular la hora en el siguiente segundo (por ejemplo, si los segundos superan 59, se incrementa el minuto; si el minuto supera 59, se incrementa la hora).

4. Imprimir la hora resultante usando el formato de dos dígitos separados por dos puntos (Ejemplo: 08:00:00), utilizando printf.

Ejemplos:

Entrada: 07 35 29 -> Salida: 07:35:30

Entrada: 07 35 59-> Salida: 07:36:00

Entrada: 07 59 59-> Salida: 08:00:00

Entrada: 23 59 59-> Salida: 00:00:00
