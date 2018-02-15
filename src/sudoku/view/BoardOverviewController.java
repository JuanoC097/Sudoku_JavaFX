package sudoku.view;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sudoku.MainApp;

/**
 *
 * @author juanz
 */
public class BoardOverviewController{
// <editor-fold defaultstate="collapsed" desc="81 Labels">
    @FXML
    private Label Label00;
    @FXML
    private Label Label01;
    @FXML
    private Label Label02;
    @FXML
    private Label Label03;
    @FXML
    private Label Label04;
    @FXML
    private Label Label05;
    @FXML
    private Label Label06;
    @FXML
    private Label Label07;
    @FXML
    private Label Label08;
    //--------------------
    @FXML
    private Label Label10;
    @FXML
    private Label Label11;
    @FXML
    private Label Label12;
    @FXML
    private Label Label13;
    @FXML
    private Label Label14;
    @FXML
    private Label Label15;
    @FXML
    private Label Label16;
    @FXML
    private Label Label17;
    @FXML
    private Label Label18;
    //--------------------
    @FXML
    private Label Label20;
    @FXML
    private Label Label21;
    @FXML
    private Label Label22;
    @FXML
    private Label Label23;
    @FXML
    private Label Label24;
    @FXML
    private Label Label25;
    @FXML
    private Label Label26;
    @FXML
    private Label Label27;
    @FXML
    private Label Label28;
    //--------------------
    @FXML
    private Label Label30;
    @FXML
    private Label Label31;
    @FXML
    private Label Label32;
    @FXML
    private Label Label33;
    @FXML
    private Label Label34;
    @FXML
    private Label Label35;
    @FXML
    private Label Label36;
    @FXML
    private Label Label37;
    @FXML
    private Label Label38;
    //--------------------
    @FXML
    private Label Label40;
    @FXML
    private Label Label41;
    @FXML
    private Label Label42;
    @FXML
    private Label Label43;
    @FXML
    private Label Label44;
    @FXML
    private Label Label45;
    @FXML
    private Label Label46;
    @FXML
    private Label Label47;
    @FXML
    private Label Label48;
    //--------------------
    @FXML
    private Label Label50;
    @FXML
    private Label Label51;
    @FXML
    private Label Label52;
    @FXML
    private Label Label53;
    @FXML
    private Label Label54;
    @FXML
    private Label Label55;
    @FXML
    private Label Label56;
    @FXML
    private Label Label57;
    @FXML
    private Label Label58;
    //--------------------
    @FXML
    private Label Label60;
    @FXML
    private Label Label61;
    @FXML
    private Label Label62;
    @FXML
    private Label Label63;
    @FXML
    private Label Label64;
    @FXML
    private Label Label65;
    @FXML
    private Label Label66;
    @FXML
    private Label Label67;
    @FXML
    private Label Label68;
    //--------------------
    @FXML
    private Label Label70;
    @FXML
    private Label Label71;
    @FXML
    private Label Label72;
    @FXML
    private Label Label73;
    @FXML
    private Label Label74;
    @FXML
    private Label Label75;
    @FXML
    private Label Label76;
    @FXML
    private Label Label77;
    @FXML
    private Label Label78;
    //--------------------
    @FXML
    private Label Label80;
    @FXML
    private Label Label81;
    @FXML
    private Label Label82;
    @FXML
    private Label Label83;
    @FXML
    private Label Label84;
    @FXML
    private Label Label85;
    @FXML
    private Label Label86;
    @FXML
    private Label Label87;
    @FXML
    private Label Label88;
// </editor-fold>
    
    @FXML
    private Label LabelRecomendaciones;
    @FXML
    private TextField InsertarRow;
    @FXML
    private TextField InsertarCol;
    @FXML
    private TextField InsertarValue;
    @FXML
    private Button BotonInsertar;
    
    private MainApp mainApp;
    
    @FXML
    private void EventoInsertar(ActionEvent e){
        int Row = (InsertarRow.getText()).length();
        int Col = (InsertarCol.getText()).length();
        int Value = (InsertarValue.getText()).length();
        if(Row==1 && Col==1 && Value==1){
            Row = Integer.parseInt(InsertarRow.getText());
            Col = Integer.parseInt(InsertarCol.getText());
            //SI TODAS LAS COMPROBACIONES SON CORRECTAS ENTONCES
            // <editor-fold defaultstate="collapsed" desc="81 Labels IF">
            if(Row==0 && Col==0)
                Label00.setText(InsertarValue.getText());
            if(Row==0 && Col==1)
                Label01.setText(InsertarValue.getText());
            if(Row==0 && Col==2)
                Label02.setText(InsertarValue.getText());
            if(Row==0 && Col==3)
                Label03.setText(InsertarValue.getText());
            if(Row==0 && Col==4)
                Label04.setText(InsertarValue.getText());
            if(Row==0 && Col==5)
                Label05.setText(InsertarValue.getText());
            if(Row==0 && Col==6)
                Label06.setText(InsertarValue.getText());
            if(Row==0 && Col==7)
                Label07.setText(InsertarValue.getText());
            if(Row==0 && Col==8)
                Label08.setText(InsertarValue.getText());
            //--------------------------------------------
            if(Row==1 && Col==0)
                Label10.setText(InsertarValue.getText());
            if(Row==1 && Col==1)
                Label11.setText(InsertarValue.getText());
            if(Row==1 && Col==2)
                Label12.setText(InsertarValue.getText());
            if(Row==1 && Col==3)
                Label13.setText(InsertarValue.getText());
            if(Row==1 && Col==4)
                Label14.setText(InsertarValue.getText());
            if(Row==1 && Col==5)
                Label15.setText(InsertarValue.getText());
            if(Row==1 && Col==6)
                Label16.setText(InsertarValue.getText());
            if(Row==1 && Col==7)
                Label17.setText(InsertarValue.getText());
            if(Row==1 && Col==8)
                Label08.setText(InsertarValue.getText());
            //-------------------------------------------
            if(Row==2 && Col==0)
                Label20.setText(InsertarValue.getText());
            if(Row==2 && Col==1)
                Label21.setText(InsertarValue.getText());
            if(Row==2 && Col==2)
                Label22.setText(InsertarValue.getText());
            if(Row==2 && Col==3)
                Label23.setText(InsertarValue.getText());
            if(Row==2 && Col==4)
                Label24.setText(InsertarValue.getText());
            if(Row==2 && Col==5)
                Label25.setText(InsertarValue.getText());
            if(Row==2 && Col==6)
                Label26.setText(InsertarValue.getText());
            if(Row==2 && Col==7)
                Label27.setText(InsertarValue.getText());
            if(Row==2 && Col==8)
                Label28.setText(InsertarValue.getText());
            //--------------------------------------------
            if(Row==3 && Col==0)
                Label30.setText(InsertarValue.getText());
            if(Row==3 && Col==1)
                Label31.setText(InsertarValue.getText());
            if(Row==3 && Col==2)
                Label32.setText(InsertarValue.getText());
            if(Row==3 && Col==3)
                Label33.setText(InsertarValue.getText());
            if(Row==3 && Col==4)
                Label34.setText(InsertarValue.getText());
            if(Row==3 && Col==5)
                Label35.setText(InsertarValue.getText());
            if(Row==3 && Col==6)
                Label36.setText(InsertarValue.getText());
            if(Row==3 && Col==7)
                Label37.setText(InsertarValue.getText());
            if(Row==3 && Col==8)
                Label38.setText(InsertarValue.getText());
            //--------------------------------------------
            if(Row==4 && Col==0)
                Label40.setText(InsertarValue.getText());
            if(Row==4 && Col==1)
                Label41.setText(InsertarValue.getText());
            if(Row==4 && Col==2)
                Label42.setText(InsertarValue.getText());
            if(Row==4 && Col==3)
                Label43.setText(InsertarValue.getText());
            if(Row==4 && Col==4)
                Label44.setText(InsertarValue.getText());
            if(Row==4 && Col==5)
                Label45.setText(InsertarValue.getText());
            if(Row==4 && Col==6)
                Label46.setText(InsertarValue.getText());
            if(Row==4 && Col==7)
                Label47.setText(InsertarValue.getText());
            if(Row==4 && Col==8)
                Label48.setText(InsertarValue.getText());
            //--------------------------------------------
            if(Row==5 && Col==0)
                Label50.setText(InsertarValue.getText());
            if(Row==5 && Col==1)
                Label51.setText(InsertarValue.getText());
            if(Row==5 && Col==2)
                Label52.setText(InsertarValue.getText());
            if(Row==5 && Col==3)
                Label53.setText(InsertarValue.getText());
            if(Row==5 && Col==4)
                Label54.setText(InsertarValue.getText());
            if(Row==5 && Col==5)
                Label55.setText(InsertarValue.getText());
            if(Row==5 && Col==6)
                Label56.setText(InsertarValue.getText());
            if(Row==5 && Col==7)
                Label57.setText(InsertarValue.getText());
            if(Row==5 && Col==8)
                Label58.setText(InsertarValue.getText());
            //--------------------------------------------
            if(Row==6 && Col==0)
                Label60.setText(InsertarValue.getText());
            if(Row==6 && Col==1)
                Label61.setText(InsertarValue.getText());
            if(Row==6 && Col==2)
                Label62.setText(InsertarValue.getText());
            if(Row==6 && Col==3)
                Label63.setText(InsertarValue.getText());
            if(Row==6 && Col==4)
                Label64.setText(InsertarValue.getText());
            if(Row==6 && Col==5)
                Label65.setText(InsertarValue.getText());
            if(Row==6 && Col==6)
                Label66.setText(InsertarValue.getText());
            if(Row==6 && Col==7)
                Label67.setText(InsertarValue.getText());
            if(Row==6 && Col==8)
                Label68.setText(InsertarValue.getText());
            //--------------------------------------------
            if(Row==7 && Col==0)
                Label70.setText(InsertarValue.getText());
            if(Row==7 && Col==1)
                Label71.setText(InsertarValue.getText());
            if(Row==7 && Col==2)
                Label72.setText(InsertarValue.getText());
            if(Row==7 && Col==3)
                Label73.setText(InsertarValue.getText());
            if(Row==7 && Col==4)
                Label74.setText(InsertarValue.getText());
            if(Row==7 && Col==5)
                Label75.setText(InsertarValue.getText());
            if(Row==7 && Col==6)
                Label76.setText(InsertarValue.getText());
            if(Row==7 && Col==7)
                Label77.setText(InsertarValue.getText());
            if(Row==7 && Col==8)
                Label78.setText(InsertarValue.getText());
            //--------------------------------------------
            if(Row==8 && Col==0)
                Label80.setText(InsertarValue.getText());
            if(Row==8 && Col==1)
                Label81.setText(InsertarValue.getText());
            if(Row==8 && Col==2)
                Label82.setText(InsertarValue.getText());
            if(Row==8 && Col==3)
                Label83.setText(InsertarValue.getText());
            if(Row==8 && Col==4)
                Label84.setText(InsertarValue.getText());
            if(Row==8 && Col==5)
                Label85.setText(InsertarValue.getText());
            if(Row==8 && Col==6)
                Label86.setText(InsertarValue.getText());
            if(Row==8 && Col==7)
                Label87.setText(InsertarValue.getText());
            if(Row==8 && Col==8)
                Label88.setText(InsertarValue.getText());
            // </editor-fold>
            //--------------------------------------------
            Value = Integer.parseInt(InsertarValue.getText());
            (this.mainApp.getBoardData()).setBoard(Row, Col, Value);
        }else{
            LabelRecomendaciones.setText("El Valor, Columna o \nFila no son valores\nvalidos");
        }
    }
    
    public void setBoardString(String BoardString){
        this.mainApp.setBoardString(BoardString);
        System.out.println(this.mainApp.getBoardString());
    }
    
    private void InsertarBoardView(int Row,int Col,int Value){
        String Valor = String.valueOf(Value);
        // <editor-fold defaultstate="collapsed" desc="81 Labels IF">
        if(Row==0 && Col==0)
            Label00.setText(Valor);
        if(Row==0 && Col==1)
            Label01.setText(Valor);
        if(Row==0 && Col==2)
            Label02.setText(Valor);
        if(Row==0 && Col==3)
            Label03.setText(Valor);
        if(Row==0 && Col==4)
            Label04.setText(Valor);
        if(Row==0 && Col==5)
            Label05.setText(Valor);
        if(Row==0 && Col==6)
            Label06.setText(Valor);
        if(Row==0 && Col==7)
            Label07.setText(Valor);
        if(Row==0 && Col==8)
            Label08.setText(Valor);
        //--------------------------------------------
        if(Row==1 && Col==0)
            Label10.setText(Valor);
        if(Row==1 && Col==1)
            Label11.setText(Valor);
        if(Row==1 && Col==2)
            Label12.setText(Valor);
        if(Row==1 && Col==3)
            Label13.setText(Valor);
        if(Row==1 && Col==4)
            Label14.setText(Valor);
        if(Row==1 && Col==5)
            Label15.setText(Valor);
        if(Row==1 && Col==6)
            Label16.setText(Valor);
        if(Row==1 && Col==7)
            Label17.setText(Valor);
        if(Row==1 && Col==8)
            Label08.setText(Valor);
        //-------------------------------------------
        if(Row==2 && Col==0)
            Label20.setText(Valor);
        if(Row==2 && Col==1)
            Label21.setText(Valor);
        if(Row==2 && Col==2)
            Label22.setText(Valor);
        if(Row==2 && Col==3)
            Label23.setText(Valor);
        if(Row==2 && Col==4)
            Label24.setText(Valor);
        if(Row==2 && Col==5)
            Label25.setText(Valor);
        if(Row==2 && Col==6)
            Label26.setText(Valor);
        if(Row==2 && Col==7)
            Label27.setText(Valor);
        if(Row==2 && Col==8)
            Label28.setText(Valor);
        //--------------------------------------------
        if(Row==3 && Col==0)
            Label30.setText(Valor);
        if(Row==3 && Col==1)
            Label31.setText(Valor);
        if(Row==3 && Col==2)
            Label32.setText(Valor);
        if(Row==3 && Col==3)
            Label33.setText(Valor);
        if(Row==3 && Col==4)
            Label34.setText(Valor);
        if(Row==3 && Col==5)
            Label35.setText(Valor);
        if(Row==3 && Col==6)
            Label36.setText(Valor);
        if(Row==3 && Col==7)
            Label37.setText(Valor);
        if(Row==3 && Col==8)
            Label38.setText(Valor);
        //--------------------------------------------
        if(Row==4 && Col==0)
            Label40.setText(Valor);
        if(Row==4 && Col==1)
            Label41.setText(Valor);
        if(Row==4 && Col==2)
            Label42.setText(Valor);
        if(Row==4 && Col==3)
            Label43.setText(Valor);
        if(Row==4 && Col==4)
            Label44.setText(Valor);
        if(Row==4 && Col==5)
            Label45.setText(Valor);
        if(Row==4 && Col==6)
            Label46.setText(Valor);
        if(Row==4 && Col==7)
            Label47.setText(Valor);
        if(Row==4 && Col==8)
            Label48.setText(Valor);
        //--------------------------------------------
        if(Row==5 && Col==0)
            Label50.setText(Valor);
        if(Row==5 && Col==1)
            Label51.setText(Valor);
        if(Row==5 && Col==2)
            Label52.setText(Valor);
        if(Row==5 && Col==3)
            Label53.setText(Valor);
        if(Row==5 && Col==4)
            Label54.setText(Valor);
        if(Row==5 && Col==5)
            Label55.setText(Valor);
        if(Row==5 && Col==6)
            Label56.setText(Valor);
        if(Row==5 && Col==7)
            Label57.setText(Valor);
        if(Row==5 && Col==8)
            Label58.setText(Valor);
        //--------------------------------------------
        if(Row==6 && Col==0)
            Label60.setText(Valor);
        if(Row==6 && Col==1)
            Label61.setText(Valor);
        if(Row==6 && Col==2)
            Label62.setText(Valor);
        if(Row==6 && Col==3)
            Label63.setText(Valor);
        if(Row==6 && Col==4)
            Label64.setText(Valor);
        if(Row==6 && Col==5)
            Label65.setText(Valor);
        if(Row==6 && Col==6)
            Label66.setText(Valor);
        if(Row==6 && Col==7)
            Label67.setText(Valor);
        if(Row==6 && Col==8)
            Label68.setText(Valor);
        //--------------------------------------------
        if(Row==7 && Col==0)
            Label70.setText(Valor);
        if(Row==7 && Col==1)
            Label71.setText(Valor);
        if(Row==7 && Col==2)
            Label72.setText(Valor);
        if(Row==7 && Col==3)
            Label73.setText(Valor);
        if(Row==7 && Col==4)
            Label74.setText(Valor);
        if(Row==7 && Col==5)
            Label75.setText(Valor);
        if(Row==7 && Col==6)
            Label76.setText(Valor);
        if(Row==7 && Col==7)
            Label77.setText(Valor);
        if(Row==7 && Col==8)
            Label78.setText(Valor);
        //--------------------------------------------
        if(Row==8 && Col==0)
            Label80.setText(Valor);
        if(Row==8 && Col==1)
            Label81.setText(Valor);
        if(Row==8 && Col==2)
            Label82.setText(Valor);
        if(Row==8 && Col==3)
            Label83.setText(Valor);
        if(Row==8 && Col==4)
            Label84.setText(Valor);
        if(Row==8 && Col==5)
            Label85.setText(Valor);
        if(Row==8 && Col==6)
            Label86.setText(Valor);
        if(Row==8 && Col==7)
            Label87.setText(Valor);
        if(Row==8 && Col==8)
            Label88.setText(Valor);
        // </editor-fold>
    }

    public BoardOverviewController() {
    }
    
    @FXML
    private void initialize(){
        this.mainApp = new MainApp();
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                int valor = (this.mainApp.getBoardData()).getBoard(row,col);
                if(valor != 0){
                        InsertarBoardView(row,col,valor);
                }
            }
        }
    }
}
