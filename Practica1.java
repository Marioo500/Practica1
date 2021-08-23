/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;


public class Practica1 {


    public static void main(String[] args) {
        Alumno al = null; /*Creo un objeto de tipo alumno*/
        int op;
        do
        {
            /*Ciclo do while para que se muestre el menu tantas veces hasta que se presione el 5*/
           op = 0; 
            System.out.println("1) Captura nombre y calificaciones");
            System.out.println("2) Imprimir calificaciones y promedio de calificaciones.");
            System.out.println("3) Imprimir calificaciones y calificación más baja.");
            System.out.println("4) Imprimir calificaciones y calificación más alta.");
            System.out.println("5) Salir");
            while(op <= 0 || op>=6) /*Se valida que sea una opcion correcta*/
            {
                op =CapturaDatos.capturarEntero("Introduce opcion");
            }
            switch(op)/*switch case de las opciones del menu*/
            {
                case 1 -> {/*Captura el nombre y las calificaciones del alumno*/
                    al = new Alumno(CapturaDatos.capturarCadena("Introduce nombre"), CapturaDatos.capturarEntero("Introduce matricula"));
                    for(int i = 0; i< 5; i++)/*ciclo for para capturar las 5 calificaciones*/
                    {
                        do{/*Un ciclo do while para validar que la calificacion sea correcta*/
                        al.calificaciones[i] = CapturaDatos.capturarFlotante("Introduce calificacion " + (i+1) + " de 0 a 100");
                        }while(al.calificaciones[i]>100 || al.calificaciones[i]<0);
                    }
                    break;
                }
                case 2 -> { /*Muestra las calificaciones y el promedio de estas*/
                    for(int i = 0; i<5;i++)/*Ciclo for para imprimir las 5 calificaciones*/
                    {
                        System.out.printf("Calificacion %d: %f", i, al.calificaciones[i]);
                        System.out.println();
                    }
                    System.out.printf("Promedio: %.2f\n", Alumno.getPromedio(al));
                    break;
                }
                case 3 -> { /*Imprime las calificaciones e imprime la calificacion mas baja*/
                    float min = al.calificaciones[0];
                    for(int i = 0; i<5;i++)
                    {
                        if(al.calificaciones[i] < min)
                            min = al.calificaciones[i];
                        System.out.printf("Calificacion %d: %f", i, al.calificaciones[i]);
                        System.out.println();
                    }
                    System.out.printf("Calificacion más baja: %f\n\n", min);
                    break;
                }
                case 4 -> {/*Imprime las calificaciones y la calificacion mas baja*/
                    float max = Float.NEGATIVE_INFINITY;
                    for(int i = 0; i<5;i++)
                    {
                        if(al.calificaciones[i] > max)
                            max = al.calificaciones[i];
                        System.out.printf("Calificacion %d: %f", i, al.calificaciones[i]);
                        System.out.println();
                    }
                    System.out.printf("Calificacion más alta: %f\n\n", max);
                    break;
                }
            }
            
            
        }while( op != 5); //condicion para que se salga del programa 
    }
    
}
