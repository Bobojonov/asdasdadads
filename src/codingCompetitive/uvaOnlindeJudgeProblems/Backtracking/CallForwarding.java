package codingCompetitive.uvaOnlindeJudgeProblems.Backtracking;//package codingCompetitive.uvaOnlindeJudgeProblems.Backtracking;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class CallForwarding {
//    static HashMap<String , Vector<CallForward> > data;
//
//
//    static class CallForward {
//        String target;
//        int start;
//        int end;
//
//        public CallForward(String target, int start, int end) {
//            super();
//            this.target = target;
//            this.start = start;
//            this.end = end;
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        System.out.println("CALL FORWARDING OUTPUT");
//        int cases = 1;
//        while (n --> 0) {
//            data = new HashMap<>();
//            System.out.println("SYSTEM " + cases++);
//
//            while (true) {
//                String str = br.readLine();
//                if (str.equals("0000")) break;
//                StringTokenizer st = new StringTokenizer(str);
//                String source = st.nextToken();
//                int start = Integer.parseInt(st.nextToken());
//                int d = Integer.parseInt(st.nextToken());
//                String target = st.nextToken();
//                CallForward call = new CallForward(target, start, start + d);
//                Vector<CallForward> vc = new Vector<>();
//                vc.add(call);
//                data.put(source, vc);
//                while (true) {
//                    str = br.readLine();
//                    if (str.equals("9000")) break;
//                    st = new StringTokenizer(str);
//                    start = Integer.parseInt(st.nextToken());
//                    target = st.nextToken();
//
//                }
//            }
//
//        }
//
//    }
//
//    public static String callTo(HashMap<String, Vector<CallForward>> data, String target, int time) {
//        HashMap<String, Boolean> called = new HashMap<>();
//        called.put(target, true);
//
//        while (true) {
////            if (data.containsKey())
//        }
//
//        return "";
//    }
//}
