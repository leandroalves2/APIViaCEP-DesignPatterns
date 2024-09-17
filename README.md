# Design Patterns - Projeto Spring Boot

## Visão Geral

Este projeto criado no bootcamp da DIO, é uma aplicação Spring Boot que demonstra a implementação de padrões de design, incluindo o padrão Facade e Singleton, bem como a integração com serviços externos usando o padrão Strategy e o padrão Feign Client.

### Estrutura do Projeto

- **Facade**: Implementação do padrão Facade para simplificar a interação com subsistemas.
- **Singleton**: Demonstração de três variações do padrão Singleton.
- **Strategy**: Implementação do padrão Strategy para comportamento de um objeto.
- **Spring Boot Application**: Integração com a API ViaCEP para consultar endereços e um serviço CRUD para gerenciar clientes.

## Padrões de Design

### 1. Facade

**Objetivo**: Fornecer uma interface simplificada para um conjunto de interfaces em um subsistema.

- **`CepApi`**: Subsystem API para recuperação de informações de cidade e estado com base no CEP.
- **`CrmService`**: Serviço para gravação de clientes em um sistema CRM.
- **`Facade`**: Classe que simplifica a interação com `CepApi` e `CrmService`.
- **`MainFacade`**: Classe de execução principal para demonstrar o uso da fachada.

### 2. Singleton

**Objetivo**: Garantir que uma classe tenha uma única instância e fornecer um ponto de acesso global a ela.

- **`SingletonEager`**: Implementação com instância criada no momento da carga da classe.
- **`SingletonLazy`**: Implementação com instância criada sob demanda.
- **`SingletonLazyHolder`**: Implementação usando um holder de classe para instância preguiçosa.

### 3. Strategy

**Objetivo**: Definir uma família de algoritmos, encapsular cada um e torná-los intercambiáveis.

- **`Comportamento`**: Interface para diferentes comportamentos de movimento.
- **`ComportamentoAgressivo`**: Implementação de comportamento agressivo.
- **`ComportamentoDefensivo`**: Implementação de comportamento defensivo.
- **`ComportamentoNormal`**: Implementação de comportamento normal.
- **`Robo`**: Classe que usa uma estratégia de comportamento para realizar movimentos.
- **`MainStrategy`**: Classe de execução principal para demonstrar o uso de diferentes estratégias.

### 4. Spring Boot Application

**Objetivo**: Criar uma aplicação Spring Boot que integra com o padrão Feign Client para consulta de endereços e fornece uma API REST para gerenciar clientes.

- **`ClienteRestController`**: Controlador REST para operações CRUD de clientes.
- **`Cliente`**: Entidade cliente associada a um endereço.
- **`Endereco`**: Entidade para armazenar informações de endereço.
- **`ClienteRepository`**: Repositório para acesso a dados de clientes.
- **`EnderecoRepository`**: Repositório para acesso a dados de endereços.
- **`ViaCepService`**: Serviço Feign Client para consultar o ViaCEP.
- **`LabPadroesProjetoSpringApplication`**: Classe principal de inicialização da aplicação Spring Boot.

## Configuração e Execução

1. **Clone o repositório**:

   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd lab-padroes-projeto-spring
   ```

2. **Construir o projeto com Maven**:

   ```bash
   ./mvnw clean install
   ```

3. **Executar a aplicação**:

   ```bash
   ./mvnw spring-boot:run
   ```

4. **Testar os endpoints REST**:

   - **GET** `/clientes` - Recuperar todos os clientes.
   - **GET** `/clientes/{id}` - Recuperar cliente por ID.
   - **POST** `/clientes` - Inserir um novo cliente.
   - **PUT** `/clientes/{id}` - Atualizar um cliente existente.
   - **DELETE** `/clientes/{id}` - Deletar um cliente por ID.

## Dependências

O projeto utiliza as seguintes dependências principais:

- Spring Boot
- Spring Data JPA
- Spring Cloud OpenFeign
- Maven
