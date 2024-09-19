package codingCompetitive.algorithm.graph;

//https://cses.fi/problemset/task/1667/
import java.io.*;
import java.util.*;

public class MessageRoute {
    public static int maxN = 100001;
    static int n, m;
    static int[] points = new int[maxN];
    static int[] distance = new int[maxN];

    private static void run() throws IOException {
        Queue<Integer> pq = new LinkedList<>();
        n = in.nextInt();
        m = in.nextInt();
        Arrays.fill(distance, Integer.MAX_VALUE);
        List<Integer>[] graph = new ArrayList[maxN];
        for (int i = 0; i < maxN; ++i)
            graph[i] = new ArrayList();

        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            graph[x].add(y);
            graph[y].add(x);
        }
        pq.add(1);
        distance[1] = 0;
        while (!pq.isEmpty()) {
            int x = pq.poll();
            for (int y : graph[x]) {
                if (distance[y] == Integer.MAX_VALUE) {
                    distance[y] = distance[x] + 1;
                    points[y] = x;
                    pq.add(y);
                }
            }
        }
        out.println();
        if (distance[n] == Integer.MAX_VALUE) {
            System.out.println("IMPOSSIBLE");
        }
        else {
            int current_node = n;
            Stack<Integer> st = new Stack<>();
            while (current_node != 0) {
                st.push(current_node);
                current_node = points[current_node];
            }
            out.println(st.size());
            while (!st.isEmpty()) {
                out.print(st.peek() + " ");
                st.pop();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        in = new Reader();
        out = new PrintWriter(new OutputStreamWriter(System.out));
        run();
        out.flush();
        in.close();
        out.close();
    }

    private static Reader in;
    private static PrintWriter out;

    static class Reader {
        private static final int BUFFER_SIZE = 1 << 16;
        private final DataInputStream din;
        private final byte[] buffer;
        private int bufferPointer, bytesRead;

        Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            final byte[] buf = new byte[1024];
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        private static boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        public int skip() throws IOException {
            int b;
            while ((b = read()) != -1 && isSpaceChar(b)) {
                ;
            }
            return b;
        }

        public char nc() throws IOException {
            return (char) skip();
        }

        public String next() throws IOException {
            int b = skip();
            final StringBuilder sb = new StringBuilder();
            while (!isSpaceChar(b)) { // when nextLine, (isSpaceChar(b) && b != ' ')
                sb.appendCodePoint(b);
                b = read();
            }
            return sb.toString();
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            final boolean neg = c == '-';
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg) {
                return -ret;
            }
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            final boolean neg = c == '-';
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg) {
                return -ret;
            }
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            final boolean neg = c == '-';
            if (neg) {
                c = read();
            }

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg) {
                return -ret;
            }
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            din.close();
        }
    }
}
