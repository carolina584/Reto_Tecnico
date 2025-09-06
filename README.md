# Datepicker: Automatización con Serenity BDD

🚀 Comienza la automatización
Aquí se encuentran las instrucciones para iniciar con la automatización. Conocerás las tecnologías y herramientas utilizadas.

Pre-requisitos:

Tener instalado JDK y JRE en la versión 11.0.18. La ruta de instalación es C:\Program Files\Java\jdk11.0.18 y C:\Program Files\Java\jre11.0.18.

El sistema operativo utilizado es Windows 11 de 64 bits.

Gradle: versión 5.2.1.

IDE: Eclipse o Intellij.

Plugins: Instala los plugins de Distribución de Gradle y Cucumber en tu IDE.

🔧 Proceso de instalación
Configura las variables de entorno de JAVA:

Añade las rutas de JDK y JRE a la variable Path del sistema.

Configura la variable de entorno de Gradle:

Realiza el mismo paso anterior: crea una nueva variable y asígnala a Path.

Descarga e instala el IDE:

Utiliza Intellij 2023.2 o posterior.

⚙️ Ejecutando las pruebas
Para correr las pruebas automatizadas y generar el reporte, ejecuta el siguiente comando en la consola:

gradle clean test aggregate
gradle: indica que se usará Gradle.

clean: limpia la prueba anterior para generar una nueva.

test: corre la automatización.

aggregate: genera el reporte de pruebas con Serenity Report.

🛠️ Tecnologías utilizadas
El proyecto está construido con las siguientes dependencias de Serenity:

Serenity Core

Serenity con Junit y Serenity con Cucumber

Serenity Screenplay y Serenity WebDriver (última versión 2.0.91)

WebDriver: 139.0.7258.67

Navegador utilizado: Chrome versión 139.0.7258.67 (Build oficial) (64 bits)

⌨️ Comandos para gestionar el proyecto
Desde la consola para un proyecto Java con Gradle:
Ve a la ruta del proyecto.

Abre la consola (cmd) desde la ubicación del proyecto.

Ingresa gradle init.

Selecciona la opción 6.

Selecciona la opción 1 y presiona Enter.

Selecciona la opción 1 (junit).

Ingresa el nombre del proyecto.

Ingresa el nombre del paquete fuente. Con esto, se crean las carpetas importantes para iniciar el proyecto.

Para ejecutar el proyecto y generar el reporte:
Dirígete a la ruta del proyecto.

Abre la consola (cmd o Git Bash).

Ingresa gradle clean test aggregate.

La prueba se ejecutará y el reporte se generará en la siguiente ubicación: C:\ubicacion_equipo\carpeta_proyecto\target\site\serenity.

Abre el archivo index.html para visualizar el reporte.

Autor ✒️ Carolina Muñoz
