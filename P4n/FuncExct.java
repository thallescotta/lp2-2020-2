public class FuncExct extends FuncCntrd{

    private float gratificacao;
        public FuncExct(String nome, String codFuncionario, float salario, int numeroDependentes, float gratificacao){
    
            super(nome, codFuncionario, salario, numeroDependentes); 
            this.gratificacao = gratificacao;
            this.calculaSalarios();
        }

    public void calculaSalarios(){
        float novoSal = super.getSalarioBase()+this.gratificacao;
        this.setSalarioLiquido(novoSal);
        }
    
    public String toString(){
       return super.toString() + "\n" + " * Gratificacao: " + this.gratificacao + " ( Por ser Funcionario(a) Executivo(a) )" + "\n" +
       "\n" + "---- \n";
    }
}