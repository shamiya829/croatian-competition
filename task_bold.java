import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    String input = k.nextLine();
    int row = Integer.parseInt(input.split(" ")[0]);
    int col = Integer.parseInt(input.split(" ")[1]);
    char in[][] = new char[row][col];
    char out[][] = new char[row][col];
      String s;
    for (int i = 0; i < row; i++)
    {
 s = k.nextLine();
      for (int j = 0; j < col; j++) {
        in[i][j] = s.charAt(j);
        out[i][j] = '.';
      }
    }
   

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (in[i][j] == '#') {
          out[i][j] = '#';
        }
        if (j + 1 < col && in[i][j] == '#') {
          out[i][j + 1] = '#';
        }

        if (i + 1 < row && in[i][j] == '#') {
          out[i + 1][j] = '#';
        }

        if (i + 1 < row && j + 1 < col && in[i][j] == '#') {
          out[i + 1][j + 1] = '#';
        }

      }
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++)
        System.out.print(out[i][j]);

      System.out.println();

    }

  }
}
