#Definições java

"get" - Pega valor
"set" - Enviar algum valor

"private" - apenas visível dentro da classe
"protected" - visível dentro da classe e também para as filhas
"public" - visível em todo lugar



O que é verdade sobre classes "ABSTRATAS"?
-Podem ter atributos
Correto, podemos sim ter atributos! Uma classes abstrata é uma classe normal, só não pode instanciar e pode ter métodos abstratos. O resto continua valendo!
-Podem ter métodos concretos (com implementação)
Correto, como podem ter atributos também podem ter métodos concretos!
-Podem ter métodos abstratos (sem implementação)
Correto, como vimos uma classe abstrata pode ter métodos sem implementação. Dessa forma obrigamos um filho implementar o método.
-Não podem ser instanciadas
Correto, pois o que é abstrato (a classe) não pode se tornar concreto (objeto). Por isso não podemos instanciar objetos de uma classe abstrata.




Entendo Herança e interface
"Interfaces"
Ela é um contrato onde quem assina se responsabiliza por implementar esses métodos (cumprir o contrato)
Garante que todos os métodos de classes que implementam uma interface possam ser chamados com segurança.


Sobre classes abstratas e interfaces, selecione todas as afirmativas verdadeiras:

-Podemos estender apenas uma classe abstrata, mas podemos implementar várias interfaces.
-Todos os métodos de uma interface são abstratos, os de uma classe abstrata podem não ser.

"Polimorfismo"
-É a capacidade de um objeto ser referenciado por vários tipos.
-Temos polimorfismo quando uma classe extende de outra ou também quando uma classe implementa uma interface.


####Correto, atributos e métodos protected podem ser visto pelas próprias classes e suas filhas... Porém, com private apenas a própria classe enxerga os atributos/métodos.

JWT - padrão de um token que é utilizado para autenticação
IAM - Autenticação de usuario para vincular


menu de produtos



Correto, como vimos uma classe abstrata pode ter métodos sem implementação. Dessa forma obrigamos um filho implementar o método.
-Não podem ser instanciadas
Correto, pois o que é abstrato (a classe) não pode se tornar concreto (objeto). Por isso não podemos instanciar objetos de uma classe abstrata.


"Entendendo Exceções"

Por que a JVM usa um Stack?
-Para organizar a execução dos métodos
Uma pilha Java faz parte da JVM e armazena os métodos que estão sendo executados. Além do bloco de código a pilha guarda os variáveis e as referências desse bloco. Assim a JVM organiza a execução e sabe exatamente qual
método está sendo executado que é sempre o método no topo da pilha. A JVM também sabe quais outros precisam ser executados ainda, que são justamente os métodos abaixo.
-Para saber qual método está sendo executado
Uma pilha Java faz parte da JVM e armazena os métodos que estão sendo executados. Além do bloco de código a pilha guarda os variáveis e as referências desse bloco. Assim a JVM organiza a execução e sabe exatamente qual método está sendo executado que é sempre o método no topo da pilha. A JVM também sabe quais outros precisam ser executados ainda, que são justamente os métodos abaixo.


---Existe uma hierarquia grande de classes que representam exceções. Por exemplo, ArithmeticException é filha de RuntimeException, que herda de Exception, que por sua vez é filha da classe mais ancestral das exceções, Throwable. Conhecer bem essa hierarquia significa saber utilizar exceções em sua aplicação.
Throwable é a classe que precisa ser extendida para que seja possível jogar um objeto na pilha (através da palavra reservada throw)

---Exceções são separadas em duas grandes categorias: aquelas que são obrigatoriamente verificadas pelo compilador e as que não são verificadas. As primeiras são denominadas checked e são criadas através do pertencimento a uma hieraquia que não passe por RuntimeException. As segundas são as unchecked, e são criadas como descendentes de RuntimeException.

De que maneira as exceptions podem ajudar a melhorar o código de seu programa?

 - Exceções tem um nome e, caso esse nome seja expressivo, documenta o problema que está ocorrendo.
 - Exceções podem ter uma mensagem, ou seja, o problema e o estado das variáveis podem ser descritos na mensagem.
 - Exceções mudam o fluxo de execução, ou seja, evitam que o problema siga o fluxo "normal" quando algo excepcional acontece.
 - Exceções podem ser tratadas, ou seja, podemos voltar para a execução "normal" caso o "problema" esteja resolvido.


 "PACOTES e JAVA.lan"

 O que é o FQN mesmo?
 -Correto, o FQN (Full Qualified Name) é nome completo da classe, composto pelo nome do pacote e o nome da classe.
 -FQN = Nome Pacote . Nome Simples da Classe

 --Temos quatro modificadores: private, protected, default e public. Onde a ordem do MAIS restritivo para o MENOS restritivo é: private, default, protected e public.



 ###System.out.println("Teste")


 System
 -classe,java.lang,acesso publico(public)

 out
 -atributo,publico,referencia,static

 println
 -metodo,publico,não static, sobrecarga,nao joga excecoes do tipo checked
