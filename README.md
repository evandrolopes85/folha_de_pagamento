# folha_de_pagamento
Exercicio Herança e Polimorfismo

Folha de Pagamento
A empresa ACME de construção de Silos Anti Nucleares para o Apocalipse Zumbi está
reestruturando seu sistema de folha de pagamentos e, por conta disso, reorganizou o
organograma empresarial. Agora são 4 categorias de funcionários(Chefe, Trabalhador,
Horista, Comissionado - para vendas e Empreiteiro), nos quais há regras distintas para
cálculo do salário.

A regra para calculo de salário é simple e rápido:
	Chefe: Salário Base + Salário Base * adicionalFuncao/100 + beneficio Terno
	Comissionado = salario base + salario base * comissao / 100
	Horista = valor hora * numero horas
	Empreiteiro = valor da Empreita

Desse modo, implemente o modelo proposto, bem como uma aplicação que gere os
Recibos de pagamento de cada funcionário. Lembre-se: a lista de funcionários
deve ser única!
