# Java e java.util: Coleções, Wrappers e Lambda expressions
## Conhecendo Arrays
✅ Um array é um objeto<br>
✅ Um array é sempre inicializado com os valores padrões.<br>
✅ É uma estrutura de dados e serve para guardar elementos (valores primitivos ou referencias).<br>
✅ Arrays tem um tamanho fixo<br>
✅ Ao acessar uma posição inválida recebemos a exceção ArrayIndexOutOfBoundException

> Valor padrão de uma referencia é null

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

> ##### Processo ilustrado da Classe TesteArrayReferencias:

<img alt="TesteArrayReferencias" src="Array-cast/TestaArrayReferencias.jpg">

## Guardando qualquer referencia

------------------
ESCREVER 
------------------
Type cast ou cast é transformar...

cast explicito e implicito

classCastException

## Arraylist e Generics
ArrayList simplifica o Array