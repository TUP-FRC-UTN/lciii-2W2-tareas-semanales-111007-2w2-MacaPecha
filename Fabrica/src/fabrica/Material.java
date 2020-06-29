/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

/**
 *
 * @author Maka
 */
public class Material {
    private String descripcion;
    private int codigo;
    private double valorUnitario;

    public Material(String descripcion, int codigo, double valorUnitario) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Material{" + "descripcion=" + descripcion + ", codigo=" + codigo + ", valorUnitario=" + valorUnitario + '}';
    }
    
    
}
