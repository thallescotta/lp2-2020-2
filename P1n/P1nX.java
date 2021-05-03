import java.lang.Math.*;

class P1nX {
	
	public static void main(String [] args) {
		if(args.length == 0) {
			System.out.println("Numero de argumentos insuficientes");
			return;
		}
		if(args.length > 3) {
			System.out.println("Numero de argumentos demais");
			return;
		}
		
		boolean ok = true;
		double[] values = new double[args.length];
		for(int i = 0; i < args.length; ++i) {
            		try {  
				values[i] = Double.parseDouble(args[i]);
				if(values[i] < 0) {
					System.out.println("Numero negativo: " + args[i]);
					return;
				}
			}  
			catch(NumberFormatException nfe) {
				System.out.println((i+1) + "O argumento informado: '" + args[i] + "' nao eh numero");
				ok = false;
			}  
        }
		
		if(!ok)
			return;
		
		if( values.length == 1 )
			System.out.printf("A area do circulo eh: %.2f unidades de area.\n", calcula(values[0]));
		else if(values.length == 2)
			System.out.printf("A area do retangulo eh: %.2f unidades de area.\n", calcula(values[0],values[1]));
		else
			System.out.printf("A area do triangulo eh: %.2f unidades de area.\n%s\n", calcula(values[0],values[1],values[2]), classificaTriangulo(values[0],values[1],values[2]));
	}
	
	private static double calcula(double r) {
		return Math.PI*r;
	}
	
	private static double calcula(double b, double a) {
		return b*a;
	}
	
	private static double calcula(double l1, double l2, double l3) {
		double p = ( l1 + l2 + l3 )/2.;
		double area = Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
		return area;
	}
	
	private static String classificaTriangulo(double l1, double l2, double l3) {
	
        String saida = 	"O triangulo nao existe!";

		if( Math.abs(l1-l2) < l3 && l3 < l1+l2 ) {
			
                        saida = "O triangulo eh ";

			if( l1 == l2 && l2 == l3)
				return saida + "equilatero";
			else if( l1!= l2 && l2 != l3)
				return saida + "escaleno";
			else
				return saida + "isosceles";
		}
		
		return saida;
	}
}