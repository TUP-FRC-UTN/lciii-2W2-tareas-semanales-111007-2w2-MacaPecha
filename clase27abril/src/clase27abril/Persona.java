package clase27abril;

/**
 *
 * @author Maka
 */
public class Persona {
    //atributos
    private  String nombre;
    private  String apellido;
    private int dni;
    private double altura;
    private double peso;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    
    //Getter y Setter. propiedades en forma de metodo
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre (String value) {
        this.nombre = value;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido (String value) {
        this.apellido = value;
    }
    
    public int getDni(){
        return dni;
    }
    
    public void setDni (int value) {
        this.dni = value;
    }
    
    //metodos
    public String nombreCompleto(){
        return nombre + ", " + apellido;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + ", Apellido: " + apellido +". DNI: " + dni + "IMC: " + obtenerIMC();
    }
    
    public double obtenerIMC(){
        if (altura != 0 && peso !=0) {
            return peso / (altura*altura);
        }
        return 0;
    }
    
    //constructores
    public Persona(){
        this.nombre = "";
        this.apellido = "";
        this.dni = 0;
        this.altura = 0;
        this.peso = 0;

    }

    public Persona(String nombre, String apellido, int dni, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona(double peso) {
        this.peso = peso;
    }

}

