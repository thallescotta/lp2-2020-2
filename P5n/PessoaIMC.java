public abstract class PessoaIMC extends Pessoa{
	
	protected double peso;
	protected double altura;
	
	public PessoaIMC(String nome, String data, double peso, double altura){
		super(nome, data);
		this.peso = peso;
		this.altura = altura;
	}
	
	public double getPeso(){
		return this.peso;
	}
	
	public double getAltura(){
		return this.altura;
	}

	public double calculaIMC(double p, double a){
		double imc;
		imc = p/(a*a);
		return imc;
	}
	
	public abstract String resultIMC();
	
	public String toString(){
		String text;
		text = super.toString();
		text += "Peso: " + this.peso + "\n";
		text += "Altura: " + this.altura + "\n";
		return text;
	}
}