public class Pessoa{

	protected String nome;
	protected String dataNascimento;
	
	public Pessoa(String nome, String dataNascimento){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public String toString(){
		String text;
		text = "Nome: " + this.nome + "\n";
		text += "Data de Nascimento: " + this.dataNascimento + "\n";
		return text;
	}
}