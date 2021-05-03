import java.io.*;
import java.util.Vector;

public class P5nX{
	public static void main(String args[]){
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String saida, sexo, nome, data;
		double peso, altura;
		int num;
		
		Vector<PessoaIMC> vet = new Vector<PessoaIMC>();
		
		while(true){
			System.out.println("Digite o numero de pessoas");
			try{
				saida = br.readLine();
				num = Integer.parseInt(saida);
				break;
			}
			catch(IOException e){
				e.printStackTrace();  // Aqui a exceção "e" vai mandar imprimir
			}
			catch(NumberFormatException e){
				System.out.printf("\nDigite um numero valido!!!\n\n");
			}	
		}
		
		if(num > 0){
			for(int i = 0; i < num; i++){
				do {
                    System.out.println("Inserir homem (h) ou mulher (m)?");
                    try {
                        sexo = br.readLine().toLowerCase();
                        if ((sexo.equals("h")) || (sexo.equals("m"))) {
                            break;
                        } else {
                            System.out.println("--- Opcao Invalida!!!");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } while (true);
				
				while(true){
					System.out.printf("Digite o nome: \n");
					try{
						nome = br.readLine();
						break;
					}
					catch(IOException e){
						e.printStackTrace();
					}
				}
				
				while(true){
					System.out.printf("Digite data de nascimento: \n");
					try{
						data = br.readLine();
						break;
					}
					catch(IOException e){
						e.printStackTrace();
					}
				}
				
				while(true){
					System.out.printf("Digite seu peso: \n");
					try{
						peso = Double.parseDouble(br.readLine().replace(",", "."));
						break;
					}
					catch(IOException e){
						e.printStackTrace();
					}
					catch(NumberFormatException e){
						System.out.println("--- A altura deve ser um numero real!!!");
					}
				}

				while(true){
					System.out.printf("Digite sua altura (em metros): \n");
					try{
						altura = Double.parseDouble(br.readLine().replace(",", "."));
						break;
					}
					catch(IOException e){
						e.printStackTrace();
					}
					catch(NumberFormatException e){
						System.out.println("--- O peso deve ser um numero real!!!");
					}
				}
				
				if(sexo.equals("h")){
					vet.add(new Homem(nome, data, peso, altura));
				}
				else{
					vet.add(new Mulher(nome, data, peso, altura));
				}
			}

			for(int i = 0; i < num; i++){
				System.out.println("--------");
				System.out.println(vet.get(i).toString());
				System.out.println("--------");
            }
		}
	}
}