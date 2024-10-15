/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5tema1;

/**
 *
 * @author kssbo
 */
public abstract class AutoDeLujo extends Auto{
    private boolean tieneTechoSolar;

    public AutoDeLujo(int puertas, String marca, String modelo, int año, double precio) {
        super(puertas, marca, modelo, año, precio);
        this.tieneTechoSolar = tieneTechoSolar;
    }
    
    
    
    protected abstract double calcularPrecioVenta();

    @Override
    public String toString() {
        return "AutoDeLujo{" + "tieneTechoSolar=" + tieneTechoSolar + '}';
    }
    
    
    
    
    
}
