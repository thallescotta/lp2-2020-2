import java.io.*;
import java.util.*;

public class P4nX{
	public static void main(String[] args){
		ArrayList<FuncCntrd> funcionario = new ArrayList<>();

		int NumeroArgumentos = 0;
		boolean flag = true;               
		PrintStream printf = System.out.printf("Quantos funcionarios? (o numero 0 encerra o programa):");
		Scanner reader = new Scanner(System.in);

		String StringArgumentos = reader.nextLine();
		try{
			NumeroArgumentos = Integer.parseInt(StringArgumentos);
		}
		catch(NumberFormatException e){
			System.out.println("Entrada invalidada!");
		}
		
		for(int i = 0; i<NumeroArgumentos;i++){
			System.out.println("- - - Cadastro de Funcionarios" );
			System.out.printf("Contratado ou Executivo (c/e)?" );	
                                                       
            String entrada = reader.nextLine();
            if(entrada.equals("c")){
                            
				String CodigoEntrada;
				float SalarioEntrada = 0;
				int NumeroDependentesEntrada = 0;
				System.out.printf("Nome do Empregado: ");
				String NomeEntrada = reader.nextLine();
				System.out.printf("Codigo: ");
				String auxiliar = reader.nextLine();
				System.out.printf("Salario: ");
				String auxiliar2 = reader.nextLine();
				try{
					SalarioEntrada = Float.parseFloat(auxiliar2);
				}
				catch(NumberFormatException e){
					System.out.println("Entrada invalida! Byebye!.");
					System.exit(0);
				}
				System.out.printf("Numero de Dependentes: ");
				String auxiliar3 = reader.nextLine();
	
				try{
					NumeroDependentesEntrada = Integer.parseInt(auxiliar3);
				}
				catch(NumberFormatException e){	
					System.out.println("Entrada invalida! Byebye!.");
					System.exit(0);
				}
				if(i == NumeroArgumentos){
					flag = false;
				}
				funcionario.add(new FuncCntrd(NomeEntrada,auxiliar,SalarioEntrada,NumeroDependentesEntrada));
            }
			else if(entrada.equals("e")){                            
				String CodigoEntrada;
				float SalarioEntrada = 0;
				int NumeroDependentesEntrada = 0;
				float gratificacao=0;
				System.out.printf("Nome do Empregado: ");
				String NomeEntrada = reader.nextLine();
				System.out.printf("* Codigo: ");
				String auxiliar = reader.nextLine();
				System.out.printf("Salario: ");
				String sal = reader.nextLine();

				try{
					SalarioEntrada = Float.parseFloat(sal);
                                        
				}
				catch(NumberFormatException e){
					System.out.printf("Entrada invalida! Byebye!.");
					System.exit(0);
				}
				System.out.printf("Numero de Dependentes: ");
				String auxiliar3 = reader.nextLine();
	
				try{
					NumeroDependentesEntrada = Integer.parseInt(auxiliar3);
				}
				catch(NumberFormatException e){	
					System.out.println("Entrada invalida! Byebye!.");
					System.exit(0);
				}
				if(i == NumeroArgumentos){
					flag = false;
				}

				System.out.printf("Gratificacao: ");
				String auxiliar4 = reader.nextLine();
	
				try{
					gratificacao = Float.parseFloat(auxiliar4);
				}
				catch(NumberFormatException e){	
					System.out.println("Entrada invalida! Byebye!.");
					System.exit(0);
				}
				if(i == NumeroArgumentos){
					flag = false;
				}
				funcionario.add(new FuncExct(NomeEntrada,auxiliar,SalarioEntrada,NumeroDependentesEntrada,gratificacao));
			}
			else{
				System.out.println("Redigite (c) ou (e) apenas!."); 
				System.exit(0);           
                }
		}        
					
		if (NumeroArgumentos!=0){
			System.out.println("...");
			System.out.println("--- Folha Salarial ---");

			for (int i = 0; i<NumeroArgumentos;i++){
					System.out.printf(funcionario.get(i).toString());
			}
		}		
	}
}