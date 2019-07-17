public class Horista extends Funcionario{
	private float valorHora;
	private int numeroHoras;

	public Horista(String nome, int numeroDeRegistro, float valorHora, int numeroHoras){
		super(nome, numeroDeRegistro);
		this.valorHora   = valorHora;
		this.numeroHoras = numeroHoras;
	}

	public float calcularSalario(){
		return valorHora * numeroHoras;
	}

	public void setValorHora(float valorHora){
		this.valorHora = valorHora;
	}

	public float getValorHora(){
		return this.valorHora;
	}

	public void setNumeroHoras(int numeroHoras){
		this.numeroHoras = numeroHoras;
	}

	public int getNumeroHoras(){
		return this.numeroHoras;
	}

	@Override
	public String toString(){
		return super.toString() + "\n\tValor da Hora: R$" + getValorHora() + 
								  "\n\tNumero de Horas: " + getNumeroHoras();
	}
}