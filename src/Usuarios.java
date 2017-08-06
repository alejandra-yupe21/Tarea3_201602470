/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

/**
 *
 * @author Guatemala
 */
public class Usuarios 
{
    private String nombre;


public Usuarios()
{
    nombre= " ";
}

public Usuarios(String n){
nombre=n;
}

public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
this.nombre=nombre;
}
}
