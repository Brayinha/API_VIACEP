# API_VIACEP
Desafio tem o foco em Consumir uma API dos correios chamada VIACEP, para guardar seu Dados de um Requisição GET em um banco de dados e Enviar esses dados no Email.

# Estrutura do Projeto
Utilizei o Spring com as Dependecias:
* Spring Web
* Spring Data JPA
* Spring Devtools
* JavaMail
* Mysql Driver

![4](https://user-images.githubusercontent.com/47387393/166402039-b5e0a0f0-639c-4aaa-a82e-dd6375012bca.PNG)

# Configuração do Banco de Dados
Aqui definimos a porta, nome do banco de dados,a senha tanto de usuario e senha, para que JPA possa conectar 
e garantir as consultas utilizando o JPA,Tambem configuramos o SMTP para enviar email com o JavaMail defindo o Usuario e a Senha do email escolhido
#
![1](https://user-images.githubusercontent.com/47387393/166617423-139d6567-176b-4935-aec1-ba1a7286e5d3.PNG)


# Definindo os Dados do Model
Aqui definimos a classe que JPA vai utilziar como base pra criar nossa Tabela utilizando 
os atributos como colunas dessa tabela
![6](https://user-images.githubusercontent.com/47387393/166402308-00a1bde8-2682-4a45-bd94-f4388249c9ba.PNG)

# Definindo os Dados do Repository
Criando uma interface para poder manipular os dados da classe Model utilizando JPA
![5](https://user-images.githubusercontent.com/47387393/166402231-3e437304-ebe2-4957-aad6-b28e2825de66.PNG)
#

# Definindo os Dados do Service
Criando um Metodo com SimpleMail para enviar o email com os dados da nossa API, 
definimos Destinatario,Origim,Titulo,Que estara no Corpo do Email.
![2](https://user-images.githubusercontent.com/47387393/166617552-0d1956ab-b6cc-48f7-8289-77ed6f215f8f.PNG)

# Definindo os Dados do Controller
Implementando um metodo com RestTemplate para consumir uma API e salvar seus dados no Banco de dados e 
Por Fim Enviar Um email com os dados Daquela Determianda Requisição.
![3](https://user-images.githubusercontent.com/47387393/166617457-80e39811-f1e4-4c68-8e61-95a9b72132f4.PNG)


# Teste com POSTMAN
Utilizando o POSTMAN, uma plataforma pra testar uma API, podemos ver que quando inserimos o CEP e depois selecionamos GET,
pra fazer uma requisição que a resposta são os dados de seu CEP, tmb será salvos os dados no Banco de dados,utilziando o SqlLog, podemos verificar e no Fim verficamos o Email pra ver se ele enviou os dados consumidos naquela Determianda Requisição o RESULTADO
#
![1](https://user-images.githubusercontent.com/47387393/166402855-18320ffe-aac5-47bf-b327-c82979c06d34.PNG)
#
![2](https://user-images.githubusercontent.com/47387393/166402868-a32bdbe4-e977-480e-9ed5-504da3410850.PNG)

#
![4](https://user-images.githubusercontent.com/47387393/166617516-e39070c8-7a8a-42c2-aacd-dee42b506c46.PNG)

#
