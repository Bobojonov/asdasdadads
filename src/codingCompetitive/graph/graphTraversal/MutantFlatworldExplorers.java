package codingCompetitive.graph.graphTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class MutantFlatworldExplorers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] orientation = {'N', 'S', 'E', 'W'};
        int[] xCoordinate = {0, 1, 0, -1};
        int[] yCoordinate = {1, 0, -1, 0};
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int xSize = Integer.parseInt(st.nextToken());
        int ySize =  Integer.parseInt(st.nextToken());
        Vector<Vector<Boolean>> vc = new Vector<>();
        while (true) {
            s = br.readLine();
            if (s == null || s.equals("")) break;
            st = new StringTokenizer(s);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            char startDirection = st.nextToken().charAt(0);
            String orders = br.readLine();
            int direction = 0;
            for (int i = 0; i < 4; i++)
                if (startDirection == orientation[i])
                    direction = i;
            boolean f = false;
            for (int i = 0; i < orders.length(); i++) {
                if (orders.charAt(i) == 'R')
                    direction = (direction + 1) % 4;
                else if (orders.charAt(i) == 'L')
                    direction = (direction + 3) % 4;
                else {
                    if (x + xCoordinate[i] == -1 || x + xCoordinate[direction] == xSize + 1 ||
                            y + yCoordinate[direction] == -1 || y + yCoordinate[i] == ySize + 1) {
                        if (!vc.get(x).get(y)) {
                            vc.get(y).set(x, true);
                            f = true;
                            break;
                        }
                    }
                    else {
                        x += xCoordinate[direction];
                        y += yCoordinate[direction];
                    }
                }
            }
            if (f)
                System.out.println(x + " " + y + " " + orientation[direction] + " LOST");
            else
                System.out.println(x + " " + y + " " + orientation[direction]);
        }
    }
}
