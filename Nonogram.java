public class Nonogram {

  // intputs:
  //  print: UnitTest()
  //  run:  run_game()
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.err.println("no input given!");
    }
    else switch (argv[0]) {
    case "print":
      UnitTest();
      break;
    case "run":
      run_game();
      break;
    default:
      System.err.println(argv[0]);
    }
  }

  public static char[][] board = {
      {'_', '_', '#', '_', '#'},
      {'#', '#', '#', '#', '_'},
      {'_', '#', '#', '#', '#'},
      {'#', '_', '_', '_', '#'},
      {'_', '_', '_', '_', '#'}
  };
  static int bNums[][] = {
    // Col Nums
    {1, 1, -1, -1, -1},
    {2, -1, -1, -1, -1},
    {3, -1, -1, -1, -1},
    {2, -1, -1, -1, -1},
    {1, 3, -1, -1, -1},

    // Row Nums
     {1, 1, -1, -1, -1},
    {4, -1, -1, -1, -1},
    {4, -1, -1, -1, -1},
    {1, 1, -1, -1, -1},
    {1, -1, -1, -1, -1},
  };

  // Parfait
  static char[][] get_board() {
    return null;
  }

  // Zac
  static int[][] get_numbers(char[][] board) {
    return null;
  }


  // John
  static void run_game() {
    System.out.println("Running game...");
  }


  // Adam
  static void print_board(char[][] board, int[][] numbers) {
      // Leave board a 5x5
      int rLen = (int)board[0].length;
      char rowCords[] = new char[] {'A', 'B', 'C', 'D', 'E'};

      // Print col nums
      for(int i = 0; i < (rLen/2) ; i++)
      {
          System.out.print("\n       ");
          int j = 0;
          while(j < rLen)
          {
              if(numbers[j][i] == -1)
              {
                  System.out.print("  ");
              }

              else {
                  System.out.print(numbers[j][i] + " ");
              }

              j++;
          }
      }
      System.out.print("\n");


      // Print Row nums and board
      for(int i = 0; i < board[0].length; i++)
      {
          String row = "";
          for(int a = 0; a < rLen; a++)
          {
              if(numbers[i][a] == -1)
              {
                  a = rLen;
              }

              else {
                  row += (Integer.toString(numbers[i][a]) + " ");
              }
          }

          System.out.printf("%6s ", row);

          for(int j = 0; j < board[i].length; j++)
          {
              System.out.print(board[i][j] + " ");
          }

          System.out.print(rowCords[i] + "\n");

      }

      // Print Col Cords
      System.out.print("       ");
      for(int i = 1; i < 6; i++)
      {
          System.out.print(i + " ");
      }
      System.out.print("\n");
  }

  static void UnitTest()
  {
      // Print Board Unit Test
      System.out.print("\n~Unit Test 0: Print Board~");
      print_board(board, bNums);

      // Add your units tests below:
  }

}
