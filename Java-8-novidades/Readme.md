# Java 8: conheça as novidades dessa versão

## Default Methods
> Método que dentro de uma interface tem implementação 

❌ Antes nenhum método em uma interface poderia ter corpo, mas:

✅ A partir do java 8, métodos podem ter corpo em uma interface através dos default methods


> O Default Method é um recurso disponível do java 8 pra frente, que permite que a gente escreva a implementação padrão para o método de uma interface.<br>
<strong>Isto quer dizer que, quando implementarmos a interface, não seremos obrigados a implementar esses métodos default, pois eles já vem com uma implementação de "fábrica".<br></strong>
Quando colocamos a palavra chave default na declaração do método em uma interface, dizemos que ele será um default method e fornecemos sua implementação, ali mesmo na interface.<br>
<strong>Com isso a grande vantagem é que agora uma interface pode evoluir sem quebrar compatibilidade.</strong>

✅ Método sort continua na classe Collections porém agora também faz parte da interface List sendo um método default

Outra forma de iterar sob uma coleção é com o forEach da interface iterable, que agora 
o novo método forEach recebe como parâmetro a interface Consumer.

## Lambdas
> Uma função lambda é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado.

> Tendo a dificuldade de entendimento e verbosidade da sintaxe das classes anônimas, o Java 8 traz uma nova forma de implementar essas interfaces de maneira mais simples. É a sintaxe do lambda.<br><br>
Dado uma String imprimi aquela String:<br>
Ex: ArrayList.forEach( s -> System.out.println( s ) );<br>
Processo: O Java sabe que o forEach recebe consumer e ele vai atribuir  o valor de s -> System.out.println( s ) para dentro do Consumer, porque um Consumer recebe  um único argumento de entrada no nosso caso uma String e devolve void que é o mesmo que ocorre no s que recebe uma String e não tem nada para devolver.<br><br>
<strong>Uma expressão lambda consegue ser convertida em uma interface funcional</strong><br><br>
Ex: Consumer<String> impressor = s -> System.out.println(s);<br>
Arraylist.forEach(impressor);<br><br>
<strong>Interface funcional é aquela interface que só tem um método abstrato. Além desse método ela pode ter outros métodos, contanto que sejam default ou 'static'.</strong>

### Funções lambdas:
✅ Vieram para reduzir código;<br>
✅ Ter uma melhor legibilidade; e<br>
✅ Principalmente para viabilizar a programação funcional utilizada com Streams
 

### ❗ Importante:
✅ Para trabalhar com lambda, uma interface funcional precisa estar envolvida.<br>
* <strong>É possível sim, instanciar uma classe abstrata ou uma interface!</strong> Para isso devemos: <br>
  * Implementar todos os métodos abstratos, ou seja, todos os métodos da interface; <br>
  * E só devemos usar o "new" para implementação de uma interface em classes anônimas.


## Method references
> Esse recurso nos permite chamar um método usando referência de método.

## Streams: trabalhando melhor com coleções
> oferece ao desenvolvedor a possibilidade de trabalhar com conjuntos de elementos de forma mais simples e com um número menor de linhas de código

✅ Stream é uma interface<br>
✅ Toda collection tem um método que se chama stream, que nos traz uma forma de trabalhar com objetos<br>
✅ Stream não impacta na coleção original<br>

### Optionals
> Optionals surgiram para evitar nullPointerExceptions e antes de tentar obter algo, podemos validar se realmente existe.
 
## API de datas

✅ Toda API de data é imutável

Não conseguimos instanciar a classe <strong>LocalDate</strong> porque já que o <strong>construtor é explicitamente privado, essa classe não pode ser instanciada de fora dessa classe</strong>

Se precisar de hora minuto ou segundo, utilizar a classe <strong>LocalDateTime</strong>