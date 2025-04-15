📁 Projeto: Somatória Fracionária Recursiva

📌 Descrição: >
  Aplicação em Java que calcula a somatória fracionária de um número inteiro `n`, 
  no formato `S = 1 + 1/2 + 1/3 + ... + 1/n`, utilizando uma função recursiva. 
  O método chama a si mesmo incrementando um índice até atingir o valor de `n`.

🗂️ Estrutura de Arquivos:
  - 📄 src/controller/SomatoriaFracionaria.java: Contém o método recursivo responsável por calcular a soma.
  - 📄 src/view/Principal.java: Realiza a entrada do número via interface gráfica e exibe o resultado.

🧠 Lógica da Recursividade:
  método: resultado(int n, int i)
  explicação:
    - ✋ Condição de parada: Quando `i > n`, a função retorna 0, encerrando a recursão.
    - 🔁 Relação recursiva:
        - Soma `1.0 / i` ao resultado da próxima chamada `resultado(n, i + 1)`, construindo a série de forma ascendente.

💬 Exemplo de Execução:
  entrada:
    - Número: 4
  saída:
    - O resultado da somatória é: 2.083333333333333

📥 Entrada:
  - O usuário insere um número inteiro positivo através de um `JOptionPane`.

📤 Saída:
  - O programa exibe o resultado da somatória fracionária total em um `JOptionPane`.

📌 Observações:
  - A precisão do resultado pode ser ajustada usando formatação, caso deseje limitar casas decimais.
  - O uso da recursão foi aplicado com controle de índice externo (`i`) para melhor entendimento e controle do processo.
  - Implementado seguindo o padrão MVC, com separação clara entre lógica e interface.

👨‍💻 Autor:
  Desenvolvido por **Lucas Bezerra de Macedo**.
