import java.util.Scanner;

public class App {

    // Isaías Israel Madrigal Brizuela 2024-1383U Grupo:1M1-S

// Metodos globales
    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);
public static boolean continuar = true;
    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {

            try {

                System.out.println("Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo porfavor revisar");
                leer.nextLine();
            }

        } while (condiciosalida);

        //recibimos el array del metodo
        int array[] = llenado();

        System.out.println("Orden de los valores ingresados");

        Mostrar(array);
        System.out.println("Forma inversa de los valores ingresados");
        inverso(array);

    }
    //    integramos exepciones en el metodo llenado
    public static int[] llenado() {
        int[] arreglo = new int[tamv];
        
        do {
            try {
               
    
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("ingrese el valor numérico [" + i + "]");
            
                arreglo[i] = leer.nextInt();
            }
            continuar=false;
            
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
                System.out.println("Solo se permite usar números");
                leer.nextLine();
            }
            
        } while (continuar);
        return arreglo;
    }
public static void Mostrar(int[] a) {
         System.out.print("{");
        for (int i : a) {
            System.out.print(i+",");
        }
        System.out.println("}");




        

    }

    //Aqui va el metodo de inverso
public static void inverso(int[]inv){
    
    System.out.print("{");
        for (int i=inv.length-1; i>=0; i--){
            System.out.print(inv[i]+",");
        }
        System.out.println("}");
    }

    

}
