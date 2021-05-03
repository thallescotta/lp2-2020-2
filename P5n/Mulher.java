public class Mulher extends PessoaIMC{
	
	public Mulher(String nome, String data, double peso, double altura){
		super(nome, data, peso, altura);
	}
	
	public String resultIMC(){
		double resultado = calculaIMC(getPeso(), getAltura());
		String txt = "IMC: " + String.format("%2.2f ", resultado);
		if (resultado < 19){
			return txt + "Abaixo do peso";
		}
		else if (resultado > 19 && resultado < 25.8){
			return txt + "Peso ideal";
		}
		else { 
			return txt + "Acima do peso";
		}
	}
	
	public String toString(){
		String texto;
		texto = super.toString();
		texto += resultIMC();
		return texto;
	}
}