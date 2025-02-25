/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5tema1;

/**
 *
 * @author kssbo
 */
public abstract class Auto extends Vehiculo {
    
    int puertas;

    public Auto(int puertas, String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.puertas = puertas;
        
    }
    
    protected abstract double calcularPrecioVenta();

    @Override
    public String toString() {
        return "Auto{" + "puertas=" + puertas + '}';
    }
    
    

    
}
