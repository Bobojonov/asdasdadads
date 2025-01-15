package codingCompetitive.advanceOfCode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AOCTasks {
    private int part = 1;
    private long timerStart;

    public AOCTasks(String day) {

        File file = new File("res/day" + day + ".txt");
        if (!file.exists()) {
            timerStart = System.nanoTime();
            solve(new ArrayList<>());
            return;
        }

        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.err.println("File no found");
            timerStart = System.nanoTime();
            solve(new ArrayList<>());
            return;
        }
        List<String> inputLines = new ArrayList<>();
        try {
            String line;
            while ((line = br.readLine()) != null)
                inputLines.add(line);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        timerStart = System.nanoTime();
        solve(inputLines);
    }

    abstract void solve(List<String> input);
    public void lap(int answer) {
        lap(String.valueOf(answer));
    }

    public void lap(long answer) {
        lap(String.valueOf(answer));
    }
    public void lap(String answer) {
        long timeSpent = (System.nanoTime() - timerStart) / 1000;
        System.out.println("Part " + part + ": " + answer + ", Duration: " + timeToString(timeSpent));
        timerStart = System.nanoTime();
        part++;
    }
    public String timeToString(long timeSpent)
    {
        if(timeSpent < 1000)
            return timeSpent + "µs";
        if(timeSpent < 1000000)
            return (timeSpent / 1000.0) + "ms";
        return (timeSpent / 1000000.0) + "s";
    }

    public List<Integer> convertToInts(List<String> input)
    {
        List<Integer> ints = new ArrayList<>();
        for(String s : input)
            ints.add(Integer.parseInt(s));
        return ints;
    }

    public List<Long> convertToLongs(List<String> input)
    {
        List<Long> ints = new ArrayList<>();
        for(String s : input)
            ints.add(Long.parseLong(s));
        return ints;
    }
}
