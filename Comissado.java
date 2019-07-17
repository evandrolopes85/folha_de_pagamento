public class Comissado extends Funcionario {
	private float salarioBase;
	private float comissao;

	public Comissado(String nome, int numeroDeRegistro, float salarioBase, float comissao){
		super(nome, numeroDeRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public float calcularSalario(){
		return salarioBase + salarioBase * comissao / 100;
	}

	public void setSalarioBase(float salarioBase){
		this.salarioBase = salarioBase;
	}

	public float getSalarioBase(){
		return this.salarioBase;
	}

	public void setComissao(float comissao){
		this.comissao = comissao;
	}

	public float getComissao(){
		return this.comissao;
	}

	@Override
	public String toString(){
		return super.toString() + "\n\tSalario Base: R$" + getSalarioBase() + 
								  "\n\tComissao: R$" + getComissao();
	}
}