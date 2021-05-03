public class AnguloObj{
	protected double arcoRad;
	public AnguloObj(double angulo){
				this.arcoRad = Math.toRadians(angulo);		
	}
	public double fSeno(){
				double seno = Math.sin(arcoRad);
				return seno;
	}
	public double fCosseno(){
				double cosseno = Math.cos(arcoRad);
				return cosseno;
	}
	public double fTangente(){
				double tangente = Math.tan(arcoRad);
				return tangente;
	}
	public double fCotangente(){
				return (1.0/fTangente());
	}
	
	public String toString(){
		String texto;
		texto = "Arco: "+ arcoRad +"\n";
		texto+= "Seno: "+fSeno()+"\n";
		texto+= "Cosseno: "+fCosseno()+"\n";
		texto+= "Tangente: "+fTangente()+"\n";
		texto+= "Cotangente: "+fCotangente()+"\n";
		return texto;
	}	
}