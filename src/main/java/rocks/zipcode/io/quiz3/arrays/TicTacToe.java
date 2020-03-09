package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return this.board[value];
    }

    public String[] getColumn(Integer value) {
        String[] answer = new String[3];

        for(int x = 0; x<= 2; x++){
            answer[x] = board[x][value];
        }
        return answer;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        boolean answer = true;
        String play = "";
        play = board[rowIndex][rowIndex];
        String[] column = getRow(rowIndex);
        for(String element : column){
            if(element.equals(play)){

            }else{
                answer =false;
                break;
            }
        }
        return answer;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        boolean answer = true;
        String play = "";
        play = board[columnIndex][columnIndex];
        String[] column = getColumn(columnIndex);
        for(String element : column){
            if(element.equals(play)){

            }else{
                answer =false;
                break;
            }
        }
        return answer;
    }

    public String getWinner() {

        boolean row0 =  isRowHomogenous(0);
        if(row0){
            return getRow(0)[0];
        }
        boolean row1 =  isRowHomogenous(1);
        if(row1){
            return getRow(1)[0];
        }
        boolean row2 =  isRowHomogenous(2);
        if(row2){
            return getRow(2)[0];
        }

        boolean column0 =  isColumnHomogeneous(0);
        if(column0){
            return getColumn(0)[0];
        }
        boolean column1 =  isColumnHomogeneous(1);
        if(column1){
            return getColumn(1)[0];
        }
        boolean column2 =  isColumnHomogeneous(2);
        if(column2){
            return getColumn(2)[0];
        }else{
            String[] Xdiag =  {"X","X","X"};
            String[] downRight = {getRow(0)[0],getRow(1)[1],getRow(2)[2]};
            String[] downLeft = {getRow(0)[2],getRow(1)[1],getRow(2)[0]};

            boolean xwonDiagL = true;
            for(String element : downLeft){
                if(element.equals("X")){

                }else{
                    xwonDiagL = false;
                    break;
                }
            }
            boolean xWondiagR = true;
            for(String element : downRight){
                if(element.equals("X")){

                }else{
                    xWondiagR = false;
                    break;
                }
            }
            if(!xwonDiagL && !xWondiagR){
                return "O";
            }else{
                return "X";
            }

        }

    }

    public String[][] getBoard() {
        return this.board;
    }
}
