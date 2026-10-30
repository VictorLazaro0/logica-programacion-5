# logica-programacion-5
# 🇪🇸🇬🇧 Traductor  Español-Inglés en Java

Programa desarrollado en **Java** que implementa un diccionario bilingüe utilizando estructuras de datos eficientes para poner a prueba el vocabulario del usuario de forma interactiva.

---

## 🎯 Objetivo

Crear una aplicación de consola en Java que cumpla con los siguientes requerimientos:
- **Diccionario Bilingüe:** Contener un catálogo de al menos 20 palabras en español con su respectiva traducción al inglés.
- **Estructura de Datos:** Utilizar un objeto `HashMap<String, String>` para almacenar y gestionar los pares de palabras (clave-valor).
- **Selección Aleatoria:** Escoger al azar **5 palabras** del mini diccionario en cada ejecución.
- **Evaluación Interactiva:** Solicitar al usuario que ingrese la traducción al inglés de cada palabra seleccionada, validar las respuestas y mostrar una calificación o resultado final.

---

## 🛠️ Tecnologías Utilizadas

* **Java** (JDK 21 o superior)
* Estructuras de datos: `HashMap`, `ArrayList`
* Control de flujo y manejo de entradas por consola (`Scanner`, `Random`)

---

## 🚀 Cómo Funciona

1. **Inicialización:** El programa carga un `HashMap` con 20 o más palabras clave en español y sus traducciones al inglés.
2. **Mezcla y Selección:** Las claves del diccionario se transfieren a una lista para aplicar un método de aleatoriedad (`Collections.shuffle()` o `Random`), seleccionando exactamente 5 palabras únicas.
3. **Interacción:** Mediante un bucle, se le pregunta al usuario la traducción de cada una de las 5 palabras elegidas.
4. **Resultado:** Al finalizar, se muestra el puntaje obtenido (por ejemplo, aciertos vs. total) y las respuestas correctas en caso de haber fallado.

---

