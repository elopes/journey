# Journey
Aplicação que auxilia na organização de viagens a lazer ou a trabalho.

**Ferramentas utilizadas:**
* Java 21 
* Spring Boot
* Spring Data JPA
* Spring Web
* Flyway
* Dev Tools 
* Lombok
* H2 Database 

**Objetivo:**

O objetivo do projeto Journey é auxiliar usuários na organização de viagens a lazer ou a trabalho. A plataforma permite a criação de roteiros completos, desde o planejamento inicial até a gestão de atividades durante a viagem.

**Funcionalidades:**

**1. Criação de Viagem:**

* O usuário cadastra uma nova viagem, fornecendo as seguintes informações:
    * **Destino:** Local para onde a viagem será realizada.
    * **Data de Início:** Data em que a viagem se inicia.
    * **Data de Término:** Data em que a viagem termina.
    * **E-mails dos Convidados:** Lista de endereços de e-mail das pessoas que serão convidadas para participar da viagem.
    * **Nome Completo do Criador:** Nome completo do usuário que está criando a viagem.
    * **E-mail do Criador:** Endereço de e-mail do usuário que está criando a viagem.

**2. Confirmação de Viagem:**

* **Confirmação do Criador:**
    * Após cadastrar a viagem, o criador recebe um e-mail de confirmação contendo um link.
    * Ao clicar no link, a viagem é confirmada e os convidados recebem e-mails de confirmação de presença.
    * O criador é redirecionado para a página da viagem na plataforma.
* **Confirmação dos Convidados:**
    * Ao clicar no link de confirmação de presença no e-mail, os convidados são direcionados para a plataforma.
    * Na plataforma, os convidados devem inserir seu nome completo (o e-mail já estará preenchido).
    * Após inserir o nome, os convidados são confirmados na viagem.

**3. Gerenciamento de Viagem:**

* **Página da Viagem:**
    * Uma página dedicada à viagem é criada, contendo as seguintes informações:
        * **Detalhes da Viagem:** Destino, datas, lista de participantes.
        * **Links Importantes:** Seção onde os participantes podem adicionar links relevantes para a viagem, como reservas de hospedagem, locais para visitar, etc.
        * **Atividades:** Seção para adicionar e gerenciar atividades que serão realizadas durante a viagem. Cada atividade deve ter título, data e horário.
    * **Adição de Participantes:**
        * O criador e os participantes confirmados podem convidar novos membros para a viagem através da página da viagem.
        * Os novos convidados recebem e-mails de confirmação e, após confirmarem sua presença, passam a ter acesso à página da viagem e a todas as funcionalidades.

**4. Observações Adicionais:**

* O sistema deve garantir que apenas usuários cadastrados na plataforma possam criar ou participar de viagens.
* A plataforma deve ser acessível por meio de navegadores web e aplicativos mobile (Android e iOS).
* As informações das viagens e dos usuários devem ser armazenadas de forma segura e confidencial.
* O sistema deve ser amigável e intuitivo, facilitando o uso para todos os tipos de usuários.

**Recomendações:**

* Implementar um sistema de notificações para avisar os participantes sobre atualizações na viagem, como novas atividades ou alterações nas datas.
* Permitir que os participantes adicionem fotos e comentários às atividades da viagem.
* Integrar a plataforma com ferramentas de gestão de tarefas e calendários para facilitar a organização da viagem.
* Oferecer diferentes opções de visualização da página da viagem, como lista, mapa ou calendário.
* Implementar um sistema de busca para que os usuários possam encontrar facilmente as informações que procuram na plataforma. 
* **Adicionar uma validação nos campos de data**
  * A data de começo da viagem, é inferior a data de término viagem
  * A data de uma atividade está entre as datas da viagem
  *      Exemplo:
        Viagem entre os dias 20 á 25 de julho no Rio de Janeiro
        ⇒ Atividade 19 de julho
        ⇒ Atividade 21 de julho
        Extração do core das trips pra dentro de uma classe Service
        Mapeamento das exceções da nossa aplicação
        Com tratativas de erro personalizadas

* **Ao atender a todos os requisitos funcionais e considerar as recomendações acima, o projeto Journey se tornará uma ferramenta completa e valiosa para a organização de viagens de lazer e a trabalho.**
