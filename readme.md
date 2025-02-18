# Sistema de gerenciamento de clientes 💻
## Requisitos do Sistema 📋

O sistema deverá permitir o cadastro, alteração, exclusão e consulta de clientes. Cada cliente possui os seguintes atributos:

- Nome (String)
- CPF (String)
- Endereço (Class)
- Telefone (String)
- Tipo de Cliente (Enum: [NORMAL, VIP])
- Data de Cadastro (LocalDate)

## Funcionalidades ⚙️

### Cadastro de Cliente 🪪:

- O sistema deve solicitar ao usuário os dados do cliente, incluindo o tipo (NORMAL ou VIP).
A data de cadastro deve ser automaticamente definida como a data atual.
Alteração de Cliente:

- O sistema deve permitir que o usuário busque um cliente pelo CPF e altere seus dados.
Exclusão de Cliente:

- O sistema deve permitir que o usuário busque um cliente pelo CPF e o exclua do sistema.
- Consulta de Clientes:
    - O sistema deve permitir a consulta de clientes por nome ou CPF.
    - O sistema deve permitir a listagem de todos os clientes cadastrados.

## Requisitos Técnicos 🛠

- ✅ Sintaxe básica da linguagem Java: Utilize a sintaxe correta da linguagem Java na implementação do sistema.
- ✅ Acoplamento: Minimize o acoplamento entre as classes do sistema, utilizando interfaces e abstrações.
- ✅ Coesão: Mantenha as classes do sistema com alta coesão, ou seja, cada classe deve ter um único propósito e responsabilidade.
- ✅ Encapsulamento: Utilize o encapsulamento para proteger os atributos das classes e garantir a integridade dos dados.
- ✅ Classes Enum: Utilize classes enum para representar os tipos de clientes (NORMAL e VIP).
- ✅ Varargs: Utilize o recurso varargs para permitir que o método de cadastro de clientes receba um número variável de argumentos.
- ✅ Arrays: Utilize arrays para armazenar a lista de clientes cadastrados.
- ✅ Sobrecarga de métodos e sobrescrita: Utilize a sobrecarga de métodos para criar métodos com o mesmo nome, mas com diferentes parâmetros. Utilize a sobrescrita para criar métodos em classes filhas que substituem os métodos das classes pai.
- ✅ Blocos de inicialização: Utilize blocos de inicialização para inicializar atributos de classes antes da criação dos objetos.
