package sudoku.model;
import observador.Observador;

/**
 *
 * @author juanz
 */
public class Board implements Observador{
    private int[][] board;
    private String BoardString;
    public Board(){
        this(null);
    }
    public Board(int[][] board){
        this.board = new int[9][9];
        for(int row=0; row < board.length; row++){
            for(int col=0; col < board[0].length; col++){
                this.board[row][col] = board[row][col];
            }
        }
    }
    public int getBoard(int row, int col){
        return this.board[row][col];
    }
    public void setBoard(int row, int col, int value){
        this.board[row][col] = value;
    }
    public String getBoardString(){
        return this.BoardString;
    }
    public void setBoardString(String Board){
        this.BoardString = Board;
    }

    @Override
    public void update() {
        //Cuando la board se modifica se actualiza el modelo
        System.out.println("Cambia el modelo");
    }
}
