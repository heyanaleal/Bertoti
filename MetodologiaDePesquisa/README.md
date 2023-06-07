<h1>Portfólio das APIs - Ana Clara Oliveira Leal</h1>

<hr>
<div class="semestre3">
<h3>Dashboard Meteorológico</h3>
<h4>3º Semestre • 2/2022 • <a href="https://github.com/fluffyfatec/Iacit">Repositório Github</a></h4>
<p align="justify">Parceiro Acadêmico: <a href="https://www.iacit.com.br">IACIT</a></p>
<p align="center"><img src="https://raw.githubusercontent.com/fluffyfatec/Iacit/Sprint-1/GIT/cabecario%20(3).jpg"></img>

<h3>Descrição  </h3>
<p align="justify">O projeto desenvolvido consistiu na criação de um <a href="https://github.com/fluffyfatec/Iacit">Dashboard Meteorológico</a> para a empresa Iacit, com o objetivo de oferecer uma solução automatizada para o download, processamento e armazenamento de dados meteorológicos em um banco de dados de fácil usabilidade.
Por meio de um software web, os usuários puderam filtrar os dados por diversos parâmetros, tais como temperatura, umidade, estações, vento, pressão atmosférica, radiação global e precipitação. Além disso, o dashboard ofereceu diversas visualizações dos dados para facilitar a interpretação dos mesmos. O sistema foi criado para oferecer diferentes níveis de acesso aos usuários, desde usuários comuns até administradores. O painel administrativo permitiu a exportação de relatórios a partir dos dados coletados, proporcionando uma análise mais detalhada dos dados meteorológicos.</p>
<h3>Tecnologias Utilizadas  </h3>
<details>
<summary>Front-End</summary>

* [JavaScript](https://www.javascript.com)
* [HTML](https://www.w3schools.com/css/)
* [CSS](https://www.w3schools.com/css/)
* [Chart.js](https://www.chartjs.org)
</details>

<details>
<summary>Back-End</summary>

* [Java](https://www.java.com/pt-BR/?msclkid=7faa842eb8f811ecab39772d4c1ae90b)
 
* [Python](https://www.python.org/downloads/)

* [Spring boot](https://spring.io/projects/spring-boot)

</details>

<details>
<summary>Banco de Dados</summary>

* [PostgreSQL](https://www.postgresql.org/download/)
</details>
<details>
<summary>Reuniões e Comunicação</summary>

* [Discord](https://discord.com/?msclkid=b4f5af84b8f811ecbd81c127a0ae68a7)

* [Whatsapp](https://www.whatsapp.com/)

* [Slack](https://slack.com/intl/pt-br/?msclkid=c00e628eb8f811ecaef374bb86d7f056)
</details>

<details>
<summary>Outras Ferramentas</summary>

* [Github](https://github.com/)

* [Eclipse IDE](https://www.eclipse.org/downloads/)

* [IntelliJ IDE](https://www.jetbrains.com/idea/promo/?msclkid=6ae44e88c2811d86c0ae2cdbd94ffcfb&utm_source=bing&utm_medium=cpc&utm_campaign=AMER_en_BR_IDEA_Branded&utm_term=intellij&utm_content=intellij%20idea)

* [Azure DevOps](https://dev.azure.com/iacitAPI/iacitAPI/)

* [Photoshop](https://www.adobe.com/br/products/photoshop.html?sdid=KQPOM&mv=search&ef_id=d67181c6b224183a4875e395ae54f4bf:G:s&s_kwcid=AL!3085!10!79302406606568!79302288716688&msclkid=d67181c6b224183a4875e395ae54f4bf)
</details>

<h3>Contribuições Individuais</h3>
<details>
<summary align="justify"><b>No desenvolvimento do front-end do projeto, fui responsável por criar uma interface gráfica atrativa e funcional:</b></summary>
<p align="justify">Meu trabalho envolveu a criação de layouts e elementos gráficos intuitivos e fáceis de usar para diferentes tipos de usuários. Minha principal prioridade era garantir a acessibilidade e a usabilidade do produto, utilizando as melhores práticas de design de interface. Realizei testes de usabilidade e acessibilidade em diferentes dispositivos e navegadores e trabalhei em estreita colaboração com a equipe de desenvolvimento e o designer para garantir que o produto final atendesse aos padrões de qualidade exigidos.<p>
 <p align="center">
      <img src="https://github.com/heyanaleal/Bertoti/blob/8acb8750632308c3bf4b884519c8a5bf0e1cfc5a/MetodologiaDePesquisa/img/iacit.gif" width="80%" height="80%">
<ul>
<li>Aprender a plotar gráficos com a biblioteca Chart.js foi uma experiência enriquecedora. O processo de aprendizado foi construtivo, permitindo explorar a 	funcionalidade da biblioteca e descobrir novas formas de visualizar dados de maneira clara e impactante. Durante o processo, pude experimentar diferentes    tipos de gráficos, personalizar sua aparência e interagir com eles de maneira dinâmica.</li>
</ul>
<!--    <p align="center">
      <img src="https://github.com/heyanaleal/Bertoti/blob/8acb8750632308c3bf4b884519c8a5bf0e1cfc5a/MetodologiaDePesquisa/img/figma.png" width="80%" height="80%"> -->
<p align="center">
<p align="center">
</details>
<details>
<summary align="justify"><b> Durante a minha colaboração na construção do back-end, pude contribuir significativamente com a implementação de novas funcionalidades na aplicação:</b></summary>
<p align="justify">Essas melhorias resultaram em uma performance e eficiência notavelmente melhores do sistema. Uma das metas foi tornar a aplicação mais robusta e escalável, o que contribuiu para aumentar a sua estabilidade e confiabilidade. Além disso, fui capaz de fornecer suporte proativo na identificação e correção de possíveis problemas e erros, o que permitiu que a aplicação oferecesse uma experiência ainda melhor para seus usuários.<p>
<pre><code>
	@Entity(name = "logEstacao")
	@Table(name = "logEstacao")
	@Getter
	@Setter
	@ToString
	public class LogEstacaoModal {
</code></pre>
<ul>
 <li>Esta linha declara uma classe chamada LogEstacaoModal como uma entidade, que representa uma tabela de banco de dados chamada logEstacao.</li>
  <li>@Entity indica que esta classe é uma entidade que pode ser persistida em um banco de dados.</li>
  <li>@Table especifica o nome da tabela de banco de dados associada a esta entidade.</li>
  <li>@Getter, @Setter e @ToString são anotações do Project Lombok, que geram automaticamente os métodos getter, setter e toString para a classe, respectivamente.</li>
</ul>

<pre><code>
	@Column(name = "logCodWmo", length = 4, nullable = false)
	private String logCodWmo;
</code></pre>
	
<ul>
 <li>Esta linha define uma coluna chamada logCodWmo na tabela de banco de dados, correspondente ao campo logCodWmo na classe.</li>
  <li>@Column especifica o nome da coluna na tabela e fornece propriedades adicionais como comprimento e possibilidade de nulo.</li>
</ul>
	
<pre><code>
	@Column(name = "logEstacaoNome", length = 60, nullable = false, unique = true)
	public String logEstacaoNome;
</code></pre>

<ul>
 <li>Esta linha define uma coluna chamada logEstacaoNome na tabela de banco de dados, correspondente ao campo logEstacaoNome na classe.</li>
  <li>Ela possui anotações semelhantes às definições de coluna anteriores, especificando o nome da coluna, comprimento, possibilidade de nulo e unicidade</li>
</ul>
	
<pre><code>
	@Column(name = "logEstacaoEstado", length = 2, nullable = false)
	public String logEstacaoEstado;
</code></pre>

<ul>
 <li>Esta linha define uma coluna chamada logEstacaoEstado na tabela de banco de dados, correspondente ao campo logEstacaoEstado na classe.</li>
  <li>Ela possui anotações semelhantes às definições de coluna anteriores, especificando o nome da coluna, comprimento e possibilidade de nulo.</li>
</ul>
	
<pre><code>
	@Column(name = "logEstacaoRegiao", length = 60, nullable = false)
	private String logEstacaoRegiao;
</code></pre>
<ul>
 <li>Esta linha define uma coluna chamada logEstacaoRegiao na tabela de banco de dados, correspondente ao campo logEstacaoRegiao na classe.</li>
  <li>Ela possui anotações semelhantes às definições de coluna anteriores, especificando o nome da coluna, comprimento e possibilidade de nulo.</li>
</ul>
		
<pre><code>
	@Column(name = "logEstacaoStatus", length = 60, nullable = false)
	private String logEstacaoStatus;
</code></pre>
<ul>
 <li>Esta linha define uma coluna chamada logEstacaoStatus na tabela de banco de dados, correspondente ao campo logEstacaoStatus na classe.</li>
  <li>Ela possui anotações semelhantes às definições de coluna anteriores, especificando o nome da coluna, comprimento e possibilidade de nulo.</li>
</ul>	
<pre><code>
	@Column(name = "logEstacaoAlterou")
	private Integer logEstacaoAlterou;
</code></pre>
<ul>
 <li>Esta linha define uma coluna chamada logEstacaoAlterou na tabela de banco de dados, correspondente ao campo logEstacaoAlterou na classe.</li>
</ul>
<pre><code>
	@Id
	@Column(name = "logEstacaoDatahoraAlterecao", nullable = false)
	@UpdateTimestamp
	private Timestamp logEstacaoDatahoraAlterecao;
</code></pre>
<ul>
 <li>Essa linha corresponde a coluna chamada logEstacaoDatahoraAlterecao que é um Timestamp não nulo e é atualizado automaticamente quando a entidade é alterada.</li>
</ul>
<pre><code>
	@Column(name = "logEstacaoOperacao", length = 1, nullable = false)
	private String logEstacaoOperacao;
}                
</code></pre>
<ul>
 <li>Define a Operação realizada na estação meteorológica no banco de dados.</li>
</ul>
</details>
<details>
<summary align="justify"><b>Como Product Owner, uma das minhas principais responsabilidades foi realizar uma análise detalhada dos requisitos do projeto:</b></summary>
<p align="justify">Essa avaliação permitiu identificar de forma eficiente as necessidades e expectativas do cliente, possibilitando uma estruturação precisa do backlog do produto. Com isso, obtive uma visão clara das metas e objetivos do projeto, permitindo orientar todo o processo de desenvolvimento de forma mais assertiva e eficiente. Ao ter um entendimento profundo das necessidades e expectativas do cliente, pude garantir que o desenvolvimento do produto atendesse adequadamente às necessidades, resultando em um produto final de qualidade e relevante. Essa análise também me permitiu gerenciar as mudanças e ajustes necessários no backlog do produto de maneira eficiente, assegurando a satisfação do cliente.<p>
   <p align="center">
      <img src="https://github.com/heyanaleal/Bertoti/blob/1b1fe552a3b15ad4e5833b1ec01feff0b82fe986/MetodologiaDePesquisa/img/BACKLOG.jpg" width="80%" height="80%">
<p align="center">
<ul>
 <li>Durante o projeto  foi realizado todo o processo com o desenvolvimento ágil. O  que envolveu a criação do backlog, o planejamento das sprints, o acompanhamento diário do progresso, a colaboração da equipe e a revisão contínua com os stakeholders. O uso desse processo ágil permitiu flexibilidade, entrega contínua de valor e engajamento dos stakeholders. Foi uma experiência enriquecedora que resultou em sucesso na conclusão de todos os itens do backlog.</li>
</ul>	
</details>
<h3>Aprendizagens</h3>
<p align="justify">Tive a oportunidade de aprender, pela primeira vez, sobre Spring Boot, HTML e CSS. Além disso, pude aprimorar meus conhecimentos em atividades relacionadas a Product Owner, design de experiência do usuário e interface do usuário, e desenvolvimento visual do sistema.</p>
<h3>Hard Skills  </h3>
<details>
  <summary><b>Clique para ver a lista de hard skills</b></summary>
  <br>
 <p align="justify"><b>Java:</b> eu aprendi que usar o padrão de arquitetura Model-View-Controller (MVC) em projetos Java orientados a objetos, é possível separar a lógica de negócio da interface do usuário em partes diferentes. O "modelo" é onde a lógica de negócio fica e manipula dados, a "visão" é onde a interface do usuário é exibida e interagimos com ela, e o "controlador" gerencia a comunicação entre o modelo e a visão. Com essa técnica, podemos organizar melhor o projeto, torná-lo mais escalável, fácil de manter e diminuir a interdependência entre as partes do sistema. A aplicação do padrão MVC em projetos Java com orientação a objetos é uma técnica útil e poderosa para melhorar a qualidade do software. </p>
<p align="justify"><b>Spring Boot::</b> Durante o projeto ultilizando o Spring Boot, aprendi a conectar minha aplicação ao banco de dados usando o mapeamento de tabelas. Isso me permitiu facilmente realizar operações de leitura, escrita, atualização e exclusão de dados no banco.
Também aprendi a criar novas funcionalidades personalizadas para meu aplicativo usando bibliotecas e ferramentas disponíveis no ecossistema do Spring. Isso me permitiu estender a funcionalidade do meu projeto e atender às necessidades específicas do meu aplicativo.</p>
<p align="justify"><b>Front-end:</b> no desenvolvimento do front-end, aprendi a usar HTML, CSS e JavaScript para criar páginas web com boa aparência e interatividade. Utilizei o HTML para organizar o conteúdo, o CSS para estilizar a aparência e o JavaScript para adicionar funcionalidades. Também aprendi a usar a biblioteca Chart.js para criar gráficos dinâmicos, como gráficos de barras e de linha. Aprendi a personalizar os gráficos com cores, fontes e layouts e adicionar animações e interatividade para torná-los mais atraentes e intuitivos.</p>
<p align="justify"><b>Figma e UX/UI design:</b> pude aprender durante o processo de criação do projeto, sobre como criar esboços de layout e fluxos de interação de produtos usando a ferramenta Figma para projetar interfaces de usuário. Entendi que é importante criar um esboço para visualizar como será a experiência do usuário e validar a ideia antes de começar a criar o design final. Também aprendi que é essencial criar um design que combine com a identidade visual da marca e utilizar elementos visuais e interativos para ajudar o usuário a navegar com facilidade.</p>
<p align="justify"><b>Scrum - Product Owner:</b> como Product Owner em um projeto Scrum, aprendi que minha função era representar as necessidades do cliente ou stakeholders na equipe de desenvolvimento. Isso envolvia gerenciar o backlog do produto, definir as histórias de usuários, priorizar os itens do backlog, participar das cerimônias do Scrum e tomar decisões de produto. Entendi que meu papel era fundamental para garantir que o produto atendesse às expectativas dos clientes, e trabalhava em estreita colaboração com a equipe de desenvolvimento para alcançar esse objetivo. Aprendi que a comunicação clara e eficaz era essencial para o sucesso do projeto, e que era preciso estar sempre atento às necessidades do cliente.</p>
</details>
<h3>Soft Skills  </h3>
<details>
<summary><b>Clique para ver a lista de soft skills</b></summary>
  <br>
 <p align="justify"><b>Proatividade:</b> usar proatividade no projeto me ensinou a importância de estar à frente dos problemas e buscar soluções antes que se tornem grandes obstáculos. Aprendi que a comunicação eficaz com a equipe e outras partes interessadas é fundamental para garantir que o projeto esteja avançando em direção aos objetivos estabelecidos. Também entendi que a proatividade requer flexibilidade e a capacidade de se adaptar às mudanças, o que pode ser alcançado através de tomadas de decisões rápidas e assertivas. </p>
<p align="justify"><b>Visão de Negócio:</b> ao trabalhar em um projeto complexo, compreender claramente os objetivos do negócio e obter os requisitos do cliente desde o início foi o fator determinante para o sucesso da nossa equipe, permitindo-nos desenvolver um produto que atendesse às suas necessidades de maneira eficiente e efetiva.</p>
<p align="justify"><b>Comunicação:</b> durante meu último projeto, percebi que a comunicação é uma habilidade fundamental para o sucesso. Aprendi que é importante falar de forma clara e objetiva para que todos entendam o que está sendo comunicado. Também entendi que é necessário adaptar a forma de comunicação ao público e às necessidades individuais de cada membro da equipe. Escutar as opiniões e sugestões dos colegas é importante para melhorar o projeto e criar um ambiente de trabalho colaborativo. Além disso, aprendi que a comunicação pode ser feita de diversas maneiras, como conversas pessoais e mensagens escritas. No geral, a comunicação eficiente me ajudou a evitar problemas e atrasos, e garantiu que todos estivessem trabalhando juntos em direção aos objetivos estabelecidos.</p>
<p align="justify"><b>Resiliência/Inteligência Emocional:</b> trabalhar em equipe pode ser difícil porque exige que as pessoas se comuniquem bem e saibam lidar com opiniões e visões diferentes. Durante o projeto, foi necessário ter inteligência emocional e resiliência para contornar conflitos e entregar um produto de qualidade.</p>
<p align="justify"><b>Organização e Planejamento:</b> devido à dificuldades, ter um bom planejamento foi fundamental para que entregassemos o projeto com sucesso.</p>
<br>
</details>
