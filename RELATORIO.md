\# Relatório da Atividade – PetCare+



\*\*Projeto Integrador – Etapa 1\*\*  

\*\*Aluno:\*\* Pedro  

\*\*Projeto:\*\* PetCare+  

\*\*Linguagem:\*\* Java  

\*\*IDE:\*\* Apache NetBeans  

\*\*Repositório GitHub:\*\* https://github.com/pedrochavenco-lang/PetCarePlus\_Etapa1



\## 1. Introdução



O PetCare+ é um sistema desenvolvido para representar funcionalidades básicas de uma clínica veterinária, permitindo organizar informações de clientes, animais, veterinários e consultas.



Nesta etapa, foi desenvolvido um novo projeto Java com o objetivo de organizar o código em classes e pacotes, separar responsabilidades e facilitar a reutilização das regras de negócio em uma futura aplicação web.



O projeto foi estruturado utilizando os princípios SOLID e o padrão Repository, buscando melhorar a organização, manutenção e evolução do sistema.



\## 2. Princípios SOLID aplicados



\### 2.1. Single Responsibility Principle (SRP)



O princípio da responsabilidade única estabelece que uma classe deve possuir uma responsabilidade principal.



Esse princípio foi aplicado na organização das classes:



\- \*\*Cliente:\*\* representa os dados do cliente.

\- \*\*Animal:\*\* representa os dados do animal e sua relação com o cliente.

\- \*\*Veterinario:\*\* representa os dados do profissional veterinário.

\- \*\*Consulta:\*\* representa as informações de uma consulta.

\- \*\*RepositorioConsultaMemoria:\*\* realiza o armazenamento das consultas em memória.

\- \*\*ConsultaService:\*\* concentra a lógica de agendamento e consulta dos registros.

\- \*\*Main:\*\* executa a demonstração e os testes básicos do sistema.



Essa separação evita que uma única classe concentre diferentes responsabilidades, facilitando a manutenção e a compreensão do código.



\### 2.2. Open/Closed Principle (OCP)



O princípio aberto/fechado determina que uma estrutura deve permitir extensão sem exigir alterações desnecessárias em seu funcionamento existente.



O projeto utiliza a interface `Repositorio<Consulta>` como abstração para o armazenamento. Dessa forma, é possível criar novas implementações de repositório, como uma versão conectada a um banco de dados, mantendo a lógica do serviço separada da implementação de armazenamento.



\### 2.3. Liskov Substitution Principle (LSP)



O princípio da substituição de Liskov estabelece que implementações de uma abstração devem poder ser utilizadas sem comprometer o funcionamento esperado.



A classe `RepositorioConsultaMemoria` implementa a interface `Repositorio<Consulta>`, seguindo o contrato definido por essa abstração. Isso permite que o serviço utilize uma implementação de repositório compatível.



\### 2.4. Interface Segregation Principle (ISP)



O princípio da segregação de interfaces recomenda que as classes não dependam de métodos que não utilizam.



A interface `Repositorio` define operações relacionadas ao armazenamento dos dados, evitando que o serviço dependa diretamente de uma classe concreta de armazenamento.



\### 2.5. Dependency Inversion Principle (DIP)



O princípio da inversão de dependência determina que módulos de alto nível devem depender de abstrações, e não diretamente de implementações concretas.



A classe `ConsultaService` utiliza a abstração `Repositorio<Consulta>`, recebida por meio do construtor. Assim, a lógica de negócio não depende diretamente da implementação `RepositorioConsultaMemoria`.



\## 3. Refatorações aplicadas



As principais melhorias realizadas foram:



\- Organização das classes em pacotes `model`, `repository` e `service`.

\- Separação dos dados das entidades e das regras de negócio.

\- Criação da interface genérica `Repositorio`.

\- Criação da implementação `RepositorioConsultaMemoria`.

\- Criação da classe `ConsultaService` para concentrar as operações relacionadas às consultas.

\- Separação da execução e demonstração do sistema na classe `Main`.

\- Uso de construtores para inicialização dos objetos.

\- Uso de `LocalDateTime` para representar a data e o horário da consulta.



Essas alterações ajudam a reduzir o acoplamento entre as classes e tornam o código mais organizado e compreensível.



\## 4. Padrão de projeto utilizado



\### Repository



O padrão Repository foi utilizado para separar a lógica de negócio da forma de armazenamento dos dados.



A interface `Repositorio` define a abstração de armazenamento, enquanto `RepositorioConsultaMemoria` implementa essa estrutura utilizando memória.



A classe `ConsultaService` utiliza o repositório por meio da interface, sem precisar conhecer os detalhes internos do armazenamento.



Essa abordagem facilita uma futura substituição do armazenamento em memória por um banco de dados.



\## 5. Testes realizados



A classe `Main` foi utilizada para realizar uma demonstração funcional do sistema.



Durante a execução, foram criados:



\- Um cliente chamado Ana Souza.

\- Um animal chamado Luna.

\- Um veterinário chamado Dr. Paulo Lima.

\- Uma consulta veterinária de rotina.



A aplicação foi compilada com sucesso no NetBeans e executada por meio do arquivo JAR gerado pelo projeto.



O resultado apresentado no terminal foi:



```text

PetCare+ - demonstracao

\-----------------------

Consulta{id=1, animal='Luna', veterinario='Dr. Paulo Lima', dataHora=2026-11-03T14:30, descricao='Consulta de rotina'}

Total de consultas cadastradas: 1

```



O resultado confirma que a consulta foi criada e armazenada corretamente na implementação em memória.



\## 6. Evidências do GitHub



O projeto foi publicado em um repositório GitHub:



https://github.com/pedrochavenco-lang/PetCarePlus\_Etapa1



A publicação foi realizada utilizando Git, com os comandos de inicialização do repositório, inclusão dos arquivos, criação do commit e envio para a branch `main`.



\*\*Evidências a serem incluídas:\*\*



\- Captura de tela do repositório GitHub com os arquivos do projeto.

\- Captura de tela da execução do sistema no terminal.

\- Captura de tela do resultado `BUILD SUCCESSFUL` no NetBeans.



\## 7. Considerações finais



O desenvolvimento do PetCare+ permitiu aplicar conceitos de programação orientada a objetos, princípios SOLID e o padrão Repository.



A separação das responsabilidades contribuiu para uma estrutura mais organizada e preparada para futuras evoluções, especialmente a implementação de uma aplicação web e a integração com um banco de dados.



A execução da aplicação demonstrou o funcionamento das operações básicas de criação e armazenamento de consultas.



O projeto representa uma base para a continuidade do desenvolvimento do sistema PetCare+.

