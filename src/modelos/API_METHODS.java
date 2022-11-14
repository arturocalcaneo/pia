/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author Arturo A. Calcaneo B
 */
public abstract class API_METHODS {
    
    protected String GET(String path) throws IOException, InterruptedException {
        HttpClient cliente= HttpClient.newHttpClient();
        
        HttpRequest peticion= HttpRequest.newBuilder()
                .uri(URI.create(path))
                .build();
        
        var bodyHandler= HttpResponse.BodyHandlers.ofString();
        
        HttpResponse<String> respuesta= cliente.send(peticion, bodyHandler);
        
        return respuesta.body();
    }
    
    protected boolean POST(String path, String body) throws IOException, InterruptedException, URISyntaxException {
        HttpClient cliente= HttpClient.newHttpClient();
        
        HttpRequest peticion= HttpRequest.newBuilder()
                    .uri(new URI(path))
                    .POST(HttpRequest.BodyPublishers.ofString(body))
                    .header("Content-type", "application/json")
                    .build();
        
        var bodyHandler= HttpResponse.BodyHandlers.ofString();
        
        HttpResponse<String> respuesta= cliente.send(peticion, bodyHandler);
        
        return Boolean.parseBoolean(respuesta.body());
    }
    
    protected boolean PUT(String path, String id, String body) throws IOException, InterruptedException, URISyntaxException {
        HttpClient cliente= HttpClient.newHttpClient();
        
        path += "/" + id;
        
        HttpRequest peticion= HttpRequest.newBuilder()
                    .uri(new URI(path))
                    .PUT(HttpRequest.BodyPublishers.ofString(body))
                    .header("Content-type", "application/json")
                    .build();
        
        var bodyHandler= HttpResponse.BodyHandlers.ofString();
        
        HttpResponse<String> respuesta= cliente.send(peticion, bodyHandler);
        
        return Boolean.parseBoolean(respuesta.body());
    }
    
    protected boolean DELETE(String path, String id) throws IOException, InterruptedException, URISyntaxException {
        HttpClient cliente= HttpClient.newHttpClient();
        
        path += "/" + id;
        
        HttpRequest peticion= HttpRequest.newBuilder()
                    .uri(new URI(path))
                    .DELETE()
                    .header("Content-type", "application/json")
                    .build();
        
        var bodyHandler= HttpResponse.BodyHandlers.ofString();
        
        HttpResponse<String> respuesta= cliente.send(peticion, bodyHandler);
        
        return Boolean.parseBoolean(respuesta.body());
    }
    
}
