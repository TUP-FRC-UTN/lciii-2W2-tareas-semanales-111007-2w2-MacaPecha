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
public class Producto {
    private String descripcion;
    private Material[] materiales;

    public Producto(String descripcion, int cantidadMateriales) {
        this.descripcion = descripcion;
        materiales = new Material[cantidadMateriales];// inicializo el array Material
    }
    
    public void agregarMaterial(Material mat){
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] == null) {
                materiales[i] = mat;
                break; //importante!!
            }
            
        }
    }
    
    public double costoTotal(){
        double sumatoriaMontos=0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                sumatoriaMontos+= materiales[i].getValorUnitario();
            }
        }
        return sumatoriaMontos;
    }
    
    public boolean existeMaterial(int codigo){
        boolean existe = false;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null && materiales[i].getCodigo() == codigo) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    public Material[] materialesMenoresParam(double valorMax){ //prestar atencion a este metodo!
        Material [] materialesMenores = new Material[materiales.length]; //declaro e inicializo un vector de tipo Material con el length del vector materiales
        int proximaPosicion = 0; //contador para usarlo como indice del vector
        for (int i = 0; i < materiales.length; i++) { //sobre los elementos almacenados
            if (materiales[i] != null && materiales[i].getValorUnitario() < valorMax) { //si el valorUnitario del array materiales es menor al parametro enviado
                materialesMenores[proximaPosicion] = materiales[i]; // lo pongo en la posicion del nuevo vector materialesMenores
                proximaPosicion++; //incremento la nueva posicion (esto para que el nuevo vector no tenga lugares vacios)
            }
        }
        return materialesMenores;
    }
    
    
    public int[] cantidadXPrecio(){ //no indicar cantidad en la declaracion del metodo
        int[] cantidadesXPrecio = new int[4]; //vector de contadores en base a los rangos solicitados
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) { //compruebo que en la posicion no tenga valor null
                if (materiales[i].getValorUnitario() > 0 && materiales[i].getValorUnitario() <= 10) {//incremento en la posicion si cumple con el rango
                    cantidadesXPrecio[0]++;
                }else if (materiales[i].getValorUnitario() > 10 && materiales[i].getValorUnitario() <= 20) {
                    cantidadesXPrecio[1]++;
                }else if(materiales[i].getValorUnitario() > 20 && materiales[i].getValorUnitario() <= 30) {
                    cantidadesXPrecio[2]++;
                }else{
                    cantidadesXPrecio[3]++;
                }
            }
            
        }
        return cantidadesXPrecio;// devuelvo el vector con los contadores
    }
    
}
