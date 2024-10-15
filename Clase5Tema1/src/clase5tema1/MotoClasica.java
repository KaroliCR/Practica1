/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5tema1;

/**
 *
 * @author kssbo
 */
public abstract class MotoClasica extends moto{
    private String estilo;

    public MotoClasica(String estilo,double esDeportiva, String marca, String modelo, int annio, double precio) {
        super(esDeportiva, marca, modelo, annio, precio);
        this.estilo = estilo;
        
    }
    
    
    protected abstract double calcularPrecioVenta();

    @Override
    public String toString() {
        return "MotoClasica{" + "estilo=" + estilo + '}';
    }
    
    
}
