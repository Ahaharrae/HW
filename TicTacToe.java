import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner jake = new Scanner(System.in);
        int count = 0;//used to print board
        String[][] board;
        board = new String[3][3];
        System.out.println("Choose X or O");
        String human = jake.nextLine();
        System.out.println("Enter your name");
        String name = jake.nextLine();
        String bot = "hi";
        if (human.equals("X")) {
            bot = "O";
        } else if (human.equals("O")) {
            bot = "X";
        }
        boolean human_win = false;
        boolean bot_win = false;
        boolean j_loss = false;
        board[0][0] = "-";
        board[0][1] = "-";
        board[0][2] = "-";
        board[1][0] = "-";
        board[1][1] = "-";
        board[1][2] = "-";
        board[2][0] = "-";
        board[2][1] = "-";
        board[2][2] = "-";
        while (human_win != true && bot_win != true) {//print board
            count = 0;
            for (int p = 3; p > 0; p--) {
                System.out.println();
                for (int i = 0; i < 3; i++) {
                    count++;
                    if (count == 1) {
                        System.out.print(board[0][0]);
                    } else if (count == 2) {
                        System.out.print(board[1][0]);
                    } else if (count == 3) {
                        System.out.print(board[2][0]);
                    } else if (count == 4) {
                        System.out.print(board[0][1]);
                    } else if (count == 5) {
                        System.out.print(board[1][1]);
                    } else if (count == 6) {
                        System.out.print(board[2][1]);
                    } else if (count == 7) {
                        System.out.print(board[0][2]);
                    } else if (count == 8) {
                        System.out.print(board[1][2]);
                    } else if (count == 9) {
                        System.out.print(board[2][2]);
                    }
                }
            }
            if (j_loss == true) {
                break;
            }
            //game that totally works
            int bot_row = (int) (Math.random() * 3);
            int bot_column = (int) (Math.random() * 3);
            //code that doesn't work
            System.out.println();
            System.out.println("Enter the row (1,2,or 3)");
            int row = (jake.nextInt() - 1);
            System.out.println("Enter the column (1,2,or 3)");
            int column = (jake.nextInt() - 1);
            board[column][row] = human;

            boolean why = false;
            while (!why) {
                if (board[bot_row][bot_column].equals("-")) {
                    board[bot_row][bot_column] = bot;
                    why = true;
                } else if (board[bot_row][bot_column].equals("X") || board[bot_row][bot_column].equals("O")) {
                    bot_row = (int) (Math.random() * 3);
                    bot_column = (int) (Math.random() * 3);
                    if (!board[0][0].equals("-") && !board[1][0].equals("-") && !board[2][0].equals("-") && !board[0][1].equals("-") && !board[1][1].equals("-") && !board[2][1].equals("-") && !board[0][2].equals("-") && !board[1][2].equals("-") && !board[2][2].equals("-")) {
                        break;
                    }
                }
            } if (board[0][0].equals(human) && board[0][1].equals(human) && board[0][2].equals(human)) {

                if (name.equals("Jocelyn")||name.equals("jocelyn")) {
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (board[x][y].equals("X")) {
                                board[x][y] = "O";
                            } else if (board[x][y].equals("O")) {
                                board[x][y] = "X";
                            }
                        }
                    }
                    System.out.println("You lose lol take that. Eric made me do this");
                    human_win = false;
                    j_loss = true;
                } else {
                    System.out.println("You win!");
                    human_win = true;
                }

            } else if (board[1][0].equals(human) && board[1][1].equals(human) && board[1][2].equals(human)) {
                if (name.equals("Jocelyn")||name.equals("jocelyn")) {
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (board[x][y].equals("X")) {
                                board[x][y] = "O";
                            } else if (board[x][y].equals("O")) {
                                board[x][y] = "X";
                            }
                        }
                    }
                    System.out.println("You lose lol take that. Eric made me do this");
                    human_win = false;
                    j_loss = true;
                } else {
                    System.out.println("You win!");
                    human_win = true;
                }
            } else if (board[2][0].equals(human) && board[2][1].equals(human) && board[2][2].equals(human)) {
                if (name.equals("Jocelyn")||name.equals("jocelyn")) {
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (board[x][y].equals("X")) {
                                board[x][y] = "O";
                            } else if (board[x][y].equals("O")) {
                                board[x][y] = "X";
                            }
                        }
                    }
                    System.out.println("You lose lol take that. Eric made me do this");
                    human_win = false;
                    j_loss = true;
                } else {
                    System.out.println("You win!");
                    human_win = true;
                }
            } else if (board[0][0].equals(human) && board[1][0].equals(human) && board[2][0].equals(human)) {
                if (name.equals("Jocelyn")||name.equals("jocelyn")) {
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (board[x][y].equals("X")) {
                                board[x][y] = "O";
                            } else if (board[x][y].equals("O")) {
                                board[x][y] = "X";
                            }
                        }
                    }
                    System.out.println("You lose lol take that. Eric made me do this");
                    human_win = false;
                    j_loss = true;
                } else {
                    System.out.println("You win!");
                    human_win = true;
                }
            } else if (board[0][1].equals(human) && board[1][1].equals(human) && board[2][1].equals(human)) {
                if (name.equals("Jocelyn")||name.equals("jocelyn")) {
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (board[x][y].equals("X")) {
                                board[x][y] = "O";
                            } else if (board[x][y].equals("O")) {
                                board[x][y] = "X";
                            }
                        }
                    }
                    System.out.println("You lose lol take that. Eric made me do this");
                    human_win = false;
                    j_loss = true;
                } else {
                    System.out.println("You win!");
                    human_win = true;
                }
            } else if (board[0][2].equals(human) && board[1][2].equals(human) && board[2][2].equals(human)) {
                if (name.equals("Jocelyn")||name.equals("jocelyn")) {
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (board[x][y].equals("X")) {
                                board[x][y] = "O";
                            } else if (board[x][y].equals("O")) {
                                board[x][y] = "X";
                            }
                        }
                    }
                    System.out.println("You lose lol take that. Eric made me do this");
                    human_win = false;
                    j_loss = true;
                } else {
                    System.out.println("You win!");
                    human_win = true;
                }
            } else if (board[0][0].equals(human) && board[1][1].equals(human) && board[2][2].equals(human)) {
                if (name.equals("Jocelyn")||name.equals("jocelyn")) {
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (board[x][y].equals("X")) {
                                board[x][y] = "O";
                            } else if (board[x][y].equals("O")) {
                                board[x][y] = "X";
                            }
                        }
                    }
                    System.out.println("You lose lol take that. Eric made me do this");
                    human_win = false;
                    j_loss = true;
                } else {
                    System.out.println("You win!");
                    human_win = true;
                }
            } else if (board[0][2].equals(human) && board[1][1].equals(human) && board[2][0].equals(human)) {
                if (name.equals("Jocelyn")||name.equals("jocelyn")) {
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (board[x][y].equals("X")) {
                                board[x][y] = "O";
                            } else if (board[x][y].equals("O")) {
                                board[x][y] = "X";
                            }
                        }
                    }
                    System.out.println("You lose lol take that. Eric made me do this");
                    human_win = false;
                    j_loss = true;
                } else {
                    System.out.println("You win!");
                    human_win = true;
                }
            } else if (board[0][0].equals(bot) && board[0][1].equals(bot) && board[0][2].equals(bot)) {
                System.out.println("The bot wins!");
                bot_win = true;
            } else if (board[1][0].equals(bot) && board[1][1].equals(bot) && board[1][2].equals(bot)) {
                System.out.println("The bot wins!");
                bot_win = true;
            } else if (board[2][0].equals(bot) && board[2][1].equals(bot) && board[2][2].equals(bot)) {
                System.out.println("The bot wins!");
                bot_win = true;
            } else if (board[0][0].equals(bot) && board[1][0].equals(bot) && board[2][0].equals(bot)) {
                System.out.println("The bot wins!");
                bot_win = true;
            } else if (board[0][1].equals(bot) && board[1][1].equals(bot) && board[2][1].equals(bot)) {
                System.out.println("The bot wins!");
                bot_win = true;
            } else if (board[0][2].equals(bot) && board[1][2].equals(bot) && board[2][2].equals(bot)) {
                System.out.println("The bot wins!");
                bot_win = true;
            } else if (board[0][0].equals(bot) && board[1][1].equals(bot) && board[2][2].equals(bot)) {
                System.out.println("The bot wins!");
                bot_win = true;
            } else if (board[0][2].equals(bot) && board[1][1].equals(bot) && board[2][0].equals(bot)) {
                System.out.println("The bot wins!");
                bot_win = true;
            } else if (!board[0][0].equals("-") && !board[0][1].equals("-") && !board[0][2].equals("-") && !board[1][0].equals("-") && !board[1][1].equals("-") && !board[1][2].equals("-") && !board[2][0].equals("-") && !board[2][1].equals("-") && !board[2][2].equals("-")) {
                System.out.println("It's a tie!");
                break;
            }//code that generated coordinates over and over -amazing-
        }
        if (bot_win == true) {
            System.out.println(board[0][0]+board[1][0]+board[2][0]);
            System.out.println(board[0][1]+board[1][1]+board[2][1]);
            System.out.println(board[0][2]+board[1][2]+board[2][2]);
        }
    }
}
