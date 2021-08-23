      /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

    public class Alumno { /*Clase Alumno para poder crear el objeto Alumno*/
        String nombre;
        int matricula;
        double promedio;
        float[] calificaciones = new float[5];
    
        public Alumno(String nombre,int matricula) /*Constructor del objeto*/
        {
               setNombre(nombre);
               setMatricula(matricula);
        }
        
        public void setNombre(String nombre){ //Metodo que recibe un string y lo almacena en nombre
		this.nombre = nombre;
	}
	
        public String getNombre(){ //metodo que regresa el nombre
		return nombre;
	}

        public void setMatricula(int matricula) /*Metodo que recibe un entero y lo almacena en matricula*/
        {
            this.matricula = matricula;
        }
        public int getMatricula()/*Metodo que regresa la matricula*/
        {
            return matricula;
        }
        public static double getPromedio(Alumno al) /*Metodo que recibe un objeto de tipo Alumno para regresar un double*/
        {
            double prom = 0;
            for(int i= 0; i<5 ; i++)
            {
                prom += al.calificaciones[i];
            }
            return prom/5;
        }

}
