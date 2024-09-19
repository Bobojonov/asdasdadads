package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class validStartingCity {

    public static int validStartingCity(int[] distances, int[] fuel, int mpg) {
        int cities = distances.length;
        int milesRemaining = 0;
        int idxStartingCity = 0;
        int milesRemainingStarting = 0;
        for (int start = 1; start < cities; start++) {
            int disFromPreviousCity = distances[start - 1];
            int fuelFromPreviousCity = fuel[start - 1];
            milesRemaining += fuelFromPreviousCity * mpg - disFromPreviousCity;
            if (milesRemaining < milesRemainingStarting){
                milesRemainingStarting = milesRemaining;
                idxStartingCity = start;
            }
        }
        return idxStartingCity;
    }

    public static void main(String[] args) {
        int[] distances = {5, 25, 15, 10, 15};
        int[] fuel = {1, 2, 1, 0, 3};
        int mpg = 10;
        System.out.println(validStartingCity(distances, fuel, mpg));
    }
}
