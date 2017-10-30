import java.util.Stack;

public class Pilas {
    public void cambiar (int n){
        
       int b;
        String Z = "";
        
        Stack cambiar = new Stack();
        
        do {
            cambiar.add( b = n%2);
            Z = b + Z;
            n = n / 2;
            
        }while (n > 0);
        System.out.println("El numero binario es: " + cambiar.push(Z));        
    }
}