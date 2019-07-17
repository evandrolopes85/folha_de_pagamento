public class Chefe extends Funcionario {
	private float salarioBase;
	private float adicionaFuncao;
	private float beneficioTermo;

	public Chefe(String nome, int numeroDeRegistro, float salario, float adicionaFuncao, float beneficioTermo){
		super(nome, numeroDeRegistro);
		this.salarioBase    = salario;
		this.adicionaFuncao = adicionaFuncao;
		this.beneficioTermo = beneficioTermo;
	}

	public float calcularSalario(){
		return  salarioBase + salarioBase * adicionaFuncao / 100 + beneficioTermo;
	}

	public void setSalarioBase(float salarioBase){
		this.salarioBase = salarioBase;
	}

	public float getSalarioBase(){
		return this.salarioBase;
	}

	public void setAdicionaFuncao(float adicionaFuncao){
		this.adicionaFuncao = adicionaFuncao;
	}

	public float getAdicionalFuncao(){
		return this.adicionaFuncao;
	}

	public void setBeneficioTermo(float beneficioTermo){
		this.beneficioTermo = beneficioTermo;
	}

	public float getBeneficioTermo(){
		return this.beneficioTermo;
	}

	@Override
	public String toString(){
		return super.toString() + "\n\tSalario Base: R$" + getSalarioBase() + 
								  "\n\tAdiciona de Funcao: R$" + getAdicionalFuncao() +
								  "\n\tBeneficio Termo R$: " + getBeneficioTermo();
	}
}