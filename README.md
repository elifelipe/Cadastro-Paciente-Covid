# Cadastro-Paciente-Covid

Diante das grandes filas e aglomerações de pessoas aguardando atendimento nos postos de saúde e hospitais, você já refletiu sobre como a tecnologia poderia apoiar na agilidade e organização dos atendimentos? Nesta atividade MAPA você é desafiado a elaborar uma solução para esta demanda.
Para isso, convido-o a realizar uma leitura atenta do contexto a seguir. Preste atenção nas informações e bom trabalho!

Apesar da grande campanha de vacinação contra COVID-19, a pandemia ainda lota as filas dos hospitais. Sabe-se que, além da vacina, a prevenção através do distanciamento social, uso de álcool para higienização das mãos e uso de máscara ainda consistem no melhor método para o controle da pandemia.

A tecnologia também tem sido uma grande aliada para que a vida de milhões de pessoas continue relativamente normal. Muitos programas de computadores realizam tarefas de forma automatizada, evitando assim a aproximação entre as pessoas como acontece, por exemplo,  em supermercados nos caixas com autoatendimento.

Ferramentas de reuniões e aulas on-line nunca foram tão utilizadas como agora na Pandemia e, graças a essas tecnologias, o isolamento físico torna-se cada vez menor além de se promover o distanciamento social.

Diante deste contexto, imagine que você faz parte de uma equipe de Tecnologia e Desenvolvimento de um grande hospital que possui um pronto atendimento 24 horas e atende as mais diversas emergências médicas, desde doenças infecciosas como o COVID-19 a diversas outros problemas de saúde.

A fila para o atendimento está aumentando cada vez mais, sendo um grande risco para contaminação pelo Coronavírus devido à alta demanda e aglomeração que se formam com as filas. Por este motivo, você foi encarregado de criar um programa em Java que faça uma triagem inicial através de totens eletrônicos que serão disponibilizados no pronto atendimento, agilizando assim o atendimento e fazendo a separação dos suspeitos de COVID-19 dos não suspeitos, garantindo um distanciamento e redução da infecção gerado pelas filas.

Neste programa o paciente chegará ao totem e fará um cadastro prévio indicando os seguintes dados:
    - CPF
    - Nome
    - Sexo
    - Idade

Após o cadastro, o paciente deve responder a um questionário de sintomas no qual cada sintoma terá um peso para avaliação do risco de COVID. Os sintomas são:

- Tem Febre? (5 pontos)
- Tem dor de cabeça? (1 ponto)
- Tem secreção nasal ou espirros? (1 ponto)
- Tem dor/irritação na garganta? (1 ponto)
- Tem tosse seca? (3 pontos)
- Tem dificuldade respiratória? (10 pontos)
- Tem dores no corpo? (1 ponto)
- Tem diarreia? (1 ponto)
- Esteve em contato, nos últimos 14 dias, com um caso diagnosticado com COVID-19? (10 pontos)
- Esteve em locais com grande aglomeração? (3 pontos)​

OBS: Caso o usuário indique que SIM (S) soma-se o valor, caso seja indicado NÃO (N) não soma o valor. O encaminhamento será feito para 3 alas: Risco Baixo, Risco Médio e Risco Alto.
- Para o risco baixo o total de pontos dos sintomas deverão ser de 0 a 9.
- Para o risco médio de 10 a 19 pontos.
- Para o risco alto de 20 ou mais pontos.
 
Após preenchimento do questionário, é preciso indicar para qual ala o paciente deverá se dirigir.
Após a finalização do atendimento, os dados deverão ser armazenados em uma lista de objeto e o programa deverá esperar a entrada de dados de um novo paciente.
Para sair do programa, o operador deverá digitar SAIR, no campo CPF de um novo atendimento.

Atenção:
O código Java ou projeto do Netbeans deverá ser enviado para correção em ZIP.
Antes de enviar o arquivo, certifique-se de que atendeu a todos os critérios solicitados. Após o envio não são permitidas alterações. Por favor, não insista.
Não são permitidas correções parciais no decorrer do módulo, ou seja, o famoso: "professor veja se minha atividade está certa?" Isso invalida seu processo avaliativo. Lembre-se que a interpretação da atividade também faz parte da avaliação. Por favor, não insista solicitando que os professores mediadores lhe deem orientações extras acerca da atividade.
 
