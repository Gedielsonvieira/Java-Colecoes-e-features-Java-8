# Java Collections: Dominando Listas, Sets e Mapas
> O grande foco desse treinamento foi o uso da API de Collections
## Trabalhando com ArrayList

### Lista de objetos
`-` <strong>Em uma lista guardamos referência e não objeto:</strong> Guardamos uma referência de um objeto em uma lista, e para conseguirmos visualizarmos sua representação como string devemos sobrescrever o método toString para transformar um objeto para string através da referência.<br><br>

`-` <strong> Interface Comparable: </strong> O método sort da classe Collections que recebe como parametro uma lista não compila ao tentarmos ordernar uma lista de referências, porque ela não sabe de que forma ordenar, então para isso precisamos "assinar um contrato" e implementar o método compareTo da classe Comparable com o critério de comparação.<br><br>

`-` Ao querer ordenar uma lista de forma diferente do que já foi implementada em uma classe podemos nos beneficiar do Java 8 que nos propõe conseguir fazer uma comparação sem ter que implementar um método na classe ou modificá-lo, podemos fazer isto através do método sort que recebe como argumento uma lista e o comparator.

#### Utilizando sort do Java 8   
     
* Método sort da classe Collections:

  * Collections.sort(listaDeAulas, Comparator.comparing(Aula::getTempo));<br><br>    

* Método sort da lista:

  * listaDeAulas.sort(Comparator.comparing(Aula::getTempo));

> Informamos que método que queremos que ele use para comparar aqueles valores e ordenar de acordo com aquilo. Aqui de acordo com o tempo.<br> <strong>Podemos falar assim: Comparator, compara e ordena para mim de acordo com o tempo.</strong>


## Relacionamentos com coleções
> Pimeiramente coleção é todo mundo que implementa a interface Collection.

#### Boas práticas em relação a orientação a objetos de como trabalhar com relacionamento de classes usando coleções:
✅ Uma boa prática em um objeto é que a única "pessoa" que muda os atributos daquele objeto é o próprio objeto.<br>
✅ Ser mais genérico para manter um baixo acoplamento e alta coesão (devemos nos comprometer menos com o objeto com tudo aquilo que ele faz e como ele faz)

### unmodifiable list
O melhor jeito de ordenar uma unmodifiable list seguindo algum critério é nos aproveitarmos da possibilidade de poder *passar a unmodifiable list no construtor de uma ArrayList tradicional* , podendo assim utilizar o método .sort() de Collections.

## O poder dos sets
Set é uma interface que define uma coleção.
> Diferente de uma lista que é uma sequência um Set é uma sacola onde todos os objetos estão lá jogados.

A estrutura de um Set é uma tabela de espalhamento

Utiliza-se o for para acessar os elementos

#### Benefícios:
✅ Um Set garante que nenhum elemento se repete. Por isso o método add(..) devolve um booleano que indica o sucesso da inserção.<br>
✅ Há métodos que fazem busca por um objeto, como contains(..) ou remove(..), que são muito mais rápidos se comparado com uma lista, (velocidade e performance).<br>
✅ Não garante a ordem de inserção.

## Equals e hashCode
> Equals por default só vai dar true se uma referência é igual a outra, devemos sobrescrever o método equals se queremos mudar o conceito de igualdade.

Imagine o seguinte:<br>
instaciamos um objeto do tipo Aluno e já o matricula-mos 

`
Curso javaCollections = new Curso("Java Collections", "Paulo");
`<br>
`
Aluno a1 = new Aluno("Luana", 5156);
`<br>
`
javaCollections.matricula(a1);
`<br>

E alguém quer saber se este aluno já foi matriculado:

`
System.out.println(javaCollections.estaMatriculado(luana));
`<br>

Aqui dará um erro bastante comum, o aluno está matriculado mas o retorno ainda é false, motivo:<br>
<strong>
Existe um problema bastante comum ao trabalhar com conjuntos o equals, image que para retornar se aquele aluno já foi matriculado ou não, 
como por default o equals retorna somente true se e somente se a referencia for igual, devemos sobrescrever o método equals, porém ainda continua dando false e o que ocorre é que como os conjuntos trabalham com  a tabela de espalhamento, que é uma estrutura de dados, para a verificação ocorre que  a comparação de igualdade não ocorre um por um e sim ele usa numeros e aloca os objetos categorizando por numeros e com isso ele espalha e para procurar ele verifica o número, e vai na sacola que tem esse numero, dessa forma tem-se a certeza de que o objeto procurado estará na "sacola" com esse numero e não em outras "sacolas".</strong>

Esse número mágico é gerado utilizando o método hashCode, por isso precisamos sobrescrevê-lo, mudando-o para quando criarmos um objeto Aluno com o mesmo nome, que esses objetos gerem o mesmo hashCode e portanto, fiquem no mesmo grupo.


### ⚠️Regra: 
#### Sempre que reescrevemos o método equals ao utilizar conjuntos devemos sobreescrever o método hashcode.

### ⚠️Observação:
#### Apesar de ser perigoso, se estamos verificando se um elemento pertence a uma implementação de List, só precisamos reescrever o método equals(), já que o método .contains() de List só utiliza o equals para comparação.


## Outros sets
* O LinkedHashSet nos dá a performance de um HashSet mas com acesso previsível e ordenado.<br><br>
* TreeSet só funciona para classes que implementam a interface Comparable, porque internamente o TreeSet guarda os objetos na sua ordem natural, que é a ordem implementada por meio do Comparable.

## Mapas
`-` <strong>Map é uma interface</strong>
> " É comum que dentro de classes agente trabalhe com várias coleções lá dentro e que cada uma serve para uma coisa interessaante. "



### características do map
✅ Através da chave conseguimos acessar o valor: Ela funciona da seguinte maneira, mapeia valores para chaves, e através da chave conseguimos acessar o valor correspondente. Por isso ela não pode ser repetida, ao contrário do valor, que podem existir iguais.<br><br>
✅ chave repetida é sobrescrita pela nova: se uma chave for repetida, a antiga permanece, porém, o valor é sobrescrito pelo novo valor contido na chave passada, sendo o antigo valor "esquecido" pelo Map.<br><br>
✅ O método utilizado para adicionar um elemento em um Map é o método put. Ele recebe dois parâmetros, a chave e o valor.<br>

O <strong>LinkedHashMap</strong> continua nos dando a performance de um <strong>HashMap</strong>, mas com acesso previsível e ordenado, seguindo a inserção dos seus elementos.


## Qual Collection usar?
<strong>Será utilizado a Collection que mais agrega-rá ao negócio.</strong><br>

    Exemplo:  Precisamos usar uma coleção que deve guardar os alunos ordenados pelo número de matrícula e não pode ter elementos repetidos.
    Sendo assim devemos utilizar <strong>Treeset</strong> - pois a implementação TreeSet já ordena os seus elementos na hora da inserção e como é um conjunto não terá elementos repetidos.

    Neste caso não poderiamos usar:
    <strong>LinkedHashSet</strong> pois não garante ordenação;
    <strong>ArrayList</strong> não é um conjunto, isto é, permite elementos repetidos.
    <strong>HashSet</strong> atende a primeira condição, de não ter elementos repetidos, mas não possui ordenação.

## ❗ Importante: 
#### Programe sempre defensivamente:

✅ Verificar se é null os atributos passados em nossos construtores.<br>
✅ Quando devolver referencia para objetos devolver algo imutável.

#### O que é Ordem natural dos objetos?
✅ É a ordem definida pelo comparable na classe.

#### Resumo dos mais utilizados:
* Da interface List:<br>
  ✅ ArrayList<br><br>

* Da interface Set:<br>
  ✅ HashSet<br><br>

* Da interface Map:<br>
  ✅ HashMap


