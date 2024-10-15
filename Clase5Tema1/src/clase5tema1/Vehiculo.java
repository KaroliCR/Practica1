/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5tema1;

/**
 *
 * @author kssbo
 */
public abstract class Vehiculo {
    
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    public Vehiculo(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }
    
    
    protected abstract double calcularPrecioVenta();

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", precio=" + precio + '}';
    }
    
    
}
