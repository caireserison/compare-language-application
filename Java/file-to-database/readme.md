###### Instalando Java:
https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

###### Instalando Maven:
` choco install maven `

###### Adicionando dependência:
````
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.6.0</version>
</dependency>
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.12.0</version>
</dependency>
````

###### Executando:
` mvn package `

` java -jar file-to-database-1.0-SNAPSHOT.jar `
