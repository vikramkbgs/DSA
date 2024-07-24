Class ThirdMax {
	public int thirdMax(int[] nums){
		long mx1 = Long.MIN_VALUE, mx2 = Long.MIN_VALUE, mx3 = Long.MIN_VALUE;

		for(int num : nums){
			if(num == mx1 || num == mx2 || num == mx3){
				continue;
			}
			if (num > max1){
				mx3 = mx2;
				mx2 = mx1;
				mx1 = num;
			}else if (num > mx2){
				mx3  = mx2;
				mx2 = num;
			}else if(num > mx3){
				mx3 = num;
			}
		}
		return  (mx3 == Long.MIN_VALUE) ? (int) mx1 : (int) mx3;
	}

	public static void main(String [] args){
		// setup test
	}

}
