package logicalProgramming;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class ECR169B {

    public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        // Removing duplicates from the first array
        for (int num : arr1) {
            set.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Avoiding duplicates and adding intersections
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num);
            }
        }

        return result;
    }

    public static void solve(Reader sc) throws IOException {
        int l, r, L, R;
        l = sc.nextInt();
        r = sc.nextInt();
        L = sc.nextInt();
        R = sc.nextInt();

        int [] segementA = new int[r-l+1];
        for (int i = 0; i<segementA.length; i++){
            segementA[i] = l+i;
        }
        int [] segementB = new int[R-L+1];
        for (int i = 0; i<segementB.length; i++){
            segementB[i] = L+i;
        }

        ArrayList<Integer> intersection = findIntersection(segementA, segementB);

//        for (Integer integer : intersection) {
//            System.out.print(integer+" ");
//        }

        int countEdge = 0;

        if(!intersection.isEmpty()){
            for(int numA : segementA){
                if(numA == intersection.get(0)-1)
                    countEdge++;
                if(numA == intersection.get(intersection.size()-1)+1)
                    countEdge++;
            }

            for(int numA : segementB){
                if(numA == intersection.get(0)-1)
                    countEdge++;
                if(numA == intersection.get(intersection.size()-1)+1)
                    countEdge++;
            }
        }
        if(intersection.isEmpty()){
            System.out.println(1);
        }else{
            System.out.println(intersection.size()-1+countEdge);
        }

    }

    public static void main(String[] args) throws IOException {
        Reader sc = new Reader();
        int testCase = sc.nextInt();
        while (testCase-- > 0){
            solve(sc);
        }
        sc.close();
    }
    // Reader class for efficient input reading
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    } else {
                        continue;
                    }
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }
}
