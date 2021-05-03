public class FuncCntrd extends Funcionario{
	
	int NumeroDependentes;
	float SalarioFamilia;
	final float ValorPorDep = (float) 9.58;
	final float aliquotaIR = (float) 0.15;
	
	public FuncCntrd(String nome, String codFuncionario, float salario, int numeroDependentes){
		super(nome,codFuncionario,salario);
		this.NumeroDependentes = numeroDependentes;	
		if (numeroDependentes == 0){
			calculaSalario();
		}
		else{
			this.SalarioFamilia = numeroDependentes * ValorPorDep;
			calculaSalario(numeroDependentes);
		}	
	}
	public void calculaSalario() {
		super.setSalarioLiquido(super.calculaSalario(aliquotaIR));
	}

	public void calculaSalario(int numeroDependentes){
		super.setSalarioBase((super.getSalarioBase())+(SalarioFamilia));
		calculaSalario();
	}	
	
	public String toString(){
		return  "Nome: " + this.nome + "\n" +
				"Codigo: " + this.codFuncionario + "\n" +
				"Salario-Base: " + this.SalarioBase + "\n" +
				"Salario-Liquido: " + (double) Math.round(getSalarioLiquido()*100)/100 + "\n" +
				// linha acima resolve problema de varias casas para 2 casas decimais (solucao que me baseei no StackOverflow)
				"---- \n";
	}
}