import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static ArrayList<Integer> playerPositions;

    static {
        playerPositions = new ArrayList<Integer>();
    }

    static ArrayList<Integer> cpuPositions;

    static {
        cpuPositions = new ArrayList<Integer>();
    }

    public static void main(String[] args) {



        char[] [] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9):");
            int playerPos = scan.nextInt();

            placePiece(gameBoard, playerPos, "player");

            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            placePiece(gameBoard, cpuPos, "cpu");

            printGameBoard(gameBoard);

            checkWinner();
        }


    }
    public static void printGameBoard(char [] [] gameBoard) {
       for (char [] row : gameBoard) {
           for(char c: row) {
               System.out.print(c);
           }
           System.out.println();
       }
    }
    public static void placePiece(char [] [] gameBoard, int pos, String user) {

        char symbol = ' ';

        if(user.equals("player")) {
            symbol = 'x';
            if (pos != 1) {
                if (pos == 2) {
                    gameBoard[0][2] = symbol;
                } else if (pos == 3) {
                    gameBoard[0][4] = symbol;
                } else if (pos == 4) {
                    gameBoard[2][0] = symbol;
                } else if (pos == 5) {
                    gameBoard[2][2] = symbol;
                } else if (pos == 6) {
                    gameBoard[2][4] = symbol;
                } else if (pos == 7) {
                    gameBoard[4][0] = symbol;
                } else if (pos == 8) {
                    gameBoard[4][2] = symbol;
                } else if (pos == 9) {
                    gameBoard[4][4] = symbol;
                }
            } else {
                gameBoard[0][0] = symbol;
            }
        } else {
            if (user.equals("cpu")) {
                symbol = '0';
            }
            switch(pos) {
                case 1:
                    gameBoard[0][0] = symbol;
                    break;
                case 2:
                    gameBoard[0][2] = symbol;
                    break;
                case 3:
                    gameBoard[0][4] = symbol;
                    break;
                case 4:
                    gameBoard[2][0] = symbol;
                    break;
                case 5:
                    gameBoard[2][2] = symbol;
                    break;
                case 6:
                    gameBoard[2][4] = symbol;
                    break;
                case 7:
                    gameBoard[4][0] = symbol;
                    break;
                case 8:
                    gameBoard[4][2] = symbol;
                    break;
                case 9:
                    gameBoard[4][4] = symbol;
                    break;
                default:
                    break;

            }
        }
        public static String checkWinner() {

            List topRow = ArrayList(1, 2, 3);
            List midRow = ArrayList(4, 5, 6);
            List botRow = ArrayList(7, 8, 9);
            List leftCol = ArrayList(1, 4, 7);
            List midCol = ArrayList(2, 5, 8);
            List rightCol = ArrayList(3, 6, 9);
            List cross1 = ArrayList(1, 5, 9);
            List cross2 = ArrayList(7, 5, 3);

            List<List> winning = new ArrayList<List>();
            winning.add(topRow);
            winning.add(midRow);
            winning.add(botRow);
            winning.add(leftCol);
            winning.add(midCol);
            winning.add(rightCol);
            winning.add(cross1);
            winning.add(cross2);

            for(List l: winning) {
                if(playerPositions.containsAll(l)) {
                    return "Congratulations you won!";
                } else if(cpuPositions.contains(l))  {
                    return "CPU wins!";
                } else if (plyerPosition.size() + cpuPositions.size() = 9) {
                    return "CAT!";
                }
            }

            return "";


        }
    }
}


//https://www.youtube.com/watch?v=gQb3dE-y1S4&t=2s&ab_channel=AlexLee 31 минута