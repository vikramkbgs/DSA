package logicalProgramming;

public class DayHours {

    public int countCompleteDayPairs(int[] hours) {

        int  n = hours.length - 1;
        int result = 0;

        for(int i = 0; i<=n-1; i++){

            int temp = hours[i];

            for(int j = i+1; j <= n; j++){


                if((temp + hours[j]) % 24 == 0){
                    result++;
                    System.out.println(temp+" "+hours[j]);
                }


            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
