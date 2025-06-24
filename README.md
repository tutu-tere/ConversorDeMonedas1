# 💱 Conversor de Monedas – Java + API

Este proyecto es una aplicación de consola escrita en **Java**, diseñada para convertir montos entre diferentes monedas utilizando una API de tasas de cambio en tiempo real.

## 🚀 Características

- Conversión entre múltiples monedas (USD, CLP, EUR, BRL, COP, etc.)
- Menú interactivo por consola
- Histórico de conversiones con fecha y hora (`java.time`)
- Conexión a una API de cambio de divisa usando `HttpClient`
- Parsing de respuestas JSON con `Gson`

## 📦 Estructura del proyecto
📁 ConversorMoneda/ 
├── Principal.java              
// Menú y lógica principal 
├── Convertidor.java            
// Conexión con la API y obtención de datos 
├── DatosConversion.java        
// Modelo de datos para el JSON de la API 
├── RegistroConversion.java     
// Representa una conversión con timestamp 
└── README.md                   
// Este archivo

## 🛠️ Requisitos

- Java 11 o superior
- Conexión a Internet
- Biblioteca [Gson](https://github.com/google/gson) (puedes usar Maven, Gradle o añadir el .jar manualmente)

## 🔧 Instalación

1. Clona el repositorio:
https://github.com/tutu-tere/ConversorDeMonedas1.git

2. Abre el proyecto en tu IDE favorito (Eclipse, IntelliJ, VS Code)

3. Asegúrate de tener `Gson` incluido en tu classpath.

4. Ejecuta `Principal.java` y ¡listo!

## 🌐 Fuente de datos

Los tipos de cambio se obtienen desde [ExchangeRate-API](https://www.exchangerate-api.com/). Para usarla necesitas una clave gratuita de API.

## ✍️ Autor

Desarrollado por **Tutu-tere** como parte de un desafío de programación y aprendizaje de APIs, JSON y Java moderno.  
¡Gracias por visitar este proyecto!

![menu-conversor-de-moneda](https://github.com/user-attachments/assets/e56072f4-bc5c-4183-9c59-e200e679f420)



