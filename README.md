# Tarea 7 — TDA Pila (Bitácora de Eventos USS Algoritmo)

## Introducción

Este proyecto consiste en la implementación de una estructura de datos tipo **Pila (Stack)** en Java para simular el sistema de bitácora de eventos de la nave USS Algoritmo.

La pila permite registrar eventos y acceder siempre al **último evento registrado**, siguiendo el principio **LIFO (Last In, First Out)**.  
Cuando se detecta un error crítico, el sistema activa un protocolo de revisión que elimina los últimos tres eventos registrados.

---

## Estructura del Proyecto

```
tarea7-pila-paz
│
├── src
│     ├── Main.java
│     └── BitacoraStack.java
│
└── README.md
```

---

## Funcionalidades Implementadas

- Registrar eventos en la bitácora (push)
- Consultar el último evento registrado (peek)
- Eliminar el último evento registrado (pop)
- Verificar si la pila está vacía
- Obtener el total de eventos registrados
- Activar protocolo de revisión cuando ocurre un **ERROR crítico**

---

## Cómo Compilar y Ejecutar

Abrir una terminal en la carpeta raíz del proyecto y ejecutar:

```
javac src/Main.java src/BitacoraStack.java
java -cp src Main
```

---

## Resultado que se Espera

El programa registra seis eventos, detecta un error crítico y elimina los últimos tres registros.  
Finalmente muestra el estado actual de la bitácora indicando:

- Total de eventos restantes  
- Evento actual en la cima de la pila  

---

## Autor

Dylan Paz  
Ingeniería de Sistemas  
Universidad Da Vinci de Guatemala
