package javaapplication1;

import View.Splash_GUI;

public class JavaApplication1 {

    public static void main(String[] args) {
       Controller.Testa_DB.conecta();
       new Splash_GUI().setVisible(true);
    }
    
}
