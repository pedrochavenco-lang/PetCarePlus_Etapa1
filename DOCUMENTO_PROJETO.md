\# Documento de Projeto de Software – PetCare+



\## 1. Identificação do projeto



\*\*Nome:\*\* PetCare+  

\*\*Tipo de sistema:\*\* Sistema de gerenciamento de clínica veterinária  

\*\*Linguagem:\*\* Java  

\*\*Ambiente de desenvolvimento:\*\* Apache NetBeans  

\*\*Versão:\*\* Etapa 1 – Projeto Integrador



\## 2. Descrição do sistema



O PetCare+ é um sistema destinado ao gerenciamento de informações básicas de uma clínica veterinária. Seu objetivo é facilitar a organização dos dados de clientes, animais, veterinários e consultas.



Nesta etapa, foi desenvolvida uma versão demonstrativa em Java, com armazenamento de consultas em memória. O projeto foi estruturado de maneira que suas responsabilidades estejam separadas, facilitando futuras expansões e a reutilização das regras de negócio em uma aplicação web.



\## 3. Objetivo



Desenvolver uma base de sistema orientado a objetos que permita organizar os dados e as operações de uma clínica veterinária, utilizando boas práticas de programação, princípios SOLID e separação de responsabilidades.



\## 4. Problema identificado



Clínicas veterinárias precisam organizar informações sobre clientes, seus animais, profissionais e atendimentos. Quando esses dados não possuem uma estrutura adequada, sua consulta e manutenção podem se tornar difíceis.



O PetCare+ propõe uma estrutura inicial para representar essas informações e facilitar o desenvolvimento futuro de funcionalidades de gerenciamento.



\## 5. Requisitos funcionais



| Código | Requisito |

|---|---|

| RF01 | Cadastrar e representar clientes. |

| RF02 | Cadastrar e representar animais vinculados a clientes. |

| RF03 | Cadastrar e representar veterinários. |

| RF04 | Criar registros de consultas veterinárias. |

| RF05 | Associar uma consulta a um animal e a um veterinário. |

| RF06 | Armazenar consultas em memória. |

| RF07 | Listar as consultas cadastradas. |



\## 6. Requisitos não funcionais



| Código | Requisito |

|---|---|

| RNF01 | O sistema deve ser desenvolvido em Java. |

| RNF02 | O código deve ser organizado em pacotes e classes. |

| RNF03 | O sistema deve aplicar princípios SOLID, especialmente SRP. |

| RNF04 | O armazenamento deve ser isolado por uma abstração de repositório. |

| RNF05 | O projeto deve permitir futuras evoluções, como integração com banco de dados. |

| RNF06 | O projeto deve ser compilável e executável no NetBeans. |



\## 7. Regras de negócio



\- Uma consulta deve possuir um identificador.

\- Uma consulta deve estar associada a um animal.

\- Uma consulta deve estar associada a um veterinário.

\- Uma consulta deve possuir data, horário e descrição.

\- As consultas cadastradas são armazenadas em memória nesta versão.

\- A aplicação deve permitir consultar a quantidade de registros armazenados.



\## 8. Estrutura do sistema



O projeto foi organizado nos seguintes pacotes:



\### `br.com.petcareplus.model`



Contém as classes que representam as entidades do sistema:



\- `Cliente`

\- `Animal`

\- `Veterinario`

\- `Consulta`



\### `br.com.petcareplus.repository`



Contém as classes responsáveis pelo armazenamento:



\- `Repositorio`

\- `RepositorioConsultaMemoria`



\### `br.com.petcareplus.service`



Contém a lógica de negócio:



\- `ConsultaService`



\### `br.com.petcareplus`



Contém a classe de execução:



\- `Main`



\## 9. Tecnologias utilizadas



\- Java

\- Apache NetBeans

\- Git

\- GitHub

\- Padrão Repository

\- Princípios SOLID



\## 10. Possíveis evoluções



Como evolução do projeto, podem ser implementadas:



\- Interface web para acesso ao sistema.

\- Integração com banco de dados.

\- Cadastro completo de clientes e animais.

\- Gerenciamento de consultas.

\- Cadastro de exames, medicamentos e procedimentos.

\- Autenticação e controle de acesso.



\## 11. Considerações finais



O PetCare+ apresenta uma estrutura inicial para um sistema de gerenciamento veterinário, utilizando programação orientada a objetos e boas práticas de desenvolvimento.



A separação de responsabilidades e a abstração de armazenamento permitem que o projeto seja ampliado futuramente, mantendo uma organização adequada do código.

