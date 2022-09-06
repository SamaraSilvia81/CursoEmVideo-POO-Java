# Relacionamento Entre Classes
Esse conteúdo foi implementado nas aulas 07 e 08, tendo como premissa que relacionamento entre classes: _"Representa-se como uma relação de Dependência apontando de uma classe que possui um método ou operação para a classe que é utlizada como um parâmetro para essa operação."_ 

## Tópicos 
- Aula 07
  - Aula07a - Relacionamento entre classes
  - Aula7b - Objetos Compostos
- Aula 08
  - Aula08a - Relacionamento de Agregação
  - Aula08b - Agregação entre objetos

## Desafio Proposto 
O estudante deverá implementar um sistema de UEC (Ultra Emoji Combat) , aplicando os assuntos apresentados em sala. Os requisitos da tarefa são: 
- Classe Lutador: 
   - Atributos - nome; nacionalidade; idade; altura; peso; categoria; vitorias; derrotas e empates;
   - Métodos - apresentar; status; ganharLuta; perderLuta e empatarLuta.
   - Categoria deve ser o representativo do relacionamento entre as classes, no qual dependendo dos parâmetros do peso (fica a critério do programador) terá categorias do lutador como, por exemplo, peso leve, médio, elevado e afins. Isso também, ficará a critério do programador;
   - Métodos Especiais: Getters; Setters e Construtor;
 - Classe Luta: É exclusiva para marcar as lutas entre os lutadores.
   - Atributos - desafiado; desafiante; rounds e aprovada;
   - Métodos - marcarLuta e lutar;
   - Categoria deve ser o representativo do relacionamento entre as classes, no qual dependendo dos parâmetros do peso (fica a critério do programador) terá categorias do lutador como, por exemplo, peso leve, médio, elevado e afins. Isso também, ficará a critério do programador;
   - Métodos Especiais: Getters e Setters;
- Regras da Luta:
  - Só pode ser mascada entre lutadores da mesma categoria;
  - Desafiado e desafiante devem ser lutadores diferentes;
  - Só pode acontecer se estiver aprovada;
  - Só pode ter como resultado a vitória de um dos lutadores ou o empate;

