
package modelos;

import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;
import com.google.gson.Gson;
import java.net.URISyntaxException;

/**
 *
 * @author Arturo A. Calcaneo B
 */
public class Habitaciones extends API_METHODS implements API_CONSTANTS {
    
    private int CLAVE_CATHAB;
    private int PISO;
    private String TIPO_HABIT;
    private String TIPO_HABIT_OTRO_DESC;
    private float PRECIO;
    private byte ESTATUS_CATHAB;
    
    public Habitaciones(){
        
    }

    public Habitaciones(int CLAVE_CATHAB, int PISO, String TIPO_HABIT, String TIPO_HABIT_OTRO_DESC, float PRECIO, byte ESTATUS_CATHAB) {
        this.CLAVE_CATHAB = CLAVE_CATHAB;
        this.PISO = PISO;
        this.TIPO_HABIT = TIPO_HABIT;
        this.TIPO_HABIT_OTRO_DESC = TIPO_HABIT_OTRO_DESC;
        this.PRECIO = PRECIO;
        this.ESTATUS_CATHAB = ESTATUS_CATHAB;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Métodos Getters y Setters"> 
    public int getCLAVE_CATHAB() {
        return CLAVE_CATHAB;
    }

    public void setCLAVE_CATHAB(int CLAVE_CATHAB) {
        this.CLAVE_CATHAB = CLAVE_CATHAB;
    }

    public int getPISO() {
        return PISO;
    }

    public void setPISO(int PISO) {
        this.PISO = PISO;
    }

    public String getTIPO_HABIT() {
        return TIPO_HABIT;
    }

    public void setTIPO_HABIT(String TIPO_HABIT) {
        this.TIPO_HABIT = TIPO_HABIT;
    }

    public String getTIPO_HABIT_OTRO_DESCRIPCION() {
        return TIPO_HABIT_OTRO_DESC;
    }

    public void setTIPO_HABIT_OTRO_DESCRIPCION(String TIPO_HABIT_OTRO_DESC) {
        this.TIPO_HABIT_OTRO_DESC = TIPO_HABIT_OTRO_DESC;
    }

    public float getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(float PRECIO) {
        this.PRECIO = PRECIO;
    }

    public byte getESTATUS_CATHAB() {
        return ESTATUS_CATHAB;
    }

    public void setESTATUS_CATHAB(byte ESTATUS_CATHAB) {
        this.ESTATUS_CATHAB = ESTATUS_CATHAB;
    }

    @Override
    public String toString() {
        return "Habitaciones{" + "CLAVE_CATHAB=" + CLAVE_CATHAB + ", PISO=" + PISO + ", TIPO_HABIT=" + TIPO_HABIT + ", TIPO_HABIT_OTRO_DESC=" + TIPO_HABIT_OTRO_DESC + ", PRECIO=" + PRECIO + ", ESTATUS_CATHAB=" + ESTATUS_CATHAB + '}';
    }// </editor-fold>
    
    // MÉTODOS DE INTERACCIÓN CON LA API
    
    public JsonArray consultarHabitaciones(){
        
        final String uriRequest= API_BASEURI + "/habitaciones/todos";
        
        try{
            
            var bodyParsed= new JsonParser().parse(GET(uriRequest));
            
            return bodyParsed.getAsJsonArray();
        }
        catch(IOException | InterruptedException ex)
        {
            System.out.println("consultarHabitaciones() -> " + ex.getMessage());
        }
        
        // Devolver lista de habitaciones en formato JSON
        return null;
    }
    
    public ArrayList consultarHabitacionesSinAsignar(){
        
        return null;
    }
    
    private final Habitaciones thisClass= this;
    public boolean crearHabitacion(){
        
        final String uriRequest= API_BASEURI + "/habitaciones/nuevo";
        
        try{
            
            String bodyJson= new Gson().toJson(thisClass);
            
            return POST(uriRequest, bodyJson);
        }
        catch(IOException | InterruptedException | URISyntaxException ex)
        {
            System.out.println("crearHabitacion() -> " + ex.getMessage());
        }
        
        return false;
    }
    
    public boolean actualizarHabitacion(){
        
        final String uriRequest= API_BASEURI + "/habitaciones/actualizar";
        
        try{
            
            String bodyJson= new Gson().toJson(thisClass);
            String CLAVE= String.valueOf( this.getCLAVE_CATHAB() );
            
            return PUT(uriRequest, CLAVE, bodyJson);
        }
        catch(IOException | InterruptedException | URISyntaxException ex)
        {
            System.out.println("crearHabitacion() -> " + ex.getMessage());
        }
        
        return false;
    }
    
    public boolean eliminarHabitacion(){
        final String uriRequest= API_BASEURI + "/habitaciones/eliminar";
        
        try{
            
            String CLAVE= String.valueOf( this.getCLAVE_CATHAB() );
            
            return DELETE(uriRequest, CLAVE);
        }
        catch(IOException | InterruptedException | URISyntaxException ex)
        {
            System.out.println("eliminarHabitacion() -> " + ex.getMessage());
        }
        
        return false;
    }
}