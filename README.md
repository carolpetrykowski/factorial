# factorial

Aplicação que realiza o cálculo fatorial de um número.

<br>

**Como rodar a aplicação:**
<ol>
    <li>
        Na pasta /factorial/database, rode o comando:
        <ul><li>$ sudo docker-compose -f docker-compose.yml up</li></ul>
    </li>
    <li>
        Na pasta raiz do projeto (/factorial), rode os comandos:
        <ul>
            <li>$ mvn clean install -DskipTests</li>
            <li>$ mvn spring-boot:run</li>
        </ul>
    </li>
    <li>
        No navegador acesse:
        <ul><li>http://localhost:8080/calcs</li></ul>
    </li>
</ol>

![Factorial](https://user-images.githubusercontent.com/41487157/93271407-8b6d5580-f789-11ea-88f6-3c49cb0237c0.gif)

<br>

**Para rodar o teste unitário:**
<ol>
    <li>
        Na pasta raiz do projeto (/factorial), rode os comandos:
        <ul>
            <li>$ mvn clean install</li>
            <li>$ mvn test</li>
        </ul>
    </li>

</ol>

---

<h4>Bibliotecas e funcionalidades utilizadas:</h4>
* **Springboot:** Projeto da Spring, tem por objetivo facilitar a configuração de projetos. Com ele é possível escoher os módulos que deseja por meio dos starters, as dependências deles, por sua vez, são incluídas no arquivo `pom.xml`.
* **Thymeleaf:** Template engine, usado para facilitar a criação da camada de visualização de dados na aplicação.
* **Bootstrap:** Framework web, usado para o desenvolvimento de interfaces web.
* **Docker:** Tecnologia de containerização, permite encapsular aplicações ou ambientes dentro de um container. 
* **jUnit:** Framework utilizado para testes. Com ele podem ser feitas verificações se os resultados esperados estão sendo obtidos a partir do código implementado, caso a resposta esperada não seja obtida, o JUnit exibe os possíveis erros.
* **Spring Data JPA:** Framework para facilitar a criação de repositórios, pois já possiu alguns métodos prontos, como consultas.  
* **Spring Web:** Para criar aplicativos web, usando Spring MVC.