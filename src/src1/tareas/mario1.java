package src1.tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface mario1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader entrada = new BufferedReader(
		        new InputStreamReader(System.in));

		    System.out.print("Entra la altura : " );
		    int altura = Integer.parseInt(entrada.readLine());

		    System.out.println();

		    {
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
	