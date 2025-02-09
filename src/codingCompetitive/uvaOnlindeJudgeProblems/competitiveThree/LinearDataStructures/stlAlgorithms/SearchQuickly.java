package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.LinearDataStructures.stlAlgorithms;

import java.io.*;
import java.util.*;

class SearchQuickly {
    static InputReader reader;
    static OutputWriter writer;

    public static void main(String[] args) {
        reader = new InputReader(System.in);
        writer = new OutputWriter(System.out);
        TreeMap<String, ArrayList<String>> map = new TreeMap<>();
        TreeSet<String> set = new TreeSet<>();
        String s;
        while (!(s = reader.nextLine()).equals("::"))
            set.add(s.toLowerCase());
        while ((s = reader.nextLine()) != null) {
            s = s.toLowerCase();
            String[] words = s.split(" ");
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                if (set.contains(word)) continue;
                if (!map.containsKey(word)) map.put(word, new ArrayList<>());
                map.get(word).add(capitalize(words, i));
            }
        }
        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        for (String key: keyList) {
            ArrayList<String> titles = map.get(key);
            for (String title: titles) writer.println(title);
        }
        writer.flush();
    }

    static String capitalize(String[] words, int n) {
        StringBuilder sb = new StringBuilder();
        if (n == 0) sb.append(words[0].toUpperCase());
        else sb.append(words[0]);
        for (int i = 1; i < words.length; i++) {
            sb.append(" ");
            if (i == n) sb.append(words[i].toUpperCase());
            else sb.append(words[i]);
        }
        return sb.toString();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    return null;
                }
            }
            return tokenizer.nextToken();
        }
        public String nextLine(){
            if(tokenizer != null && tokenizer.hasMoreTokens()){
                StringBuilder sb = new StringBuilder(tokenizer.nextToken());
                while(tokenizer.hasMoreTokens()){
                    sb.append(" ").append(tokenizer.nextToken());
                }
                return sb.toString();
            }else{
                try {
                    return reader.readLine();
                }catch(Exception e){
                    return null;
                }
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

    static class OutputWriter {
        public BufferedWriter writer;
        OutputWriter(OutputStream stream) {
            writer = new BufferedWriter(new OutputStreamWriter(stream));
        }
        public void print(String string){
            try {
                writer.write(string, 0, string.length());
            }catch(Exception e){e.printStackTrace();}
        }
        public void print(char c){
            try {
                writer.write(c);
            }catch(Exception e){e.printStackTrace();}
        }
        public void print(String format, Object... args) {
            try {
                String string = String.format(format, args);
                writer.write(string, 0, string.length());
            }catch(Exception e){e.printStackTrace();}
        }
        public void print(int x){
            try {
                String string = String.format("%d", x);
                writer.write(string, 0, string.length());
            }catch(Exception e){e.printStackTrace();}
        }
        public void print(double x){
            try {
                int x_int = (int) (x * 100 + 1e-6); // add 1e-6 to avoid precision error when converting to int
                String string = String.format("%d.%02d", x_int/100, x_int%100);
                writer.write(string, 0, string.length());
            }catch(Exception e){e.printStackTrace();}
        }
        public void print(long x){
            try {
                String string = String.format("%d", x);
                writer.write(string, 0, string.length());
            }catch(Exception e){e.printStackTrace();}
        }
        public void println(String string){
            print(string);
            newline();
        }
        public void println(char c){
            print(c);
            newline();
        }
        public void println(String format, Object... args) {
            print(format, args);
            newline();
        }
        public void println(int x){
            print(x);
            newline();
        }
        public void println(long x){
            print(x);
            newline();
        }
        public void println(double x){
            print(x);
            newline();
        }
        public void println(){
            newline();
        }

        private void newline() {
            try {
                writer.newLine();
            }catch(Exception e){e.printStackTrace();}
        }
        private void flush(){
            try {
                writer.flush();
            }catch(Exception e){e.printStackTrace();}
        }
    }
}


