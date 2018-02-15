package sudoku.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import gestionarchivos.GestionArchivos;

/**
 * FXML Controller class
 *
 * @author juanz
 */
public class RootLayoutController{
    
    @FXML
    private Button BotonOpenSudoku;
    
    private GestionArchivos gestion;
    
    @FXML
    private void EventoOpenSudoku(ActionEvent e){
        gestion.setVisible(true);   //ABRIR ARCHIVOS CON 2
        gestion.show();
    }
    
    public RootLayoutController(){
    }
    
    @FXML
    public void initialize(){
        this.gestion = new GestionArchivos();
    }
}
