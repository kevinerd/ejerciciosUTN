package ejercicio01;

public class ejercicio01 {
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;
        
        System.out.println("------------------");
        System.out.println("EJERCICIO 1 A");
        System.out.println("------------------");
        //Utilizando la sentencia while, imprima todos los números entre 2 variables.
        // Se deberían mostrar los números:
        // 5,6,7,8,9,10,11,12,13,14
        int i = numeroInicio;
        while( i <= numeroFin ) {
            System.out.println(i);
            i++;
        }
        
        System.out.println("------------------");
        System.out.println("EJERCICIO 1 B");
        System.out.println("------------------");
        // Se deben mostrar sólo los pares
        // 6, 8, 10, 12, 14
        i = numeroInicio; // Reinicio el valor de i para que inicie en el número correcto.
        
        while( i <= numeroFin ) {
            if( i % 2 == 0 ){ // Verifico el resto de la división por 2, si el resultado es cero entonces es par.
                System.out.println(i);
            }
            i++;
        }
        
        System.out.println("------------------");
        System.out.println("EJERCICIO 1 C");
        System.out.println("------------------");
        // Se deben mostrar sólo los pares
        // 6, 8, 10, 12, 14
        i = numeroInicio; // Reinicio el valor de i para que inicie en el número correcto.
        boolean par = false; // Defino una variable booleana para decidir qué números mostrar.
        
        while( i <= numeroFin ) {
            if( par ) {
                if( i % 2 == 0 ){ // Verifico el resto de la división por 2, si el resultado es cero entonces es par.
                    System.out.println(i);
                }
            } else {
                if( i % 2 != 0 ){ // Verifico el resto de la división por 2, si el resultado es distinto a cero entonces es impar.
                    System.out.println(i);
                }
            }
            i++;
        }
        
        System.out.println("------------------");
        System.out.println("EJERCICIO 1 D");
        System.out.println("------------------");
        // Hacer lo mismo que en el ejercicio B, pero en orden invertido utilizando FOR.
        // 14, 12, 10, 8, 6
        
        for (i = numeroFin; i >= numeroInicio; i--) {
            if (i % 2 == 0) { // Verifico el resto de la división por 2, si el resultado es cero entonces es par.
                System.out.println(i);
            }
        }
    }
}