package paqueteFabrica;

public class Producto {
    private String descripcion;
    private Material[] materiales;

    public Producto(String descripcion, int cantMateriales) {
        this.descripcion = descripcion;
        materiales = new Material[cantMateriales];
    }
    
    public void agregarMaterial(Material mat)
    {
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] == null)
            {
                materiales[i] = mat;
                break;
            }
        }
    }
    
    public double costoTotal()
    {
        double sumatoriaMontos = 0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null)
                sumatoriaMontos += materiales[i].getValorUnitario();
        }
        
        return sumatoriaMontos;
    }
    
    public boolean existeMaterial(int codigo)
    {
        boolean existe = false;
        
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null && materiales[i].getCodigo() == codigo)
            {
                existe = true;
                break;
            }
        }
        
        return existe;
    }
    
    public Material[] materialesMenoresParam(double valorMax)
    {
        Material[] materialesMenores = new Material[materiales.length];
        int proximaPosicion = 0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null && materiales[i].getValorUnitario() < valorMax)
            {
                materialesMenores[proximaPosicion] = materiales[i];
                proximaPosicion++;
            }
        }
        
        return materialesMenores;
    }
    
     public int [] cantidadXPrecio()
     {
         int [] cantidadesXPrecio = new int [4];
         
         for (int i = 0; i < materiales.length; i++) {
             if(materiales[i] != null)
             {
                 if(materiales[i].getValorUnitario() > 0 &&  materiales[i].getValorUnitario() <= 10)
                     cantidadesXPrecio[0]++;
                 else if(materiales[i].getValorUnitario() > 10 &&  materiales[i].getValorUnitario() <= 20)
                     cantidadesXPrecio[1]++;
                 else if(materiales[i].getValorUnitario() > 20 &&  materiales[i].getValorUnitario() <= 30)
                     cantidadesXPrecio[2]++;
                 else 
                     cantidadesXPrecio[3]++;
             }
             
         }
         
         return cantidadesXPrecio;
     }
}
