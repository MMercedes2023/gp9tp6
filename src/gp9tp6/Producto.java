/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gp9tp6;

/**
 *
 * @author agust
 */
public class Producto {
     private String categoria;
     private String nombre;
     private double precio;

    public Producto(String categoria,String nombre,double precio){
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   
    @Override
    public String toString() {
        return "Producto{" + "Nombre " + nombre + ", Categoria " + categoria + ", Precio " + precio + '}';
    }
    
    
    
    
}
