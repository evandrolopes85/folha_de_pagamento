public abstract class Funcionario {
	protected String nome;
	protected int numeroDeRegistro;

	public Funcionario(String n, int nr){
		this.nome = n;
		this.numeroDeRegistro = nr;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setNumeroDeRegistro(int nr){
		this.numeroDeRegistro = nr;
	}

	public int getNumeroDeRegistro(){
		return numeroDeRegistro;
	}

	public abstract float calcularSalario();

	@Override
	public String toString(){
		return "Nome: " + this.nome + "\nNumero de Registro: " + this.numeroDeRegistro;
	}
}