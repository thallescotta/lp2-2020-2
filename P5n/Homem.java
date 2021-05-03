public class Homem extends PessoaIMC{
	
	public Homem(String nome, String data, double peso, double altura){
		super(nome, data, peso, altura);
	}
	
	public String resultIMC(){
		double resultado = calculaIMC(getPeso(), getAltura());
		String txt = "IMC: " + String.format("%2.2f ",resultado);
        if (resultado < 20.7){
            return txt + "Abaixo do peso";
        }
        else if (resultado < 26.4){
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