# Imprime Números Ímpares em um Intervalo

## Visão Geral

Este programa Java solicita ao usuário que digite um número inteiro entre 0 e 1000. Em seguida, ele itera de 1 até o número digitado e imprime todos os números ímpares encontrados dentro desse intervalo, juntamente com o intervalo completo.

## Como Usar

Para executar este programa, você precisará ter o Java Development Kit (JDK) instalado em seu computador.

**Passos para executar o programa:**

1.  **Salve o código:** Salve o código Java fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`. A estrutura de pastas deve ser:
    ```
    seu_projeto/
    └── principal/
        └── Main.java
    ```

2.  **Compile o código:** Abra o terminal ou prompt de comando, navegue até a pasta raiz do seu projeto e execute o seguinte comando para compilar o código Java:
    ```bash
    javac principal/Main.java
    ```
    Isso irá gerar um arquivo chamado `Main.class` dentro da pasta `principal`.

3.  **Execute o programa:** No mesmo terminal ou prompt de comando, execute o programa com o comando:
    ```bash
    java principal.Main
    ```
    O programa solicitará que você digite um número no console.

## Explicação do Código

O código Java realiza as seguintes ações:

* **Importa `java.util.Scanner`:** Importa a classe `Scanner`, que é usada para obter entrada do usuário através do console.
* **Declaração da classe `Main`:** Define a classe principal do programa.
* **Método `main`:** O ponto de entrada da execução do programa.
* **Cria um objeto `Scanner`:**
    * `Scanner sc = new Scanner(System.in);`: Cria uma instância da classe `Scanner` chamada `sc`, que lê a entrada do sistema (o teclado, neste caso).
* **Solicita entrada do usuário:**
    * `System.out.println("Digite um numero de 0-1000 ");`: Exibe uma mensagem no console pedindo ao usuário para digitar um número entre 0 e 1000.
* **Lê a entrada do usuário:**
    * `int x = sc.nextInt();`: Lê o número inteiro que o usuário digitou no console e o armazena na variável `x`.
* **Loop `for`:** Um loop `for` é executado, começando de 1 e indo até o valor de `x` (inclusive).
    * **Verifica se o número é ímpar:**
        * `if(i % 2 != 0)`: Dentro do loop, para cada número `i`, esta condição verifica se o resto da divisão de `i` por 2 é diferente de 0. Se for, significa que `i` é um número ímpar.
    * **Imprime o número ímpar:**
        * `System.out.println("Todos os numeros de 1 até :" + x +" "+ i);`: Se o número `i` for ímpar, esta linha imprime no console a mensagem indicando o intervalo (de 1 até o valor de `x`) e o valor do número ímpar `i`.
* **O objeto `Scanner` não é explicitamente fechado:** Embora não seja estritamente necessário para programas simples como este, em aplicações maiores é boa prática fechar o objeto `Scanner` quando ele não for mais utilizado (e.g., `sc.close();` após o loop).

## Entrada do Usuário

O programa utiliza a classe `Scanner` para receber a entrada do usuário diretamente no console (linha de comando). Quando o programa é executado, ele exibirá a mensagem "Digite um numero de 0-1000 ". O usuário deve então digitar um número inteiro e pressionar Enter. Este número será usado como o limite superior do intervalo.

## Requisitos

* Java Development Kit (JDK) instalado no sistema.

## Como Executar

1.  Certifique-se de ter o JDK instalado.
2.  Salve o código em `seu_projeto/principal/Main.java`.
3.  Abra o terminal e navegue até a pasta `seu_projeto`.
4.  Compile o código com: `javac principal/Main.java`
5.  Execute o programa com: `java principal.Main`

## Exemplo de Uso

1.  Após executar o programa, o seguinte aparecerá no seu terminal:
    ```
    Digite um numero de 0-1000
    ```
2.  Se você digitar `10` e pressionar Enter, a saída no console será:
    ```
    Todos os numeros de 1 até :10 1
    Todos os numeros de 1 até :10 3
    Todos os numeros de 1 até :10 5
    Todos os numeros de 1 até :10 7
    Todos os numeros de 1 até :10 9
    ```

## Autor

gustavodees

gustavoemartins@gmail.com
