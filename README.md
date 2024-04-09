# Pig Center
By Luis David Lopez Mendoza

## Brief Project Description

La Granja S.A, a pig center, needed a web solution implementing the Model-View-Controller (MVC) design pattern. This project emerged in response to the challenges posed by La Granja S.A.

## Table of Contents

- [Configuration](#configuration)
- [Usage](#usage)
- [Technology](#technology)
- [Diagram](#diagram)
- [Contact](#contact)

## Configuration

1. Database Configuration:
   - Before starting, make sure you have PostgreSQL installed on your machine. You will need to change the settings in the 'application.properties' file.
   - You must create a database with the name 'pigCenter'. The creation of the tables will be done by Spring Boot during the execution process.

2. Running the database script:

 ```sql
INSERT INTO courses (name, description,category, teacher) VALUES ('Mathematics Fundamentals','Explore the beauty of numbers and equations in this introductory mathematics course.','Mathematics', 'Juan Diego Ossa');
INSERT INTO courses (name, description,category, teacher) VALUES ('Introduction to Biology','Delve into the wonders of the natural world through experiments and observations.' ,'Science', 'Leandro Jarammillo');
INSERT INTO courses (name, description,category, teacher) VALUES ('Web Development Basics','Learn the fundamentals of coding and software development in this hands-on course.' ,'Technology', 'Neiro Figueroa');

INSERT INTO students (name, last_name, age, email, course_id) VALUES ('John', 'Serna', 26,'John@example.com', 1);
INSERT INTO students (name, last_name, age, email, course_id) VALUES ('Emily', 'Johnson', 21,'Emily@example.com', 2);
INSERT INTO students (name, last_name, age, email, course_id) VALUES ('Anyi', 'Hoyos', 22,'Anyi@example.com', 1);
INSERT INTO students (name, last_name, age, email, course_id) VALUES ('Michael', 'Williams', 24,'Michael@example.com', 3);
INSERT INTO students (name, last_name, age, email, course_id) VALUES ('Ethan', 'Miller', 18, 'Ethan@example.com',2);
INSERT INTO students (name, last_name, age, email, course_id) VALUES ('Alexander', 'Williams', 20,'Alexander@example.com', 3);
INSERT INTO students (name, last_name, age, email, course_id) VALUES ('Ava', 'Hoyos', 19, 'Ava@example.com',1);
INSERT INTO students (name, last_name, age, email, course_id) VALUES ('Michael', 'Williams', 22,'Michael@example.com', 3);

```
## Uso:
El desarrollo del proyecto está consolidado en la rama 'devBack'. Para utilizar el proyecto, primero debes ejecutar el backend (implementado en Spring Boot) y luego ejecutar el archivo SQL para configurar la base de datos. Después, puedes iniciar el frontend utilizando un servidor en vivo (live server).

## Tecnologia
Las tecnologías utilizadas en el proyecto fueron:

- Spring Boot
- Bootstrap
- Chart.js
- HTML
- CSS
- GraphQl

## Diagrama
Si desea observar el diagrama de clases del proyecto, da click al siguiente link:
https://drive.google.com/file/d/1c9ihgeT8BkEReCVcwuCx47P5MyLD7zlT/view?usp=drive_link


## Contacto

Si tienes alguna pregunta, comentario o sugerencia sobre el proyecto, no dudes en ponerte con nosotros.

- Name: Luis David
- Email: luis_lopez82201@elpoli.edu.co
