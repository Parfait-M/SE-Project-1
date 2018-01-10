

public class Nonogram {

  public static char[][] b = {
    {'_', '_', '#', '_', '#'},
    {'#', '#', '#', '#', '_'},
    {'_', '#', '#', '#', '#'},
    {'#', '_', '_', '_', '#'},
    {'_', '_', '_', '_', '#'}
  };

  public static void print_board(char[][] b) {
    for (char[] bl : b) {
      System.out.printf("%s %s %s %s %s",bl[0],bl[1],bl[2],bl[3],bl[4])
    }
  }

  public static void main(String[] argv) {

  }

}
