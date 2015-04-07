package Modelo;

public class Estudiante {
 
   
    private String nombre;
    private String carnet;

    public Estudiante() {
    }

    public Estudiante(String nombre, String carnet) {
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    //.................................................
    
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public String getCarnet() {
        return carnet;
    }
    
    public String getInformacion(){
        
        return "El carnet es "+getCarnet()+"\n"+" El nombre es"+getNombre();
                
    }
            
    
}

    

