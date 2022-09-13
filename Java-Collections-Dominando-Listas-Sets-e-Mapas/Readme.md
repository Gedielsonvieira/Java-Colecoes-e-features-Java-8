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


### ❗ Importante: 
✅ Programe sempre defensivamente!