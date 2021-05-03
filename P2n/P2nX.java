import java.util.Scanner;

public class P2nX{
	public static void main(String[] args){
		double entrada1 = 0;
		double entrada2 = 0;
		boolean flag = true;
		if (args.length == 1) {
			try {
				entrada1 = Double.parseDouble(args[0]);
				Angulo angulo = new Angulo();
				System.out.printf("Seno: %.2f\n",angulo.fSeno(angulo.cvtAngulo(entrada1)));
				System.out.printf("Cosseno: %.2f\n",angulo.fCosseno(angulo.cvtAngulo(entrada1)));
				System.out.printf("Tangente: %.2f\n",angulo.fTangente(angulo.cvtAngulo(entrada1)));
				System.out.printf("Cotangente: %.2f\n",angulo.fCotangente(angulo.cvtAngulo(entrada1)));
			}
			catch (NumberFormatException e){
				System.out.printf("Formato de entrada diferente do esperado.\n");
			}
		}
		else {
			System.out.printf("Numero de argumentos diferente do esperado.");
		}
		while (flag == true){
			System.out.printf("\n");
			Scanner reader = new Scanner(System.in);
			System.out.printf("Digite uma medida em graus do angulo: ");
			String m = reader.nextLine();
			if(m.equals("") || m.equals(" ")) {
				flag = false;
				System.exit(0);
			}
			try{
				entrada2 = Double.parseDouble(m);
				Angulo angulo2 = new Angulo();
				System.out.printf("Seno: %.2f\n",angulo2.fSeno(angulo2.cvtAngulo(entrada2)));
				System.out.printf("Cosseno: %.2f\n",angulo2.fCosseno(angulo2.cvtAngulo(entrada2)));
				System.out.printf("Tangente: %.2f\n",angulo2.fTangente(angulo2.cvtAngulo(entrada2)));
				System.out.printf("Cotangente: %.2f\n",angulo2.fCotangente(angulo2.cvtAngulo(entrada2)));
			}		
			catch (NumberFormatException e){
					System.out.printf("Formato da entrada diferente do esperado.\n");
			}
		}
	}
}