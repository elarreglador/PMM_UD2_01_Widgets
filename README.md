# WidgetsDemo en Jetpack Compose
## UD2 Kotlin Jetpack Compose
La unidad 2 de Programacion MultiMedia (PMM) explica Jetpack Compose y su funcionamiento, he desglosado una serie de conceptos y creado apps minimas para facilitar su comprension.

## Acerca de Widgets
Este proyecto muestra el uso de algunos widgets comunes de Jetpack Compose en una aplicación de Android. Incluye componentes como TextField, Button, Checkbox, Slider y Image, todos alineados y dispuestos dentro de un Column para crear una interfaz de usuario simple y funcional.

## Estructura del Proyecto
El proyecto consta de una actividad principal MainActivity, que carga el contenido de la interfaz de usuario utilizando WidgetsDemo, una función composable que define los widgets y su disposición en la pantalla.

## Componentes Principales
Text
Un Text de título que muestra "Widgets comunes en Jetpack Compose" con un tamaño de fuente de 24sp.

TextField (Campo de Texto)
Un TextField que permite al usuario ingresar su nombre, con una etiqueta de "Nombre".

Button (Botón)
Un Button con el texto "Enviar". La acción del botón está actualmente vacía y se puede personalizar.

Checkbox (Casilla de Verificación)
Un Checkbox que representa la aceptación de términos y condiciones. Este componente está alineado horizontalmente junto con un Text.

Slider (Deslizador)
Un Slider que permite al usuario ajustar el nivel de satisfacción en una escala del 0 al 10. El valor actual se muestra en tiempo real.

Image (Imagen)
Dos Image de ejemplo que se colocan en una Row, utilizando el recurso R.drawable.ic_dialog_info para representar un ícono de información.

## Configuración de Vista Previa
Se incluye una vista previa (@Preview) para mostrar el diseño en un dispositivo Pixel 4, usando el sistema UI predeterminado para facilitar el desarrollo.