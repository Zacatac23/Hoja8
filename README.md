# Sistema de Gestión de Emergencias Médicas

Este es un sistema de gestión de emergencias médicas que permite manejar una cola de pacientes en función de su prioridad de emergencia.

## Descripción

El sistema permite la carga de pacientes desde un archivo de texto, donde cada línea del archivo representa un paciente con su nombre, síntoma y prioridad. Luego, los pacientes son atendidos en orden de prioridad, donde aquellos con mayor prioridad son atendidos primero.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- `org.example`: Contiene todas las clases relacionadas con el sistema de gestión de emergencias médicas.
  - `Main`: Clase principal que inicia el programa y gestiona la interacción con el usuario.
  - `EmergencyQueue`: Clase que implementa la interfaz `PriorityQueue` y proporciona una cola de pacientes basada en `VectorHeap`.
  - `VectorHeap`: Implementación de una cola de prioridad basada en un heap utilizando `ArrayList`.
  - `Patient`: Clase que representa a un paciente y implementa la interfaz `Comparable` para comparar pacientes según su prioridad de emergencia.
- `test`: Contiene las pruebas unitarias para verificar el correcto funcionamiento del sistema.
  - `VectorHeapTest`: Pruebas unitarias para los métodos de la clase `VectorHeap`.

## Requisitos

- Java Development Kit (JDK) 8 o superior.
# Nombre del Proyecto

Breve descripción del proyecto.

## Diagramas UML

### Primer Programa

#### Diagrama UML de Clases
![image](https://github.com/Zacatac23/Hoja8/assets/132374201/7405cda8-90e5-4a72-aed4-908cb6743adb)

#### Diagrama UML de Secuencia
![image](https://github.com/Zacatac23/Hoja8/assets/132374201/af73b359-f9f0-49f8-b80e-233e7093cdc4)

### Segundo Programa

#### Diagrama UML de Clases
![image](https://github.com/Zacatac23/Hoja8/assets/132374201/8041c54d-f5c8-4644-8f98-1bdea971341d)


#### Diagrama UML de Secuencia
![image](https://github.com/Zacatac23/Hoja8/assets/132374201/604211cb-7b4f-4d72-b52a-154422961d5f)

## Cómo Usar

1. Clona este repositorio o descarga los archivos del proyecto.
2. Abre una terminal y navega hasta el directorio raíz del proyecto.
3. Compila el programa ejecutando el siguiente comando:
4. Ejecuta el programa con el siguiente comando:
java org.example.Main
5. Sigue las instrucciones en pantalla para cargar el archivo de pacientes y observa cómo son atendidos en orden de prioridad.

## Contribución

Si deseas contribuir a este proyecto, ¡eres bienvenido! Puedes enviar pull requests con mejoras o correcciones, o bien, abrir problemas para informar sobre errores o sugerir nuevas características.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.
