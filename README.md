# Estudo_MicroService
Projeto de estudo sobre MicroServiços:<br>
Tecnologias usadas:
Linguagem: Java 8.<br>
Banco de dados: H2 database.<br>
Framework: Spring Boot, Spring Web, Spring cloud, Zuul, Eureka, OpenFeign.<br>
IDEA: VS Code.
Ferramentas: Postman.

Clonar aplicação: `https://github.com/DSB88/Estudo_MicroService.git`<br>

localhost da eureka: `localhost:8010`<br>
localhost do zuul-server: `localhost:8011`<br>

<strong>A ordem do build é importante, seguir conforme abaixo. </strong><br>
1. primeiro Build: config-server
2. segundo Build: eureka-server
3. terceiro Build: zuul-server
4. quarto Build: controle-pessoas-ms
5. quinto Build: controle-animais-ms<br>
<br>

<img align="left" src="Microservicos/arquitetura/arquitetura-ms.JPG" />
