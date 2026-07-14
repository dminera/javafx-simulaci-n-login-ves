/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.danielminera.controller;
 
import com.danielminera.view.LoginView;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import  javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;
 

public class SceneManager {
    private Stage escenarioPrincipal;
    private Stage escenarioSecundario;
    private Scene escenaPrincipal;
    private static SceneManager instanciaSceneManager;

    private SceneManager(){
    }
    public void ventanaLogin(){
        try {
            this.escenarioPrincipal.initStyle(StageStyle.TRANSPARENT);
            LoginView login = LoginView.getInstanciaLoginView();
            cambiarEscena(login, 450, 500);
            this.escenaPrincipal.setFill(Color.TRANSPARENT);
            new LoginController(login);
            
            
            
            
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Ventana Escena");
            objetoNulo . printStackTrace(); //Mostrar todo el camino del error
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error Padre: Ventana Escena");
            errorPadre . printStackTrace(); 

        }

    }
    public void cambiarEscena(Pane panel, int ancho, int alto){
        try {
            escenaPrincipal = new Scene(panel, ancho, alto);
            this.escenarioPrincipal.setScene(escenaPrincipal);
            this.escenarioPrincipal.sizeToScene();
            this.escenarioPrincipal.show();
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Cambiar Escena");
            objetoNulo . printStackTrace(); //Mostrar todo el camino del error
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error Padre: Cambiar Escena");
            errorPadre . printStackTrace(); 

        }


    }
 
    public Stage getEscenarioPrincipal() {
        return escenarioPrincipal;
    }
 
    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
 
    public Stage getEscenarioSecundario() {
        return escenarioSecundario;
    }
 
    public void setEscenarioSecundario(Stage escenarioSecundario) {
        this.escenarioSecundario = escenarioSecundario;
    }
 
    public Scene getEscenaPrincipal() {
        return escenaPrincipal;
    }
 
    public void setEscenaPrincipal(Scene escenaPrincipal) {
        this.escenaPrincipal = escenaPrincipal;
    }
 
    public static SceneManager getInstanciaSceneManager() {
        return instanciaSceneManager;
    }
 
    public static void setInstanciaSceneManager(SceneManager instanciaSceneManager) {
        if(instanciaSceneManager == null)
            instanciaSceneManager =  new SceneManager();
        SceneManager.instanciaSceneManager = instanciaSceneManager;
    }




}