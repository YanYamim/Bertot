# Engenharia de Software
## 1. comentários do livro SWE at Google
Trecho:
  Na Google, dizemos por vezes que "a engenharia de software é a programação integrada ao longo do tempo". A programação é certamente uma parte importante da engenharia de software: afinal de contas, a programação é a forma como se gera novo software em primeiro lugar. Se aceitarmos esta distinção, a programação também se torna uma extensão da engenharia de software. É evidente que talvez seja necessário estabelecer uma distinção entre as tarefas de programação (desenvolvimento) e as tarefas de engenharia de software (desenvolvimento, modificação, manutenção). A adição do tempo acrescenta um novo e importante cêntimo
  
  Vemos três diferenças críticas entre a programação e a engenharia de software: tempo, escala e os compromissos em jogo. Num projeto de engenharia de software, os engenheiros precisam de estar mais preocupados com a passagem do tempo e a eventual necessidade de mudança. Numa organização de engenharia de software, precisamos de estar mais preocupados com a escala e a eficiência, tanto para o software que produzimos como para a organização que o está a produzir. Finalmente, como engenheiros de software, somos solicitados a tomar decisões mais complexas com resultados mais arriscados, muitas vezes baseados em estimativas imprecisas de tempo e crescimento
  
  Resposta:
  O que eu entendo sobre ser um engenheiro de software é além de ser uma pessoa com alta capacidade lógica, criativa e uma noção de programação avançada também o dever de lidar com projetos de pequena ou larga escala de complexidade. O tempo também é essencial, pois uma boa gestão de tempo permite os engenheiros de software a criar soluções atualizadas e eficientes para problemas reais. Além disso, o conceito de Trade-off é de grande importância para essa área de atuação, porque haverá situações onde são necessárias escolhas onde perde de um lado para ganhar outro, cabe aos profissionais da área de pontuarem as condições mais viáveis e imprencindíveis para o futuro do projeto. 

## 2. três exemplos de tradeoffs
  Um dos Trade-offs mais relacionados são de: 
Desempenho e Custo - Essa relação envolve ter um software veloz e ágil ou a busca por alto desempenho pode implicar em hardware mais potente, ou seja, envolverá mais pessoas, mais recursos e mais custo para bancar com esse projeto
  
  Portabilidade e Funcionalidade - A capacidade de rodar em diferentes plataformas e dispositivos expandindo o alcance do software ou implementar todas as funcionalidades desejadas; pode tornar o software menos portátil, limitando sua utilização mas muitas funcionalidades pode torná-lo menos acessível a alguns dispostivos
  
  Testes e Tempo de lançamento -  Aprofundar a bateria de testes garante maior qualidade e confiabilidade do software, mas testes extensos podem atrasar o lançamento do software, impactando o tempo de retorno do investimento e a competitividade do produto, porém Lançar um software rapidamente pode apresentar bugs e falhas, enquanto testes rigorosos podem atrasar o lançamento e frustrar stakeholders.

## 3. Estilos de arquitetura, seus softwares e requisitos funcionais e não funcionais:

  1) Layered Architecture Style (Arquitetura em Camadas): Java EE (Enterprise Edition)
    É uma plataforma robusta para o desenvolvimento de aplicações empresariais, oferecendo uma arquitetura em camadas que promove a modularidade e a manutenibilidade do código.
        Atributos:
         Bom: A sua simplicidade proporciona uma fácil compreensão da aplicação, facilitando o desenvolvimento, manutenção e depuração. Em uma arquitetura em camadas, a separação clara de responsabilidades entre as camadas contribui para a simplicidade. No caso do Java EE, ao dividir claramente as camadas, torna-se o desenvolvimento e a manutenção mais simples, promovendo uma clara separação de preocupações.
  
        Ruim: A escalabilidade pode ser limitada em sistemas com uma arquitetura em camadas, especialmente quando há uma grande quantidade de interação entre as camadas. A escalabilidade vertical pode se tornar um desafio. Em sistemas Java EE, a escalabilidade pode ser mais desafiadora, já que a adição de recursos pode ser limitada em cada camada, dificultando a escalabilidade vertical.
  
  2) Pipeline Architecture Style (Arquitetura de Pipeline): Jenkins
     É uma ferramenta essencial para integração contínua e entrega contínua, usando arquitetura de pipeline para automatizar o processo de desenvolvimento, desde a compilação até o deploy.
       Atributos:
         Bom: O custo total em uma arquitetura de pipeline pode reduzir os custos operacionais e acelerar o ciclo de vida do desenvolvimento. O Jenkins, ao automatizar os processos de integração e entrega contínua, contribui para a eficiência operacional e redução do custo total de desenvolvimento e manutenção.
  
        Ruim: Quando os pipelines são altamente automatizados a tolerância a erros são um desafio. Se um erro ocorrer em uma etapa do pipeline, pode afetar o processo de desenvolvimento e entrega, requerendo monitoramento e intervenção cuidadosa. Em sistemas que dependem fortemente de pipelines, como o Jenkins, a tolerância a erros pode ser crítica. Configurações e scripts precisam ser gerenciados cuidadosamente para evitar falhas que possam comprometer todo o processo.
  
  3) Microkernel Architecture Style (Arquitetura de Microkernel): MINIX
   Um sistema operacional conhecido por sua abordagem de microkernel, visando simplicidade e confiabilidade, ao manter o núcleo mínimo e mover funcionalidades para processos de usuário.
      Atributos:
        Bom: O custo total é frequentemente beneficiado pela simplicidade e modularidade oferecidas por uma arquitetura de microkernel. Ao manter o núcleo mínimo e mover funcionalidades para processos de usuário, é possível otimizar o desenvolvimento, a manutenção e a escalabilidade do sistema. O sistema operacional MINIX, com sua arquitetura de microkernel, pode proporcionar benefícios significativos em termos de custo total devido à sua simplicidade e facilidade de extensão.
  
        Ruim: A tolerância a erros pode ser desafiadora, especialmente quando as funcionalidades são distribuídas entre processos de usuário. Erros em um componente podem afetar apenas aquele componente, mas a coordenação entre os componentes pode se tornar complexa e afetar a estabilidade do sistema. Em sistemas baseados em microkernel, como o MINIX, a gestão de erros pode ser mais complexa, pois a interação entre componentes externos pode requerer um cuidadoso tratamento de erros para manter a estabilidade do sistema.
  
  4) Service-Based Architecture Style (Arquitetura Baseada em Serviços): Salesforce
     Salesforce é uma plataforma líder em CRM que utiliza uma arquitetura baseada em serviços, permitindo a integração flexível de diferentes módulos e funcionalidades.
       Atributos:
         Bom: A arquitetura baseada em serviços, como a adotada pelo Salesforce, facilita a implantabilidade de novos serviços ou atualizações, pois os serviços são independentes e podem ser implantados e atualizados separadamente. O Salesforce permite a adição fácil de novos serviços sem afetar diretamente os serviços existentes, proporcionando uma boa implantabilidade.
  
       Ruim: A elasticidade é um desafio na arquitetura baseada em serviços, pois a escala de cada serviço pode precisar ser gerenciada individualmente. A coordenação entre diferentes serviços para escalar horizontalmente pode ser complexa. Em ambientes onde a elasticidade é crucial, como em sistemas de alta carga, a arquitetura baseada em serviços pode requerer um esforço adicional para gerenciar a escalabilidade eficientemente.
     
  5) Event-Driven Architecture Style (Arquitetura Orientada a Eventos): Apache Kafka
   O Kafka é uma poderosa plataforma de streaming de dados, construída com uma arquitetura orientada a eventos. Ela facilita o processamento em tempo real e a comunicação assíncrona em grande escala.
      Atributos:
       Bom: A arquitetura orientada a eventos, como implementada pelo Apache Kafka, muitas vezes proporciona excelente desempenho ao lidar com grandes volumes de eventos. A capacidade de processar eventos de forma assíncrona e distribuída pode levar a uma performance superior em comparação com abordagens síncronas. O Apache Kafka, ao processar eventos em tempo real, destaca-se pela sua capacidade de lidar eficientemente com grandes cargas de trabalho, beneficiando-se da arquitetura orientada a eventos para otimizar a performance.
  
       Ruim: A simplicidade pode ser comprometida nesse tipo de arquitetura, especialmente quando há uma complexa lógica de negócios baseada em eventos distribuídos. A gestão de fluxos de eventos, mensagens e garantia de entrega pode adicionar complexidade ao sistema. Em sistemas que dependem fortemente de uma arquitetura orientada a eventos, como o Apache Kafka, a simplicidade pode ser sacrificada em favor da flexibilidade e da capacidade de lidar com uma variedade de situações e eventos.
  
  6) Microservices Architecture Style (Arquitetura de Microsserviços): Netflix
    A Netflix, um dos serviços de streaming mais famosos do mundo,  é um exemplo notável de uma arquitetura de microsserviços, permitindo escalabilidade e manutenção eficiente por meio da distribuição de funcionalidades em serviços independentes.
      Atributos:
        Bom: A modularidade é um benefício chave da arquitetura de microsserviços. Ao dividir uma aplicação em serviços independentes, é possível alcançar maior modularidade. Isso facilita o desenvolvimento, a manutenção e a escalabilidade do sistema. Sistemas como da Netflix, onde diferentes funcionalidades são encapsuladas em serviços separados, demonstram a eficácia da modularidade para facilitar o desenvolvimento e a manutenção.
  
        Ruim: A performance complica as arquiteturas de microsserviços, especialmente em sistemas onde a comunicação entre os serviços é frequente. A latência de rede e o overhead da comunicação entre serviços podem impactar o desempenho global do sistema. Em sistemas com uma arquitetura de microsserviços, a latência introduzida pela comunicação entre serviços, por exemplo, através de APIs HTTP, pode afetar a performance global, exigindo uma cuidadosa consideração do design e otimizações quando necessário.
  
## 4. Sobre o Sistema que criei
  Os trade-offs, positivos e negativos, para um sistema de um Inventário e Agenda com uma arquitetura de microsservições podem se basear em:
  
   Escalabilidade(positivo): É simplificada, pois cada microsserviço pode ser escalado independentemente, permitindo lidar com cargas específicas de maneira mais eficiente. Porém a comunicação entre microsserviços, se não otimizada, pode introduzir latência e impactar a performance global do sistema.
  
   Perfomance(negativo): A escalabilidade e modularidade podem levar a um aumento na performance em alguns casos. 
  
   Modularidade(positivo): É vantajoso em arquiteturas de microsserviços para bibliotecas. Cada funcionalidade (como cadastro de livros, empréstimos, etc.) é tratada por um microsserviço independente, facilitando a manutenção e evolução isolada de cada componente. 

O conceito do sistema é ser um inventário onde pode-se guardar o que quiser, dependendo do plano escolhido, além disso esse inventário pode ser usado como uma agenda para anotar lembretes e tarefas do dia a dia
