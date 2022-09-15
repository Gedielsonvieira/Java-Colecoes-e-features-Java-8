# Java Collections: Dominando Listas, Sets e Mapas

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


## ❗ Importante: 
#### Programe sempre defensivamente:

✅ Verificar se é null os atributos passados em nossos construtores.<br>
✅ Quando devolver referencia para objetos devolver algo imutável.

#### O que é Ordem natural dos objetos?
✅ É a ordem definida pelo comparable na classe.
