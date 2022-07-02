Detalhes para utilização:

Chamadas REST:
Somar: http://localhost:8181/calculadora/somar/{valor1}/{valor2}
Exemplo somar: http://localhost:8181/calculadora/somar/1.5/2
Retorno: "O resultado da soma é: 3.5"

Subtrair: http://localhost:8181/calculadora/subtrair/{valor1}/{valor2}
Exemplo subtrair: http://localhost:8181/calculadora/subtrair/1.5/2
Retorno: "O resultado da subtração é: -0.5"

Multiplicar: http://localhost:8181/calculadora/multiplicar/{valor1}/{valor2}
Exemplo multiplicar: http://localhost:8181/calculadora/multiplicar/1.5/2
Retorno: "O resultado da multiplicação é: 3.0"

Dividir: http://localhost:8181/calculadora/dividir/{valor1}/{valor2}
Exemplo dividir: http://localhost:8181/calculadora/dividir/1.5/2
Retorno: "O resultado da divisão é: 0.75"

Calcular Todos: http://localhost:8181/calculadora/calcular-todos/{valor1}/{valor2}
Exemplo calcular todos: http://localhost:8181/calculadora/calcular-todos/1.5/2
Retorno: "Os resultados são:
            O resultado da soma é: 3.5
            O resultado da subtração é: -0.5
            O resultado da multiplicação é: 3.0
            O resultado da divisão é: 0.75"



# code-with-quarkus Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
