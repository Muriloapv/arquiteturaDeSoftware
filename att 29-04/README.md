Atividade – Design Pattern: Adapter
Nome: Murilo Varoto
RA: 22215190-2

Este projeto demonstra a aplicação do padrão de projeto Adapter utilizando Node.js. O objetivo é converter dados de um arquivo CSV em objetos da classe Pessoa.

📁 Estrutura do Projeto
Pessoa.js – Classe que representa uma pessoa, contendo os atributos: nome, idade e email.

PessoaCsvAdapter.js – Classe adaptadora responsável por ler o arquivo CSV e transformar cada linha em uma instância da classe Pessoa.

pessoas.csv – Arquivo com os dados brutos em formato CSV.

main.js – Script principal que utiliza o adaptador para carregar e exibir a lista de pessoas.

▶️ Como Executar
Certifique-se de ter o Node.js instalado;

No terminal, execute o comando:

bash
Copiar
Editar
node main.js