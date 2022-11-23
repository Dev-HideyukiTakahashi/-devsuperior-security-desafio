## Desafio para entregar
Implemente as funcionalidades necessárias para que os testes do projeto abaixo passem:

Implemente as funcionalidades necessárias para que os testes do projeto abaixo passem:

https://github.com/devsuperior/bds04

Collection do Postman:

https://www.getpostman.com/collections/e1f59c905aeca84c1ebc

Este é um sistema de eventos e cidades com uma relação N-1 entre eles:


![uml](https://github.com/Dev-HideyukiTakahashi/-devsuperior-security-desafio/blob/main/Screenshot%20from%202022-11-23%2012-37-20.png)


Neste sistema, somente as rotas de leitura (GET) de eventos e cidades são públicas (não precisa de login). 
suários CLIENT podem também inserir (POST) novos eventos. Os demais acessos são permitidos apenas a usuários ADMIN.
Caso tenha dúvidas nas regras de autorização do ResourceServerConfig, colocamos uma sugestão em linguagem natural na próxima página.

* Validações de City:
  * Nome não pode ser vazio

*Validações de Event:
  * Nome não pode ser vazio
  * Data não pode ser passada
  * Cidade não pode ser nula

* Regras de autorização do ResourceServerConfig descritas em linguagem natural.
  * 1) Os endpoints de login e do H2 devem ser públicos
  * 2) Os endpoints GET para /cities e /events devem ser públicos
  * 3) O endpoint POST de /events devem requerer login de ADMIN ou CLIENT
  * 4) Todos demais endpoints devem requerer login de ADMIN






Bootcamp spring, dev superior.
