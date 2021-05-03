public class ExemploString1
{
  public static void main (String[]args)
  {
    String x = new String ("UERJ");
    String y = new String ("UERJ");
    if (x == y)
      {
	System.out.println ("Sao iguais");
      }
    else
      {
	System.out.println ("Sao diferentes");
      }
  }
}