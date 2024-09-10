# AppWebDinamicasJava

## Integrantes: Rodrigo Rojas, Rodrigo Gonzáles y Joeshep Lopez.

## Ruta de los repositorios:
- Rodrigo Rojas: https://github.com/RodrigoERM/SprintGrupo2
- Rodrigo Gonzáles: https://github.com/Skeleton997/SprintFinalM5G02
- Joeshep Lopez: https://github.com/Joelopez28/AppWebDinamicasJava

## Sistema de Gestión de Consultoría
Este proyecto es un sitio web dinámico bajo el patrón de diseño MVC, que ademas permite conectarse a una base de datos Oracle, para una empresa de consultoría de riesgos. El sistema permite gestionar diferentes tipos de usuarios (Clientes, Profesionales, Administrativos), registrar capacitaciones, etc.
El sistema está desarrollado en Java y está diseñado para facilitar la administración y análisis de datos.
## Contexto
En la última década, han aumentado los índices de accidentabilidad, especialmente en las empresas del rubro industrial, minero y construcción.
Para dar cumplimiento a la normativa y mantener ambientes de trabajo seguros, muchas empresas se ven en la obligación de contratar asesoría profesional, lo cual representa un costo elevado y fomenta la disminución o la no implementación de medidas necesarias para la seguridad.
Un grupo de profesionales ha fundado una compañía de asesorías en prevención de riesgos laborales y necesita una solución tecnológica que ayude a administrar los procesos que se deben ejecutar en cada una de las empresas que son clientes de la compañía.
Este servicio finalmente pretende ofrecer una solución completa en prevención de riesgos para las empresas a un costo razonable, cumpliendo estrictamente todos los procesos necesarios para dar cumplimiento a la normativa vigente, mejorando los ambientes de trabajo, la productividad, contribuyendo a un ahorro económico.
## Problema
La empresa no posee un sistema de información que le permita administrar toda la cantidad de información que se genera, ni controlar las actividades y el recurso humano.
Existen problemas con la planificación de las visitas, generalmente los profesionales están en terreno por lo que no están disponibles para informarles sus actividades futuras.
No existe registro del profesional que ha estado con mayor actividad ni se sabe dónde está cada uno.
Las visitas a terreno a veces no tienen el efecto indicado por la falta de coordinación con el cliente. Asisten trabajadores que no tienen que ver con la charla, o bien, no se coordina la ejecución de la capacitación, lo que trae consigo multas para la empresa, etc.
## Solucion
Es necesario desarrollar una solución tecnológica que cubra los procesos de negocio descritos y que proponga una mejora en la gestión, el control, la seguridad, y disponibilidad de información para la empresa y sus clientes.
El sistema debe permitir la planificación de actividades y el control de ejecución de éstas, la gestión de clientes, la coordinación entre la empresa, los profesionales y los clientes para la respuesta temprana ante incidentes de seguridad.
Además, se requiere que el sistema genere reportes y estadísticas que ayuden a tomar de decisiones y mejorar el rendimiento de la empresa, considerando la carga laboral, y la demanda de clientes y las actividades que cada uno involucra para el cumplimiento de los contratos.
Es imprescindible, mantener comunicación con los profesionales en todo momento, aún en terreno, y darle la posibilidad de realizar todas sus actividades aun no teniendo conectividad (internet), ya que muchas empresas se encuentran en zonas donde no hay conexión de ese tipo.

## Caracteristicas
- Permite gestionar usuarios y sus tres tipos: Cliente, Profesional y Administrativo.
- Permite la gestion de capacitaciones.
- Servicio intuitivo y facil de utilizar.

## Instalación
1. Accede al repositorio con uno de los link provistos al inicio.
3. Clona el repositorio en tu máquina local.
4. Navega hasta el directorio del proyecto.
5. Importa el proyecto dentro del IDE que utilizaras.
6. Si deseas utilizar una base de datos, entonces puedes ejecutar el script de SQL.
7. Puedes levantar el servicio web tanto como el Eclipse como en un servidor en un local.
   
## Uso
Para ejecutar este proyecto, necesitarás tener instalado lo siguiente:
- Java Development Kit (JDK) 8 o superior.
- IDE o editor de texto compatible con Java.
- Un sistema de gestión de bases de datos, como MySQL.
- Git (para manejo del repositorio).
  
1. Compilación:
Compila todas las clases utilizando un IDE como IntelliJ IDEA, Eclipse, o desde la línea de comandos con javac.
	
2. Ejecución:
Levanta el proyecto en un servidor local, como Tomcat.
		
3. Operaciones:
Crear Usuario: Ingresa los datos basicos correspondiente a cada usuario.
Crear Cliente/Profesional/Administrativo: Ingresa los datos requeridos para cada tipo de usuario.
Crear Capacitación: Registra una nueva capacitación.
Listar Usuarios: Muestra todos los usuarios registrados.
Eliminar Usuario: Elimina un usuario de la lista.
Listar Capacitaciones: Muestra todas las capacitaciones registradas.

## Tecnologías Utilizadas
- Java.
- MySQL Workbench.
- Tomcat.
