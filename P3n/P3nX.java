import java.util.*;

public class P3nX{
	public static void main(String[] args){
		ArrayList<AnguloObj> angulo = new ArrayList<AnguloObj>();
		double NumeroArgumentos = 0;
		boolean flag = true;
		System.out.printf("Digite o numero de angulos: ");
		System.out.printf("\n");
		Scanner reader = new Scanner(System.in);
		String StringArgumentos = reader.nextLine();
		try{
			NumeroArgumentos = Double.parseDouble(StringArgumentos);
		}
		catch(NumberFormatException e){
			System.out.printf("Entrada nao validada!");
		}
		while(flag == true){
			if(NumeroArgumentos == 0){ 
				flag = false;
			}
            else{
				for(int i = 0; i<NumeroArgumentos;){
					double EntradaAuxiliar = 0;
					System.out.printf("Digite a medida em graus do argumento "+ i + " em angulo: \n");
					String StringEntrada = reader.nextLine();
					try{
						EntradaAuxiliar = Double.parseDouble(StringEntrada);
						angulo.add(new AnguloObj(EntradaAuxiliar));
						i++;
						}
					catch(NumberFormatException e){
						System.out.printf("Argumento invalido\n");
						}
						if (i == NumeroArgumentos)
						{	
							flag = false;
						}
							System.out.printf("\n");
					}
				}
		}
		if (NumeroArgumentos != 0){
			System.out.printf("Resultado ===============");
		
			System.out.printf("\n");
			for(int i = 0; i<NumeroArgumentos;i++){
				System.out.printf(angulo.get(i).toString());
				System.out.printf("\n");
		}
	}
}
}