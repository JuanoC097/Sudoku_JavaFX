package gestionarchivos;

import observador.Observador;


public class GestionArchivos {
    
    private JFGestionA jfga;
    
    public GestionArchivos() {
        jfga = new JFGestionA();
        jfga.setVisible(false);
        jfga.setLocationRelativeTo(null);
    }
    
    public void setTabla(String Tabla){
        this.jfga.setTabla(Tabla);
    }
    
    public String getTabla(){
        return this.jfga.getTabla();
    }
    
    public void setVisible(boolean isVisible){
        this.jfga.setVisible(isVisible);
    }
    
    public void show(){
        this.jfga.show();
    }
    
    public void EnlazarObservador(Observador O){
        this.jfga.EnlazarObservador(O);
    }
}
