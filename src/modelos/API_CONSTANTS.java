/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

/**
 *
 * @author Arturo A. Calcaneo B
 */
public interface API_CONSTANTS {
    
    final short API_PORT     = 8888;
    
    final String API_HOST    = "[::1]"; // Para uso local
    
    final String API_PROTOCOL= "http";
    
    final String API_BASEURI = API_PROTOCOL + "://" + API_HOST + ":" + API_PORT;
    
}