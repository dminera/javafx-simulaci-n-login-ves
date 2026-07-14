/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielminera.view;
import javafx.geometry.Insets;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;


public class LoginView extends BorderPane {
    private static LoginView instanciaLoginView;
    private Button btnCerrarVentana;
    private Label lblTituloVentana;
    private HBox barraDeOpciones;
    private VBox cajaVertical;
    private Label lblNombreUsuario;
    private TextField txtNombreUsuario;
    private Label lblClave;
    private PasswordField pwdClave;
    private GridPane formulario;
    private ImageView imLogoLogin;
    private Button btnIniciarSesion;
    
    
    private LoginView(){
        this.setPadding(new Insets(15));
        this.setBorder(new Border(
                new BorderStroke(paint.valueOf("#292C8C")),
                    BorderStrokeStyle.SOLID,
                new    CornerRadii(25),
                new    BorderWidths(2))
        ));
        this.setBackground(new Background(
                new BackgroundFill(Color.WHITESMOKE,
                         new  CornerRadii(25),
                        Insets.EMPTY)
        ));        
        
        
        
        barraDeOpciones = new HBox(25);
        
        
        btnCerrarVentana = new Button("X");
        lblTituloVentana = new Label("JAVAFX - SIMULACION LOGIN");
        
        barraDeOpciones.getChildren().addAll(btnCerrarVentana,lblTituloVentana);
            
            this.setTop(barraDeOpciones);
     //Objetos del formulario
     cajaVertical = new Vbox();
     formulario = new Gridpane();
     lblNombreUsuario = new Label("ingrese su nombre usuario");
     txtNombreUsuario = new TextField();
     lblClave = new label("ingrese su contraseña");
     pwdClave = new PasswordField();
     
     formulario.add(lblNombreUsuario,0,0);
     formulario.add(txtNombreUsuario,1,0);
     
     formulario.add(lblClave,0,1);
     formulario.add(pwdClave,1,1);
     
     imgLogoLogin = new ImageView(new ImageController().getImageLogin("logo"));
     imgLogoLogin.setFitWidth(100);
     imgLogoLogin.setFitHeigth(100);
     imgLogoLogin.setCache(true);
     
     cajaVertical.setAlignment(Pos.Center);
     
     
     btnIniciarSesion = new Button("iniciar sesion");
     cajaVertical.getChildren().addAll(imgLogoLogin,formulario,btnIniciarSesion);
     this.setCenter(cajaVertical);
     
     
     
    }
   

    public static LoginView getInstanciaLoginView() {
        if(instanciaLoginView == null)
            instanciaLoginView = new LoginView();
        return instanciaLoginView;
    }

    public static void setInstanciaLoginView(LoginView instanciaLoginView) {
        LoginView.instanciaLoginView = instanciaLoginView;
    }

    public Button getBtnCerrarVentana() {
        return btnCerrarVentana;
    }

    public void setBtnCerrarVentana(Button btnCerrarVentana) {
        this.btnCerrarVentana = btnCerrarVentana;
    }

    public Label getLblTituloVentana() {
        return lblTituloVentana;
    }

    public void setLblTituloVentana(Label lblTituloVentana) {
        this.lblTituloVentana = lblTituloVentana;
    }

    public HBox getBarraDeOpciones() {
        return barraDeOpciones;
    }

    public void setBarraDeOpciones(HBox barraDeOpciones) {
        this.barraDeOpciones = barraDeOpciones;
    }
    
    
    
}
