package src1.tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface mario2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader entrada = new BufferedReader(
		        new InputStreamReader(System.in));

		    System.out.print("Entra la altura : " );
		    int altura = Integer.parseInt(entrada.readLine());

		    System.out.println();

		    {
		       
    		    
		    	for(int numBlancos = altura-1,numAsteriscos=1; numBlancos>=0; numBlancos--, numAsteriscos += 1){
		            //Espacios en blanco
		            for(int i=1;i<=numBlancos;i++)
		            {
		            	            	
		            	
		                System.out.print(" ");
		            }
		             
		            //Asteriscos
		            for(int j=1;j<=numAsteriscos;j++){
		            	        	
		                System.out.print("#");
		            }
		            
		            
		            
		            System.out.println();
  }
		    
		    	for(int i=0;i<altura;i++)
		        {
		        	
		            for(int j=0;j<i+1;j++)
		            {
		                System.out.print("#");
		            }
		            System.out.println("");
		        }
		    	
		    	
		        
		    
		    
		    }
		
	}

}
	
	