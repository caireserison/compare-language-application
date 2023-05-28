###### Instalando Java:
https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

###### Instalando Maven:
` choco install maven `

###### Adicionando dependência:
````
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.14.2</version>
</dependency>
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.0.0</version>
</dependency>
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.1</version>
</dependency>
````

###### Executando:
` mvn package `

` java -jar json_to_xlsx-1.0-SNAPSHOT.jar `
