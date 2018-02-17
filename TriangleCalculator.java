

	
	
	    /* public static void main(String[] args) {
	        //[] - são inseridos em uma variável que referecia um array
	        int[] a = new int[4];
	        //OUTRA MANEIRA DE FAZER UMA DECLARAÇÃO DE ARRAY
	        int[] b;
	        b = new int[10];
	        //DECLARANDO VÁRIOS ARRAYS
	        int[] r = new int[44], k = new int[23];
	 
	//{} - inicializar valores em um array sua declaração
	        int[] iniciaValores = {12,32,54,6,8,89,64,64,6};
	 
	//DECLARA UM ARRAY DE INTEIROS
	        int[] meuArray;
	         
	        //ALOCA MEMÓRIA PARA 10 INTEIROS
	        meuArray = new int[10];
	         
	        //INICIALIZA O PRIMEIRO ELEMENTO
	        meuArray [0] = 100;
	        meuArray [1] = 85;
	        meuArray [2] = 88;
	        meuArray [3] = 93;
	        meuArray [4] = 123;
	        meuArray [5] = 952;
	        meuArray [6] = 344;
	        meuArray [7] = 233;
	        meuArray [8] = 622;
	        meuArray [9] = 8522;
	        //meuArray [10] = 564; //ESTOURA A PILHA POIS NÃO EXISTE O ÍNDICE 10
	 
	        System.out.println(meuArray.length);
	        
	    }*/
	
	
	
	import java.util.Scanner;

	
		public class TriangleCalculator {   
	    public static void main(String[] args){
	            int[][] matriz = new int[3][3];
	            
	            Scanner entrada = new Scanner(System.in);
	            System.out.println("Matriz M[3][3]\n");
	            
	            for(int linha=0 ; linha < 3 ; linha++){
	                for(int coluna = 0; coluna < 3 ; coluna ++){
	                    System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
	                    matriz[linha][coluna]=entrada.nextInt();
	                }
	            }
	            
	            System.out.println("\nA Matriz ficou: \n");
	            for(int linha=0 ; linha < 3 ; linha++){
	                for(int coluna = 0; coluna < 3 ; coluna ++){
	                    System.out.printf("\t %d \t",matriz[linha][coluna]);
	                }
	                System.out.println();
	            }
	           
	        }


	}
		
		
		
		
		/*-----------------------CODIGO ORIGINAL ABAIXO---------------------------------------------
		

public class Hohoho {
 public static void main(String[]args) {
	
	 int[][] triangle = {{5},{1,3},{2,4,12},{13,20,5,6}};
 
     int soma ;
     int somax = 0 ;
     int somay = 0 ;
     
     int soma1 = 0;
     int soma2 = 0;
     
     int total = 0;
     
     int maior1= 0;
     int maior2 = 0;
     int maior3 = 0;
    
     
     
    
     
     //COMPARAÇÃO DA ULTIMA LINHA
     if(triangle[3][0]>triangle[3][1]) {
    	 maior1 = triangle[3][0];
     }else {maior1=triangle[3][1];};
     
     if(triangle[3][1]>triangle[3][2]) {
    	 maior2 = triangle[3][1];
     }else {maior2=triangle[3][2];};
     
     if(triangle[3][3]>triangle[3][2]) {
    	 maior3 = triangle[3][3];
     }else {maior3=triangle[3][2];};
     
     
     
      //Soma o primeiro numero do triangulo  
     if (triangle[0][0] > 0) {
    	 soma = triangle[0][0];
     
    // Como são apenas dois numeros na segunda linha, compara e somo o maior ao total	 
     if (triangle[1][0] > triangle[1][1]) {
    	 soma = soma + triangle[1][0];
    	 somax = soma + triangle[2][0];
    	 somay = soma + triangle[2][1];
    	 
    	
    	 
    	 if(somax + maior1 > somay + maior2) 
    	 {
    		 total = somax + maior1;
    		 System.out.println("O Valor Máximo Total é: "+total);
    	 }
    	 else
    		 {
    			 total = somay + maior2;
    			 System.out.println("O Valor Máximo Total é: "+total);
    		 }
    
     }
          
     if (triangle[1][1] > triangle[1][0]){ 
    	 soma = soma + triangle[1][1]; 
    	 soma1 = soma + triangle[2][1];
    	 soma2 = soma + triangle[2][2];
 
    	 
    	
    	 if(soma1 + maior2 > soma2 + maior3) 
    	 {
    		 total = soma1 + maior2;
    		 System.out.println("O Valor Máximo Total é: "+total);
    	 }
    	 else
    		 {
    			 total = soma2 + maior3;
    			 System.out.println("O Valor Máximo Total é: "+total);
    		 }
    	 
    	
 			
 			}
         
 			
     
 
     // IMPRIME O TRIÂNGULO
     
     }
     System.out.println("\n\nHELL TRIANGLE - CHALLENGE:\n"); 
     System.out.println("      "+triangle[0][0]);
     System.out.print("   "+triangle[1][0]+"     ");  System.out.println(triangle[1][1]); 
     System.out.print(triangle[2][0]+"      "); System.out.print(triangle[2][1]+"     ");
     System.out.println(triangle[2][2]);
     System.out.print(triangle[3][0]+"  "); System.out.print(triangle[3][1]+"    "); 
     System.out.print(triangle[3][2]+"     "); System.out.println(triangle[3][3]);
     
     
   
 	 						
 
 }
 
 
}
-----------------------------------------------------------------------------------*/