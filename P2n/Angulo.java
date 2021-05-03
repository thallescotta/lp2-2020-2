public class Angulo{
	public static double cvtAngulo(double angulo){
		return Math.toRadians(angulo);
	}
	public static double fSeno(double angulo){
		return Math.sin(angulo);		
	}
	public static double fCosseno(double angulo){
		return Math.cos(angulo);
	}
	public static double fTangente(double angulo){
		return Math.tan(angulo);
	}
	public static double fCotangente(double angulo){
		return (1.0/Math.tan(angulo));
	}
}