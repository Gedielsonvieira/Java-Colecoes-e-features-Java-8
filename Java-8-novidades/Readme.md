# Java 8: conheça as novidades dessa versão

## Default Methods

✅ Método sort continua na classe Collections porém agora também faz parte da interface List

❌ Antes nenhum método em uma interface poderia ter corpo, mas:

✅ A partir do java 8, métodos podem ter corpo em uma interface através dos default methods


> O Default Method é um recurso disponível do java 8 pra frente, que permite que a gente escreva a implementação padrão para o método de uma interface.<br>
<strong>Isto quer dizer que, quando implementarmos a interface, não seremos obrigados a implementar esses métodos default, pois eles já vem com uma implementação de "fábrica".<br></strong>
Quando colocamos a palavra chave default na declaração do método em uma interface, dizemos que ele será um default method e fornecemos sua implementação, ali mesmo na interface.<br>
<strong>Com isso a grande vantagem é que agora uma interface pode evoluir sem quebrar compatibilidade.</strong>

Outra forma de iterar sob uma coleção é com o forEach da interface iterable, que agora 
o novo método forEach recebe como parâmetro a interface Consumer. ---- CONTINUAR EXPLICAÇÂO -----