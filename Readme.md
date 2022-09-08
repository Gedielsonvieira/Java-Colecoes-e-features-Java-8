# Java e java.util: Coleções, Wrappers e Lambda expressions

> Uma lista significa, simplesmente, que estamos armazenando elementos em sequência

## Conhecendo Arrays
✅ Um array é um objeto<br>
✅ Um array é sempre inicializado com os valores padrões.<br>
✅ É uma estrutura de dados e serve para guardar elementos (valores primitivos ou referencias).<br>
✅ Arrays tem um tamanho fixo<br>
✅ Ao acessar uma posição inválida recebemos a exceção ArrayIndexOutOfBoundException

### Desvantagem do array
❌ Array não sabe quantas posições estão ocupadas (apenas tamanho total)<br>
❌ Array tem um tamanho fixo (não pode crescer dinamicamente)<br>
❌ Sintaxe fora do padrão "OO Java"

#### Forma "classica" de criar um objeto array usando a palavra chave new, exemplo:

int[] numeros = new int[2];
numeros[0] = 1;
numeros[1] = 2;

#### Forma literal:
- Significa usar valores diretamente, mais direto.<br>
Exemplo: int[] numeros = {1,2,3,4,5};

> ##### Processo ilustrado da Classe g.TesteArrayReferencias:
> Valor padrão de uma referencia é null

<img alt="TesteArrayReferencias" src="./ArrayWithCast/src/TestaArrayReferencias.jpg">

## Conhecendo ArrayList e Generics
✅ Ao adicionar o elemento sempre fica no fim da lista.<br>
✅ O limite do objeto do tipo java.util.ArrayList é a memória da JVM.<br>
✅ Guarda referências.<br>
✅ É do pacote java.util<br>
✅ Usa internamente um array

### Benefício dos Generics
✅ O código fica mais legível, já que fica explícito o tipo dos elementos.<br>
✅ Evitar casts excessivos porque uma vez parametrizada a lista, não precisamos mais o cast.<br>
✅ Antecipar problemas de casts no momento de compilação.
️

## Equals e mais listas
contains - O contains verificará se dentro daquela lista, tem o objeto passado como paramento no método
<strong>
> Equals: O método "contains" de uma lista usa o "equals" por de baixo dos panos, por isso onde se precisa fazer uma comparação customizada é importante fazer a alteração no "equals", já que o "contains" é dependende dele.
</strong> 

> O método equals, junto aos métodos toString e hashCode, é um dos métodos fundamentais da classe Object.


### Listas

> <strong> List é uma interface que define os métodos da lista, a ArrayList e a LinkedList são implementações</strong>

* #### ArrayList
  > ArrayList  utiliza um array internamente com redimensionamento dinâmico.

    <strong>Pontos positivos:</strong><br>
✅ Acesso fácil a qualquer elemento aleatório pelo índice<br>
✅ Adicionar novos elementos em um array é um processo simples<br><br>

    <strong>Pontos negativos:</strong><br>
❌ A capacidade é limitada ao seu tamanho no momento da criação, ou seja, uma vez que sua capacidade acaba, é necessária a criação de um novo array, com capacidade maior, e copiar os elementos do antigo array para o novo.<br>
❌ Se quisermos remover um elemento, o array não permitirá que existam "buracos" em sua lista e, sendo assim, moverá todas as referências de modo que todos os índices serão modificados

    > Se for apagar elementos do arraylist o arraylist não é recomendado, por que a cada elemento que for apagado do inicio, ele tem que reorganizar tudo, agora se for somente inserir elementos e iterar ele é o tipo de lista recomendada.

<br>

* #### LinkedList
  > Linkedlist utiliza a estrututa de dados de uma lista duplamente encadeada

  <strong>Pontos positivos</strong><br>
  ✅ Remover um elemento - pois ao remover é simplesmente informar qual será o próximo e o anterior aquele elemento.<br><br>

  <strong>Ponto negativo</strong><br>
  ❌ Não conseguimos buscar diretamente um elemento aleatório pois temos que iterar desde o começo da lista até encontrar o elemento.



### ❗ Tipos de listas mais utilizadas no mercado:
* Arraylist
* set
* map