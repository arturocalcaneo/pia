/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.IOException;
import java.net.URISyntaxException;
import com.google.gson.*;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arturo A. Calcaneo B
 */
public class Recepcionista extends API_METHODS implements API_CONSTANTS {
    
    private int CLAVE_RECEP= -1;
    private String NOMBRE_RECEP;
    private String AP_PATERNO_R;
    private String AP_MATERNO_R;
    private String RFC_GENERICO;
    private String FECHA_NACIR;
    private String CORREO;
    private String PASSW;
    private String FECHA_ALTA;
    private byte ESTATUS_R;
    
    public Recepcionista(){
        
    }

    public Recepcionista(String NOMBRE_RECEP, String AP_PATERNO_R, String AP_MATERNO_R, String RFC_GENERICO, String FECHA_NACIR, String CORREO, String PASSW, String FECHA_ALTA, byte ESTATUS_R) {
        this.NOMBRE_RECEP = NOMBRE_RECEP;
        this.AP_PATERNO_R = AP_PATERNO_R;
        this.AP_MATERNO_R = AP_MATERNO_R;
        this.RFC_GENERICO = RFC_GENERICO;
        this.FECHA_NACIR = FECHA_NACIR;
        this.CORREO = CORREO;
        this.PASSW = PASSW;
        this.FECHA_ALTA = FECHA_ALTA;
        this.ESTATUS_R = ESTATUS_R;
    }
    
    // <editor-fold desc="Métodos Getters, Setters & Body" defaultstate="collapsed">
    public int getCLAVE_RECEP() {
        return CLAVE_RECEP;
    }

    public void setCLAVE_RECEP(int CLAVE_RECEP) {
        this.CLAVE_RECEP = CLAVE_RECEP;
    }

    public String getNOMBRE_RECEP() {
        return NOMBRE_RECEP;
    }

    public void setNOMBRE_RECEP(String NOMBRE_RECEP) {
        this.NOMBRE_RECEP = NOMBRE_RECEP;
    }

    public String getAP_PATERNO_R() {
        return AP_PATERNO_R;
    }

    public void setAP_PATERNO_R(String AP_PATERNO_R) {
        this.AP_PATERNO_R = AP_PATERNO_R;
    }

    public String getAP_MATERNO_R() {
        return AP_MATERNO_R;
    }

    public void setAP_MATERNO_R(String AP_MATERNO_R) {
        this.AP_MATERNO_R = AP_MATERNO_R;
    }

    public String getRFC_GENERICO() {
        return RFC_GENERICO;
    }

    public void setRFC_GENERICO(String RFC_GENERICO) {
        this.RFC_GENERICO = RFC_GENERICO;
    }

    public String getFECHA_NACIR() {
        return FECHA_NACIR;
    }

    public void setFECHA_NACIR(String FECHA_NACIR) {
        this.FECHA_NACIR = FECHA_NACIR;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }

    public String getPASSW() {
        return PASSW;
    }

    public void setPASSW(String PASSW) {
        this.PASSW = PASSW;
    }

    public String getFECHA_ALTA() {
        return FECHA_ALTA;
    }

    public void setFECHA_ALTA(String FECHA_ALTA) {
        this.FECHA_ALTA = FECHA_ALTA;
    }

    public byte getESTATUS_R() {
        return ESTATUS_R;
    }

    public void setESTATUS_R(byte ESTATUS_R) {
        this.ESTATUS_R = ESTATUS_R;
    }
    
    public String getJSONBody(){
        return new Gson().toJson(this);
    }

    //</editor-fold>
    
    public boolean existeUsuario(){
        final String uriRequest= API_BASEURI + "/usuario/existe/recepcionista?correo=" + this.getCORREO();
        
        try {            
            return Boolean.parseBoolean( GET(uriRequest) );
        } catch (IOException | InterruptedException  ex) {
            System.out.println("existeUsuario() -> " + ex.getMessage());
        }
        return false;
    }
    
    public boolean autenticarUsuario(){
        try{
            final String uriRequest = API_BASEURI + "/usuario/autenticar/recepcionista?correo=" + this.encodeValue( this.getCORREO() ) + "&contra=" + this.encodeValue( this.getPASSW() );
        
            return Boolean.parseBoolean( GET(uriRequest) );
        } catch (IOException | InterruptedException  ex) {
            System.out.println("autenticarUsuario() -> " + ex.getMessage());
        }
        return false;
    }
    
    public boolean crearRecepcionista(){
        final String uriRequest= API_BASEURI + "/usuario/nuevo/recepcionista";
        
        try{
            return POST(uriRequest, this.getJSONBody());
        } catch (IOException | InterruptedException | URISyntaxException ex) {
            System.out.println("crearRecepcionista() -> " + ex.getMessage());
        }
        return false;
    }
    
    public boolean actualizarRecepcionista(){
        final String uriRequest= API_BASEURI + "/usuario/actualizar/recepcionista";
        
        try{
            return PUT(uriRequest, String.valueOf(this.getCLAVE_RECEP()), this.getJSONBody());
        } catch (IOException | InterruptedException | URISyntaxException ex) {
            System.out.println("actualizarRecepcionista() -> " + ex.getMessage());
        }
        return false;
    }
    
    public boolean eliminarRecepcionista(){
        final String uriRequest= API_BASEURI + "/usuario/eliminar/recepcionista";
        
        try{
            return DELETE(uriRequest, String.valueOf( this.getCLAVE_RECEP() ));
        } catch (IOException | InterruptedException | URISyntaxException ex) {
            System.out.println("eliminarRecepcionista() -> " + ex.getMessage());
        }
        return false;
    }
}