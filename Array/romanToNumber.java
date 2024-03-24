import java.util.HashMap;
import java.util.Scanner;

public class Solution{

 public int romanToNumber(String s){
	HashMap<Character, Integer> alpha = new HashMap<>();
	alpha.put('I', 1);
	alpha.put('V', 5);
	alpha.put('X',10);
	alpha.put('L',50);
	alpha.put('C', 100);
	alpha.put('D',500);
	alpha.put('M',1000);

	if(s.length() == 1)
		return alpha.get(s.charAt(0));

	int sum = 0;
	int count = 0;

	for(int i = 0; i<s.length() -1; i++){
		int next = alpha.get(s.charAt(i+1));
		int prev = alpha.get(s.charAt(i));
		
		if(prev < next){
			sum += next - prev;
			i++;
			count++;
		}else{
			sum += prev;
		}
		count++;
	}

	if(s.length() != count){
		int temp = s.length() - 1;
		sum += alpha.get(s.charAt(temp));
	}
	
	return sum;
  }
	
	public static void main(String[] args){
		Solution solution = new Solution();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter roman number : ");
		String input = scanner.nextLine();
		
		int result = solution.romanToNumber(input);
		System.out.println("Number : "+result);
		scanner.close();
	}
}