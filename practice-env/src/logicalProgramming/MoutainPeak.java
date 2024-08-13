package logicalProgramming;
import java.util.List;
import  java.util.ArrayList;

public class MoutainPeak {
    public List<Integer> findPeaks(int[] mountain) {

        List<Integer> result = new ArrayList<>();

        for(int i = 1; i<mountain.length-1; i++){
            int peak = mountain[i];
            if(mountain[i-1] < peak && peak > mountain[i+1])
                result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        
    }
}
