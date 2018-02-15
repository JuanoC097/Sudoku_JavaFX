package sudoku;

import java.io.IOException;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sudoku.model.Board;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    
    private Board BoardData;

    public MainApp(){
        // Add some sample data
        int[][] tabla = {{5,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,3,0,0}, {0,0,0,0,0,0,0,0,4}, {0,0,0,1,0,0,0,0,0}, {0,0,0,0,7,0,0,0,0}, {0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,9,0,0,0}};
        this.BoardData = new Board(tabla);
    }
    
    public Board getBoardData(){
        return this.BoardData;
    }
    
    public void setBoardData(int row, int col, int value){
        this.BoardData.setBoard(row, col, value);
    }
    
    public String getBoardString(){
        return this.BoardData.getBoardString();
    }
    
    public void setBoardString(String BoardString){
        this.BoardData.setBoardString(BoardString);
    }
    
    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("SudokuApp");

        initRootLayout();

        showBoardOverview();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showBoardOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/BoardOverview.fxml"));
            AnchorPane BoardOverview = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(BoardOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args){
        launch(args);
    }
}