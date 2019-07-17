public class FolhaDePagamento {
	public static void main(String args[]){
		Funcionario funcionarios[] = new Funcionario[4];

		funcionarios[0] = new Chefe("Eu", 1, 820f, 10, 100f);
		funcionarios[1] = new Comissado("Tu", 2, 300f, 400f); 
		funcionarios[2] = new Horista("Ele", 3, 50f, 22);
		funcionarios[3] = new Empreiteiro("Nos", 4, 3000);

		System.out.println("");

		System.out.println("|======================= Folha de Pagamento =======================|");
		System.out.println("|                                                                  |");
		System.out.println("|ACME de construção de Silos Anti Nucleares para o Apocalipse Zumbi|");
		System.out.println("|                                                                  |");
		System.out.println("|==================================================================|");

		System.out.println("");

		for(Funcionario funcionario : funcionarios){
			System.out.printf("%s \n\tCalculo do Salario: R$%.2f\n", funcionario, funcionario.calcularSalario());

			System.out.println("");
		}

		System.out.println("|==================================================================|");
	}
}