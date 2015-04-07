package Modelo;

import java.util.ArrayList;

public class RegistroEstudiante {
    
    private ArrayList<Estudiante>registroEstudiantes;
    
    int posicion;
        
    
    public RegistroEstudiante(){
        registroEstudiantes=new ArrayList<Estudiante>();
        
    }
    
    public void agregarEstudiante(Estudiante estudiante ){
        
        registroEstudiantes.add(estudiante);
	System.out.println("se agrgo con exito el estudiante");
    }
    
    
    public boolean verificarEstudiante(String carnet){
        boolean existe =false;
        for(int i=0; i<=registroEstudiantes.size();i++){
            if(registroEstudiantes.get(i).getCarnet().equals(carnet)){
                existe=true;
                posicion=i;
                break;
            }
	}
        return existe;
    }
    
    
    
     
    public void eliminarEstudiante()
    {  
        registroEstudiantes.remove(posicion);
        
    }
    
    
    
    public String mostrarEstudiante(){
            
        String mostrar="";
        mostrar=registroEstudiantes.get(posicion).getInformacion();
        return mostrar; 
    }
	
    public String mostrarTodos(){
        String todos="";
        //recordar que hay q preguntar si la lista esta vacia
        for(int i=0; i<registroEstudiantes.size();i++){
            todos+="\n"+registroEstudiantes.get(i).getInformacion();
        }
        return todos; 
    }
	
    
    
    
    
    
    
    
}
