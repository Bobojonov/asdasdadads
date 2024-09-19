package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RequestForProposal {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = 1;
        String str;
        while (true) {
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int n = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            if (n == 0 && p == 0) break;
            for (int i = 0; i < n; i++) br.readLine();
            String car_name = "";
            int selectedCar = 0;
            double selected_price = 0.0;
            for (int i = 0; i < p; i++) {
                String curr_name = br.readLine();
                st = new StringTokenizer(br.readLine());
                double curr_price = Double.parseDouble(st.nextToken());
                int curr_count = Integer.parseInt(st.nextToken());
                for (int j = 0; j < curr_count; j++) br.readLine();
                if (curr_count > selectedCar || (curr_count == selectedCar && selected_price > curr_price)) {
                    car_name = curr_name;
                    selectedCar = curr_count;
                    selected_price = curr_price;
                }
            }
            if (cases > 1) System.out.println();
            System.out.println("RFP #" + cases++ + "\n" + car_name);
        }
    }
}
