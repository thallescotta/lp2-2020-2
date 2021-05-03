package Ex1n;

import java.util.Scanner;

public class Ex1n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dataFile = new Scanner(System.in);  
        
        System.out.println("Digite uma string: ");
        String line; line = dataFile.nextLine(); // Le uma linha por vez
        int location; 
        char letter;    
        int index;
        int[] letterCount;

        //************ precisa acertar isso na leitura de teclado ...
        while (line!=null &&!line.equals("")) // Enquando houver linhas a serem lidas
        { 
            letterCount= new int[26]; //zera o array de letras a cada iteracao => ha outras formas de fazer isso            
            for (location =0; location<line.length(); location++) 
            { 
                
                letter = line.charAt(location);
                if ((letter  >= 'A' && letter <= 'Z') || (letter  >= 'a' && letter <= 'z'))
                { 
                   // 2o truque
                   index = (int)Character.toUpperCase(letter) - (int) 'A';    
                        letterCount[index]++;
                }
            }            
            for (index = 0; index < letterCount.length; index++)
            {
            System.out.println("The total number of "  
                  + (char) (index + (int) 'A')
                  + "'s is " 
                  + letterCount[index]);
            }
           System.out.println("-------------------------------------------");
           System.out.println("Digite uma string: ");           
           line = dataFile.nextLine(); // Lê a próxima linha      
        }       
       }
}