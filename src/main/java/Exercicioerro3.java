
public class Exercicioerro3 {

    public static void main(String[] args) {
        int numeros[] = new int [10]; 
    
     numeros[0] =0;
     numeros[1] =1;
     numeros[2] =2;
     numeros[3] =3;
     numeros[4] =4;
     numeros[5] =5;
     numeros[6] =6;
     numeros[7] =7;
     numeros[8] =8;
     numeros[9] =9;
     try {   
     System.out.println("tentando 10" + numeros[10]);
     } catch (ArrayIndexOutOfBoundsException e){  
         System.out.println("tentando localizar casa inexistente: " + e);
        
    }
    }
}
