# Yan Yamim

### Introdução
Sou Yan e atuo como desenvolvedor de software com experiẽncia em Java, Python e SQL, focando mais no desenvolvimento de API's e modelagem de dados. Além disso, tenho afinidade com alguns frameworks como SpringBoot e Vue.js e usando Docker para melhor integração de projetos. Meu foco está na criação de soluções escaláveis e eficientes, utilizando boas práticas de desenvolvimento e arquitetura de software. Atualmente, estou no início de carreira e cursando a faculdade de Banco de Dados pela Fatec de São José dos Campos mas sempre disposto a novas oportunidades.

# Contatos

###

<div align="left">
  <a href="https://www.linkedin.com/in/yan-yamim-185220278/" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-0A66C2?logo=linkedin&logoColor=white&style=for-the-badge" height="40" alt="linkedin logo"  />
  </a>
  <a href="https://github.com/YanYamim" target="_blank">  
    <img src="https://img.shields.io/badge/GitHub-181717?logo=github&logoColor=white&style=for-the-badge" height="40" alt="github logo"  />
  </a>
</div>

###

### Meus Principais Conhecimentos

Meus principais conhecimento estão no Java, juntamente com o SpringBoot e SQL. Meu desejo maior domínio na linguagem Python, seus frameworks como Django 

## Meus Projetos

### 2024-2

[Link do Repositório](https://github.com/c137santos/FATEC-API-3-SEMESTRE)

A empresa parceira desse projeto foi a GSW Soluções Integradas, instituição na qual é especializada em desenvolvimento e implantação de soluções inteligentes em Tecnologia da Informação para a gestão empresarial, tributária operações em comércio exterior e CRM. O problema da empresa é a necessidade de captura e armazenamento de notícias etratégicas, empresas que dependem de informações estratégicas precisam acompanhar constantemente notícias e dados relevantes de fontes diversas, como portais de notícias e APIs públicas. No entanto, realizar essa captura manualmente é um processo demorado, sujeito a erros e com alto risco de perda de informações valiosas.
A solução desse problema foi criar um sistema web para mapear portais de notícias estratégicas e realizar a captura automatizada e contínua de dados para formar um histórico. O sistema deve suportar tanto o registro de portais de notícias quanto de APIs de dados estratégicos, como previsões do tempo. A solução incluirá funcionalidades de cadastro de portais, APIs, tags e jornalistas, além de um processo de web scraping para coleta e armazenamento dos dados. Também deverá oferecer interfaces de consulta com filtros avançados e ser capaz de lidar com um grande volume de informações.

### Tecnologias usadas:
<div align="left">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" height="40" alt="java logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" height="40" alt="spring logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg" height="40" alt="docker logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original.svg" height="40" alt="postgresql logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/vuejs/vuejs-original.svg" height="40" alt="vuejs logo"  />
</div>

###

### Contribuições Pessoais
<ul>
  <li>
    Método responsável pelo cadastro de Tags e de Portais
    <details>
      <summary>Ver detalhes</summary>
      No back-end, desenvolvi os métodos `POST` em controladores Spring Boot (`TagController` e `PortalController`) para receber dados JSON e persistir as entidades no banco usando JPA. Utilizei as anotações `@RequestBody` e `@PostMapping`, garantindo validação e integridade dos dados. No repositório, empreguei `save()` do `JpaRepository`. Isso garantiu a criação de novos registros tanto de tags quanto de portais de forma segura.
    </details>
  </li>

  <li>
    Página web que cadastra Tags e de Portais
    <details>
      <summary>Ver detalhes</summary>
      No front-end, criei componentes Vue separados para o cadastro de tags e portais. Utilizei `v-model` para fazer o binding dos inputs com os dados e `axios` para enviar os dados via requisições `POST` para os respectivos endpoints da API. Os formulários foram montados com HTML semântico, CSS para estilo, e validadores simples para impedir envios incompletos.
    </details>
  </li>

  <li>
    Possibilidade de relacionar várias tags a um portal de notícia tanto no cadastro quanto na edição
    <details>
      <summary>Ver detalhes</summary>
      No front-end, utilizei `<select multiple>` junto com `v-model` para permitir que o usuário selecionasse múltiplas tags. Essas IDs eram enviadas para a API durante o envio do formulário. No back-end, adaptei o model `Portal` para conter uma lista de objetos `Tag`, usando `@ManyToMany`, e ajustei os DTOs para incluir a lista de IDs de tags ao criar ou editar um portal.
    </details>
  </li>

  <li>
    Correção de bug envolvendo registro de portais
    <details>
      <summary>Ver detalhes</summary>
      Corrigi um bug onde os dados de um portal não eram persistidos corretamente por conta da ausência de validação nas tags associadas. Ajustei o serviço do Spring para verificar se as tags existiam no banco antes de associá-las, usando `findById` em loop com `Optional`. Adicionei lógica para lançar erro 404 se uma tag informada não existisse, garantindo consistência referencial.
    </details>
  </li>

  <li>
    Exibição do conteúdo da notícia através de um pop-up
    <details>
      <summary>Ver detalhes</summary>
      No front-end Vue.js, implementei uma modal reutilizável com `<dialog>` e transições para exibir o conteúdo completo da notícia. Cada card de notícia tinha um botão "Ver mais" que acionava a exibição do pop-up com o corpo da notícia. Os dados eram passados como props para o componente da modal e renderizados dinamicamente com Vue.
    </details>
  </li>
</ul>


### Hard Skills
<ul> 
  <li><strong>Git</strong> – Utilizado diariamente para versionar o código-fonte da aplicação. Trabalhamos com ramificações específicas para funcionalidades (feature branches), criamos pull requests para revisão de código e resolvemos conflitos em equipe, garantindo organização e segurança no controle de versões do projeto colaborativo.</li> 
  <li><strong>Java</strong> – Linguagem utilizada para construir toda a lógica de negócio da aplicação, como o tratamento das requisições do front-end, a integração com o banco de dados e o processamento das notícias obtidas pelo crawler. Desenvolvemos classes para entidades como Tag, Portal e Notícia, além de serviços para realizar a associação e busca por essas entidades.</li>
  <li><strong>Spring Boot</strong> – Framework usado para estruturar a API REST que permitia ao front-end consultar e cadastrar dados como notícias, tags e portais. Com ele, criamos os controladores, endpoints, camadas de serviço e repositórios JPA para gerenciar o fluxo completo de dados entre o crawler, o banco e o front-end.</li>
  <li><strong>PostgreSQL</strong> – Serviu como o banco de dados da aplicação. Modelamos tabelas como `noticia`, `portal`, `tag` e tabelas de associação para representar os relacionamentos entre elas. Utilizamos SQL e JPA para armazenar as notícias capturadas pelo crawler e consultá-las conforme as tags e portais selecionados pelo usuário.</li>
  <li><strong>Docker</strong> – Empregado para padronizar o ambiente da aplicação. Criamos contêineres para o back-end, banco de dados e crawler, utilizando `Dockerfile` e `docker-compose` para garantir que toda a equipe pudesse rodar o sistema localmente de forma uniforme, além de facilitar o deploy.</li>
  <li><strong>Vue.js</strong> – Utilizado na construção da interface web da aplicação. Desenvolvemos componentes que permitiam ao usuário cadastrar e visualizar tags, portais e resultados de busca. A interface consumia os dados da API de forma reativa e dinâmica, possibilitando a busca de notícias em tempo real a partir de critérios definidos.</li>
</ul>

###

### Soft Skills
<ul> 
  <li><strong>Comunicação</strong> – Durante o desenvolvimento do projeto, enfrentei situações técnicas complexas que exigiram clareza na comunicação. Para superar essas dificuldades, procurei colegas mais experientes, explicando de forma objetiva os problemas enfrentados e ouvindo atentamente sugestões e feedbacks. Essa troca constante foi essencial para encontrar soluções eficientes e manter a fluidez no andamento da equipe.</li> 
  <li><strong>Trabalho em Equipe</strong> – A colaboração entre os membros foi fundamental para o sucesso da API. Participei ativamente de reuniões de alinhamento, dividi responsabilidades com clareza e mantive um canal aberto para revisões de código e suporte mútuo. A soma de conhecimentos e o respeito pelas ideias dos colegas resultaram em um desenvolvimento mais ágil e com maior qualidade técnica.</li> 
  <li><strong>Resiliência</strong> – Enfrentei prazos curtos, bugs inesperados e dificuldades de compreensão de requisitos. Mesmo diante desses obstáculos, mantive o foco e a motivação. Organizei prioridades, reestruturei tarefas e, com esforço contínuo, garanti que as entregas fossem feitas com qualidade, respeitando os prazos estabelecidos.</li> 
  <li><strong>Adaptabilidade</strong> – Tive que lidar com ferramentas e frameworks até então desconhecidos, como o Spring Boot e o Docker. Para acompanhar o ritmo da equipe e contribuir efetivamente, dediquei-me a aprender rapidamente por meio de cursos, documentação oficial e tutoriais. Essa capacidade de aprender e aplicar novos conhecimentos foi decisiva para minha evolução no projeto.</li> </ul>

### Dificuldades enfrentadas
Por ter sido a primeira experiência no desenvolvimento de API com cliente de verdade, um ambiente de trabalho mais próximo do profissional senti muita dificuldade e dúvida se conseguiria entregar todas as demandas. Embora essas adversidades consegui aprender a como estar em um ambiente de trabalho organizado, como realizar de forma mais eficiente desenvolvimento de controllers, services, manipulação de banco de dados e criação de páginas web usando frameworks.
