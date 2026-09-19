# Bitácora del proyecto: Simulador Financiero

## 1. Datos generales

**Nombre del proyecto:** Simulador Financiero  
**Archivo:** `p080_SimuladorFinanciero.java`  
**Lenguaje utilizado:** Java  
**Fecha de inicio:** 18 de septiembre de 2026  
**Fecha de finalización de esta etapa:** 19 de septiembre de 2026

## 2. Introducción

En este proyecto desarrollé un simulador financiero para la Cooperativa
Universitaria **"Crece con Nosotros"**. La idea principal fue crear un programa
de consola que permitiera hacer cálculos sencillos relacionados con el ahorro,
las inversiones a plazo fijo y el perfil de riesgo de una persona.

Para realizar el proyecto utilicé Java y fui construyendo el programa por
etapas. Primero preparé la estructura de las funciones, después agregué las
fórmulas financieras, posteriormente integré un menú y, al final, revisé el
programa para corregir errores de lógica y mejorar la presentación de los
resultados.

También fui registrando los prompts utilizados y las decisiones tomadas para
dejar constancia de cómo se desarrolló el programa con apoyo de inteligencia
artificial.

## 3. Objetivo del programa

El objetivo del programa es permitir que estudiantes y docentes puedan realizar
proyecciones financieras básicas desde una terminal. El simulador ofrece tres
funciones principales:

1. Calcular cuánto dinero se puede acumular con aportaciones mensuales.
2. Proyectar el crecimiento de una inversión a plazo fijo con interés compuesto.
3. Obtener un perfil de riesgo usando la edad y el monto disponible.

## 4. Desarrollo paso a paso

### Etapa 1: Creación de la estructura inicial

**Prompt utilizado:**

> requiero que me ayudes a crear un programa para un proyecto escolar, me
> permitieron usar ia para la creacion del codigo soloq que tambien requiero
> que documentes todo el proceso para al final crear un pdf, asi que ve
> documentando cada prompt que te de hasta el final para hacerlo, vale?

Mi primera decisión fue llevar una bitácora desde el principio para no perder
los requisitos ni los cambios realizados. De esta manera, la documentación
podrá convertirse posteriormente en un PDF del proyecto.

El planteamiento inicial fue el siguiente:

> La Cooperativa Universitaria "Crece con Nosotros" requiere automatizar sus
> proyecciones financieras básicas para que los estudiantes y docentes puedan
> simular sus planes de ahorro y metas de inversión desde una terminal. El
> sistema debe ser una aplicación de consola interactiva que permita al usuario
> realizar cálculos precisos basándose en diferentes productos financieros.

Con base en esto, entendí que el programa debía funcionar desde la consola y
que tendría varias opciones financieras.

Después solicité la estructura de tres funciones:

> el sistema debe tener un menu principal para elegir varias opciones, estaria
> bien con un switch case, dentro de esas opciones tienen que ir funciones para
> cada opcion, previamente declaradas, y que se puedan llamar desde la opcion
> del case, Crea los esqueletos de tres funciones estáticas: calcularAhorro,
> calcularInteresCompuesto y obtenerPerfil. Incluye solo los comentarios
> Javadoc de lo que debe hacer cada una y la estructura de parámetros. No
> escribas el código interno todavía.

En esta etapa solamente preparé los métodos y sus comentarios Javadoc. Todavía
no agregué cálculos, porque primero quería tener clara la estructura del
programa.

Las funciones iniciales fueron:

- `calcularAhorro`
- `calcularInteresCompuesto`
- `obtenerPerfil`

Al principio los parámetros todavía eran provisionales, ya que se fueron
ajustando conforme se definieron mejor los requisitos.

### Etapa 2: Implementación del cálculo de ahorro

**Prompt utilizado:**

> genial, ahora impliementaremos la logica de cada funcion, para calcularAhorro,
> debe calcular el monto final acumulado. Se requiere un ciclo for que actúe
> como acumulador mes a mes, sumando la aportación y aplicando el interés
> mensual correspondiente. Función requerida:
> public static double calcularAhorro(double aportacion, int meses,
> double tasaAnual)

Para esta función utilicé un acumulador que comienza en cero. En cada vuelta
del ciclo `for` se suma la aportación mensual y después se aplica el interés
correspondiente al saldo acumulado.

La firma final de la función quedó así:

```java
public static double calcularAhorro(
        double aportacion,
        int meses,
        double tasaAnual)
```

La tasa anual se maneja como decimal. Por ejemplo, `0.05` significa 5 % anual.
La tasa mensual se obtiene dividiendo la tasa anual entre 12:

```java
double tasaMensual = tasaAnual / 12;
```

### Etapa 3: Implementación del interés compuesto

**Prompt utilizado:**

> bien ahora para interes compuesto, la opcion de esta debe ser "Proyeccion de
> inversion a plazo fijo" Utiliza la fórmula de interés compuesto
> M = C x (1 + r/100)^t. Requisito: Uso obligatorio de Math.pow. Función
> requerida: public static double calcularInteresCompuesto(double capital,
> double tasa, int anios)

La función se utilizó para representar una proyección de inversión a plazo
fijo. La firma quedó de la siguiente manera:

```java
public static double calcularInteresCompuesto(
        double capital,
        double tasa,
        int anios)
```

Durante la revisión final aclaré que las tasas se ingresarían como decimales.
Por eso, la fórmula que utiliza el programa es:

```java
capital * Math.pow(1 + tasa, anios)
```

Se utilizó `Math.pow` porque era un requisito específico del ejercicio y porque
permite elevar correctamente el factor de crecimiento al número de años.

### Etapa 4: Clasificación del perfil de riesgo

**Prompt utilizado:**

> bien, ahora para obtenerPerfil, Determina el perfil de riesgo basándose en
> la edad y el capital disponible mediante condiciones compuestas (&&, ||).
> Perfiles: Conservador, Moderado, Agresivo, o No elegible (si el monto es
> insuficiente). Función requerida:
> public static String obtenerPerfil(int edad, double monto)

En este punto noté que no estaban definidos los límites exactos de cada
perfil, así que solicité una aclaración antes de inventar reglas.

La regla definitiva fue:

> menor de 30 años y monto mayor a 10k es Agresivo; mayor de 50 años es
> Conservador; el resto es Moderado. Incluye validaciones para que los números
> sean positivos.

La clasificación quedó así:

- Edad menor de 30 años y monto mayor de 10,000: **Agresivo**.
- Edad mayor de 50 años: **Conservador**.
- Cualquier otro caso válido: **Moderado**.

También agregué validaciones para que la edad y el monto fueran positivos.
Aunque en el planteamiento inicial aparecía la posibilidad de un perfil "No
elegible", no se especificó un monto mínimo exacto. Por eso no inventé un
umbral adicional: cualquier monto positivo se considera válido.

### Etapa 5: Integración del menú

**Prompt utilizado:**

> genial, ahora integraremos todo como un menu con switch case. Fase 3:
> Integración del Menú y Manejo de Consola: Construcción del main con do-while
> y switch-case. Ahora, crea el método main para mi programa
> p080_SimuladorFinanciero. Debe usar un ciclo do-while y un switch-case para
> mostrar un menú con 4 opciones. Asegúrate de manejar correctamente el Scanner
> y limpiar el buffer si es necesario al leer strings después de números.

Agregué el método `main` con un ciclo `do-while` para que el menú se mostrara
repetidamente hasta que el usuario eligiera la opción de salir.

El menú final tiene estas opciones:

1. Calcular ahorro mensual.
2. Proyección de inversión a plazo fijo.
3. Obtener perfil de riesgo.
4. Salir.

Utilicé un `switch-case` para ejecutar la función correspondiente a cada
opción. También utilicé un solo objeto `Scanner` y llamé a `nextLine()` después
de leer números para limpiar el salto de línea pendiente.

Para evitar que el programa se cierre ante una entrada incorrecta, agregué
manejo de `InputMismatchException`. También capturé `IllegalArgumentException`
para mostrar los errores de validación sin terminar la ejecución.

### Etapa 6: Depuración y optimización

**Prompt utilizado:**

> genial, quedo todo listo, ahora quiero que me ayudes a depurar y optimizar
> el programa entero, busca posibles errores de logica, asegura que las tasas de
> interés se manejen como decimales (ej. 5% como 0.05) y optimiza el formato
> de salida para que los montos de dinero muestren solo 2 decimales

Durante esta revisión encontré una diferencia importante: las primeras
versiones trataban la tasa como porcentaje entero, por ejemplo `5`, pero el
requisito final indicaba que debía manejarse como decimal, es decir, `0.05`.

Corregí las dos funciones financieras:

```java
// Para el ahorro mensual
double tasaMensual = tasaAnual / 12;

// Para el interés compuesto
capital * Math.pow(1 + tasa, anios);
```

También actualicé los mensajes del menú para indicar claramente:

```text
Tasa anual decimal (0.05 = 5 %):
```

Además, agregué validaciones para rechazar valores negativos, cero, `NaN` e
infinito. Los resultados monetarios se muestran con dos decimales usando
`printf("%.2f")`.

## 5. Validaciones incluidas

El programa verifica que:

- La aportación mensual sea mayor que cero.
- La cantidad de meses sea positiva.
- La tasa anual sea positiva y finita.
- El capital inicial sea positivo y finito.
- La cantidad de años sea positiva.
- La edad sea mayor que cero.
- El monto disponible sea positivo y finito.
- La opción del menú se encuentre entre 1 y 4.
- Las entradas del usuario sean numéricas.

Cuando se recibe un valor inválido, el programa muestra un mensaje de error y
regresa al menú para que el usuario pueda intentarlo de nuevo.

## 6. Pruebas realizadas

Probé el menú completo con los siguientes datos:

### Prueba de ahorro

- Aportación mensual: `100`
- Meses: `12`
- Tasa anual: `0.05`
- Resultado obtenido: `1233.00`

### Prueba de inversión a plazo fijo

- Capital inicial: `1000`
- Tasa anual: `0.10`
- Años: `2`
- Resultado obtenido: `1210.00`

### Prueba de perfil de riesgo

- Edad: `25`
- Monto disponible: `15000`
- Resultado obtenido: `Agresivo`

También probé la opción de salida y confirmé que el programa termina
correctamente. Finalmente, compilé el archivo con `javac` y no se encontraron
errores.

## 7. Lo que aprendí

Con este proyecto practiqué varios temas de Java:

- Declaración y uso de métodos estáticos.
- Uso de parámetros y valores de retorno.
- Ciclos `for` y `do-while`.
- Estructuras `switch-case`.
- Uso de `Scanner` para leer datos desde la consola.
- Manejo de excepciones con `try-catch`.
- Conversión y uso correcto de tasas decimales.
- Aplicación de la fórmula del interés compuesto.
- Formateo de cantidades monetarias.
- Validación de datos antes de realizar cálculos.

También comprendí que es importante revisar las unidades de los datos. Una
tasa escrita como `5` no representa lo mismo que una tasa escrita como `0.05`,
por lo que fue necesario dejar claro ese formato tanto en las fórmulas como en
los mensajes mostrados al usuario.

## 8. Estado final del proyecto

- [x] Crear la clase principal.
- [x] Declarar las tres funciones estáticas.
- [x] Documentar las funciones con Javadoc.
- [x] Implementar el cálculo de ahorro mensual.
- [x] Implementar el cálculo de interés compuesto con `Math.pow`.
- [x] Implementar la clasificación de perfiles de riesgo.
- [x] Agregar validaciones para los datos numéricos.
- [x] Crear el menú con `do-while` y `switch-case`.
- [x] Manejar correctamente el `Scanner`.
- [x] Mostrar los montos con dos decimales.
- [x] Probar las opciones principales del programa.
- [ ] Convertir esta bitácora en el PDF final.

## 9. Conclusión

El simulador cumple con las funciones solicitadas y puede utilizarse desde una
terminal. El programa permite realizar cálculos básicos de ahorro e inversión,
clasificar un perfil de riesgo y controlar errores comunes de entrada.

El desarrollo se realizó paso a paso, revisando cada requisito antes de
agregar la siguiente parte. La bitácora me permitió llevar un registro de las
decisiones tomadas y de las correcciones realizadas durante la construcción
del programa.
