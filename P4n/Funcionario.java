public class Funcionario{
    String nome;
    String codFuncionario;
    float salario;
    float SalarioBase;
    float SalarioLiquido;
    public Funcionario(String nome, String codFuncionario, float salario){
        this.nome = nome;
        this.codFuncionario = codFuncionario;
        this.salario = salario;
        this.SalarioBase = salario;
        this.SalarioLiquido = salario;
    }
    public float calculaSalario(float desconto){
        float SalarioLiquido2;
        SalarioLiquido2 = SalarioBase - (SalarioBase*desconto);
		SalarioLiquido = SalarioLiquido2;
        return SalarioLiquido2;
    }
    public String getNome(){
            return this.nome;
    }
    public String getcodFuncionario(){
            return this.codFuncionario;
    }
    public float getSalarioBase(){
            return this.SalarioBase;
    }
    public float getSalario(){
            return this.salario;
    }
    public void setSalario(float EntradaSalario){
        salario = EntradaSalario;
    }
    public void setSalarioLiquido(float EntradaSalarioLiquido){
        SalarioLiquido = EntradaSalarioLiquido;
    }
    public void setSalarioBase(float EntradaSalarioBase){
        SalarioBase = EntradaSalarioBase;
    }
    public double getSalarioLiquido(){
            return this.SalarioLiquido;
    }
    public String toString(){
        return "Nome: " + this.nome + "\n" +
                "Codigo: " + this.codFuncionario + "\n" +
                "Salario-Base: " + this.SalarioBase + "\n";
    }
}