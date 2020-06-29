package paqueteFabrica;

public class Fabrica {
    
    public static void main(String[] args) {
        Producto p = new Producto("Puerta", 4);
        
        Material m = new Material();
        m.setCodigo(1);
        m.setDescripcion("Picaporte");
        m.setValorUnitario(100);
        
        p.agregarMaterial(m);
        
        Material [] materiales = p.materialesMenoresParam(50);
        System.out.println("Los materiales con valor unitario menor a 50 son: ");
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null)
                System.out.println(materiales[i].toString());
        }
        
        
        int [] contadores = p.cantidadXPrecio();
        System.out.println("Los materiales con valor unitario entre 0 y 10 son : " + contadores[0]);
        System.out.println("Los materiales con valor unitario entre 10 y 20 son : " + contadores[1]);
        System.out.println("Los materiales con valor unitario entre 20 y 30 son : " + contadores[2]);
        System.out.println("Los materiales con valor unitario mayor a 30 son : " + contadores[3]);
    }
}
