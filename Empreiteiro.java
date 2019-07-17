public class Empreiteiro extends Funcionario {
	private float valorEmpreitada;

	public Empreiteiro(String nome, int numeroDeRegistro, float valorEmpreitada){
		super(nome, numeroDeRegistro);
		this.valorEmpreitada = valorEmpreitada;
	}

	public float calcularSalario(){
		return this.valorEmpreitada;
	}

	public void setValorEmpreitada(float valorEmpreitada){
		this.valorEmpreitada = valorEmpreitada;
	}

	public float getValorEmpreitada(){
		return this.valorEmpreitada;
	}

	@Override
	public String toString(){
		return super.toString() + "\n\tValor da Empreitada: R$" + getValorEmpreitada();
	}
}