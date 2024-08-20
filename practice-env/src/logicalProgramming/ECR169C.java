package logicalProgramming;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ECR169C {
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low , int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i <= j)
        {
            if(pivot >= arr[i])
                i++;
            else if(pivot < arr[j])
                j--;
            else
                swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }

    public static void quickSort(int[] input, int startIndex, int endIndex) {
        // your code goes here
        if(startIndex >= endIndex)
            return;
        int pi = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, pi - 1);
        quickSort(input, pi+1, endIndex);
    }

    public static  void solve (Reader sc) throws  IOException{
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int arrLen = arr.length;
        // sort arr
        quickSort(arr,0,arrLen-1);

        if(arrLen%2 > 0){
            int firstPointer = arrLen-1;
            int secondPointer = arrLen-2;
            long score = 0L;
            for(int i = arrLen-1; i>=0; i--){
                if(firstPointer < arrLen){
                    firstPointer += arr[firstPointer];
                }

                if
            }
        }else{

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
