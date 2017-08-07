/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_3;
import java.util.*;


public class Tarea_3 {
 
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String VectorUsuario[] = new String[5];
        VectorUsuario[0]= "nombre1";
        VectorUsuario[1]= "nombre2";
        VectorUsuario[2]= "nombre3";
        VectorUsuario[3]= "nombre4";
        VectorUsuario[4]= "nombre5";
        String nombre=" ";
        String buscar="";
        int opcion=0;
       
        boolean cerrar=true;
        
        
        System.out.println("Tarea 3"); 
        System.out.println("201602470"); 
        System.out.println("1. Usuarios"); 
        System.out.println("2. Palabras Palindromas"); 
        System.out.println("3. Salir");
        
        while(cerrar){
        opcion=sc.nextInt();
        switch(opcion){
            case 1:
                
                switch (opcion){
                    case 1:
                        System.out.println("Menu de Usuarios"); 
                        System.out.println("1. Ingresar Usuarios");
                        System.out.println("2. Mostrar todos los Usuarios"); 
                        System.out.println("3. Mostrar un Usuario Personalizado");
                        System.out.println("4. Menú Principal"); 
                        System.out.println("5. Salir");
                        
                        
                        opcion=sc.nextInt();
                            switch(opcion){
                                case 1:
                        
                       for (int i=0; i <VectorUsuario.length; i++)
                       {
                           System.out.println("Ingresar Usuarios");
                           nombre=sc.next();
                           VectorUsuario[i]= nombre;
                           
	} 
        break;
        
        
                                case 2:
                                    System.out.println("Mostrar todos los Usuarios");
                                    System.out.println("1. "+VectorUsuario[0]+"\n2. "+VectorUsuario[1]+"\n3. "+VectorUsuario[2]+"\n4. "+VectorUsuario[3]+"\n5. "+VectorUsuario[4]);
                               break;
                                case 3:
                                    System.out.println("Mostrar un Usuario Personalizado");
                                    System.out.println("Ingresar Usuario ");
                                    for (int i=0; i <VectorUsuario.length; i++){
                                       if (buscar == nombre){
                                           buscar=sc.next();
                                        System.out.println(buscar);
        }
                                       else {
                                           buscar=sc.next();
                                        System.out.println("ERROR! No existe ningun usuario con esa coincidencia");
        } break; 
                                    }
                        
                            }break;
                }
       break;
       
            case 2:
               /* Scanner leer=new Scanner(System.in);
                String palabra= leer.nextLine();
                char[] caracteres= palabra.toCharArray();
                char[] palindromo=new char[caracteres.length];
                int num=0;
                String palindromo2 = new String(palindromo);
               
               System.out.println("Ingrese palabra");
                     palabra=leer.next();
                 for(int i= caracteres.length; i>0; i--){
                    
                    palindromo[num]=caracteres[i-1];
                    num++;
                }
                
                if (palabra.equals(palindromo2)){
                    System.out.println("Es un palindromo");
                }
                else{
                    System.out.println("No es un palindromo");
                }
                break;*/
                Scanner leer=new Scanner(System.in);
                String palabra, palindromo="";
                System.out.println("Palabras Palindromas");
                System.out.println("Ingresar Palabra");
                palabra=leer.nextLine();
                
                for(int x=palabra.length()-1; x>= 0; x--)
                    palindromo+=palabra.charAt(x);
                if(palabra.equalsIgnoreCase(palindromo))
                    System.out.println("La palabra es un palindromo");
                else
                    System.out.println("La palabra no es un palindromo");
                break;
        
        case 3:
            cerrar=false;
            break;
        }
        
        
        }}}
        
          