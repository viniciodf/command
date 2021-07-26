Padroes de Projeto

1) Criacionais -> Os padrões criacionais fornecem vários mecanismos de criação de objetos, que aumentam a flexibilidade e reutilização de código já existente.
2) Estruturais -> Os padrões estruturais explicam como montar objetos e classes em estruturas maiores mas ainda mantendo essas estruturas flexíveis e eficientes.
3) Comportamentais -> Padrões comportamentais são voltados aos algoritmos e a designação de responsabilidades entre objetos.

* Comportamentais

2.Command

O que é:
O Command é um padrão de projeto comportamental que converte solicitações ou operações simples em objetos.

Aplicabilidade:
Utilize o padrão Chain of Responsibility quando é esperado que seu programa processe diferentes tipos de pedidos em várias maneiras, mas os exatos tipos de pedidos e suas sequências são desconhecidos de antemão.
Utilize o padrão quando é essencial executar diversos handlers em uma ordem específica.
Utilize o padrão CoR quando o conjunto de handlers e suas encomendas devem mudar no momento de execução.

Identificação:
O padrão Command é reconhecível por métodos comportamentais em um tipo abstrato/interface (remetente) que chama um método em uma implementação de um tipo abstrato/interface diferente (destinatário) que foi encapsulado pela implementação do comando durante a sua criação. As classes do Command geralmente são limitadas a ações específicas.

Exempos de utilizacao:
java.lang.Runnable
javax.swing.Action