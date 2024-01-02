import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner jake = new Scanner(System.in);
        int count = 0;
        String [][] board;
        board = new String [3][3];
        System.out.println("Choose X or O");
        String human = jake.nextLine();
        String bot = "hi";
        boolean human_win = false;
        boolean bot_win = false;
        board[0][0] = "-";
        board[0][1] = "-";
        board[0][2] = "-";
        board[1][0] = "-";
        board[1][1] = "-";
        board[1][2] = "-";
        board[2][0] = "-";
        board[2][1] = "-";
        board[2][2] = "-";
        while (human_win != true && bot_win != true) {
            count = 0;
            for (int p = 3; p > 0; p--) {
                System.out.println();
                for (int i = 0; i < 3; i++) {
                    count++;
                    if (count == 1) {
                        if (board[0][0].equals("X")) {
                            System.out.print("X");
                        } else if (board[0][0].equals("O")) {
                            System.out.print("O");
                        } else {
                            System.out.print("-");
                        }
                    } else if (count == 2) {
                        if (board[1][0].equals("X")) {
                            System.out.print("X");
                        } else if (board[1][0].equals("O")) {
                            System.out.print("O");
                        } else {
                            System.out.print("-");
                        }
                    } else if (count == 3) {
                        if (board[2][0].equals("X")) {
                            System.out.print("X");
                        } else if (board[2][0].equals("O")) {
                            System.out.print("O");
                        } else {
                            System.out.print("-");
                        }
                    } else if (count == 4) {
                        if (board[0][1].equals("X")) {
                            System.out.print("X");
                        } else if (board[0][1].equals("O")) {
                            System.out.print("O");
                        } else {
                            System.out.print("-");
                        }
                    } else if (count == 5) {
                        if (board[1][1].equals("X")) {
                            System.out.print("X");
                        } else if (board[1][1].equals("O")) {
                            System.out.print("O");
                        } else {
                            System.out.print("-");
                        }
                    } else if (count == 6) {
                        if (board[2][1].equals("X")) {
                            System.out.print("X");
                        } else if (board[2][1].equals("O")) {
                            System.out.print("O");
                        } else {
                            System.out.print("-");
                        }
                    } else if (count == 7) {
                        if (board[2][0].equals("X")) {
                            System.out.print("X");
                        } else if (board[2][0].equals("O")) {
                            System.out.print("O");
                        } else {
                            System.out.print("-");
                        }
                    } else if (count == 8) {
                        if (board[1][2].equals("X")) {
                            System.out.print("X");
                        } else if (board[1][2].equals("O")) {
                            System.out.print("O");
                        } else {
                            System.out.print("-");
                        }
                    } else if (count == 9) {
                        if (board[2][2].equals("X")) {
                            System.out.print("X");
                        } else if (board[2][2].equals("O")) {
                            System.out.print("O");
                        } else {
                            System.out.print("-");
                        }
                    }
                }
            }
            System.out.println();
            System.out.println("Enter the row (1,2,or 3)");
            int row = (jake.nextInt() - 1);
            System.out.println("Enter the column (1,2,or 3)");
            int column = (jake.nextInt() - 1);
            board[column][row] = human;
            int bot_row = (int) (Math.random() * 3);
            int bot_column = (int) (Math.random() * 3);
            if (human.equals("X")) {
                bot = "O";
                board[bot_column][bot_row] = bot;
            } else {
                if (human.equals("O")) {
                    bot = "X";
                }
                board[bot_column][bot_row] = bot;
            }
            } if (board[0][0] == human && board[0][1] == human && board[0][2] == human) {
                System.out.println("You win!");
                human_win = true;
            } if (board[1][0] == human && board[1][1] == human && board[1][2] == human) {
                System.out.println("You win");
                human_win = true;
            } if (board[2][0] == human && board[2][1] == human && board[2][2] == human) {
                System.out.println("You win");
                human_win = true;
            } if (board[0][0] == human && board[1][0] == human && board[2][0] == human) {
                System.out.println("You win");
                human_win = true;
            } if (board[0][1] == human && board[1][1] == human && board[2][1] == human) {
                System.out.println("You win");
                human_win = true;
            } if (board[0][2] == human && board[1][2] == human && board[2][2] == human) {
                System.out.println("You win");
                human_win = true;
            } if (board[0][0] == human && board[1][1] == human && board[2][2] == human) {
                System.out.println("You win");
                human_win = true;
            } if (board[0][2] == human && board[1][1] == human && board[2][0] == human) {
                System.out.println("You win");
                human_win = true;
            } if (board[0][0] == bot && board[0][1] == bot && board[0][2] == bot) {
                System.out.println("The bot wins!");
                bot_win = true;
            } if (board[1][0] == bot && board[1][1] == bot && board[1][2] == bot) {
                System.out.println("The bot wins!");
                bot_win = true;
            } if (board[2][0] == bot && board[2][1] == bot && board[2][2] == bot) {
                System.out.println("The bot wins!");
                bot_win = true;
            } if (board[0][0] == bot && board[1][0] == bot && board[2][0] == bot) {
                System.out.println("The bot wins!");
                bot_win = true;
            } if (board[0][1] == bot && board[1][1] == bot && board[2][1] == bot) {
                System.out.println("The bot wins!");
                bot_win = true;
            } if (board[0][2] == bot && board[1][2] == bot && board[2][2] == bot) {
                System.out.println("The bot wins!");
                bot_win = true;
            } if (board[0][0] == bot && board[1][1] == bot && board[2][2] == bot) {
                System.out.println("The bot wins!");
                bot_win = true;
            } if (board[0][2] == bot && board[1][1] == bot && board[2][0] == bot) {
                System.out.println("The bot wins!");
                bot_win = true;
            }
        }
    }