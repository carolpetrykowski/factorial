# factorial

Aplicação que realiza o cálculo fatorial de um número.

<br>

**Como rodar a aplicação:**
<ol>
    <li>
        Na pasta /factorial/database, rode o comando:
        <ul><li>$ sudo docker-compose -f docker-compose.yml up</li></ul>
        <ul><li>Em caso de erros, vide observação.</li></ul>
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

**Observação:**
* Caso algum erro venha a acontecer com o passo número 1 (criação do banco PostgreSQL, por meio do docker). Siga os passos abaixo:

<ol>
    <li>
        Dê permissão total para o arquivo docker-compose.yml, para isso execute:
        <ul><li>$ sudo chmod 777 docker-compose.yml</li></ul>
    </li>
    <li>
        Verifique existe algum processo rodando na porta 5432
        <ul><li>$ sudo ss -lptn 'sport = :5432'</li></ul>
    </li>
    <li>
        Se houver, mate o processo pelo número do PID
        <ul><li>$ sudo kill NUMERO_PID -9</li></ul>
    </li>
    <li>
        Por fim, verifique se não há nenhum conteiner já existente com o mesmo nome (nesse caso: postgres:9.6):
        <ul><li>$ docker ps -a</li></ul>
    </li>
    <li>
        Se houver, remova o conteiner existente:
        <ul><li>$ docker rm CONTAINER_ID</li></ul>
    </li>
</ol>

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

<ul>
    <li><b>Springboot:</b> Projeto da Spring, tem por objetivo facilitar a configuração de projetos. Com ele é possível escoher os módulos que deseja por meio dos starters, as dependências deles, por sua vez, são incluídas no arquivo pom.xml.</li>
    <li><b>Thymeleaf:</b> Template engine, usado para facilitar a criação da camada de visualização de dados na aplicação.</li>
    <li><b>Bootstrap:</b> Framework web, usado para o desenvolvimento de interfaces web.</li>
    <li><b>Docker:</b> Tecnologia de containerização, permite encapsular aplicações ou ambientes dentro de um container.</li>
    <li><b>jUnit:</b> Framework utilizado para testes. Com ele podem ser feitas verificações se os resultados esperados estão sendo obtidos a partir do código implementado, caso a resposta esperada não seja obtida, o JUnit exibe os possíveis erros.</li>
    <li><b>Spring Data JPA:</b> Framework para facilitar a criação de repositórios, pois já possiu alguns métodos prontos, como consultas.</li>
    <li><b>Spring Web:</b> Para criar aplicativos web, usando Spring MVC.</li>
</ul>