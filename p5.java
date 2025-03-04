class p5{
	public static void main(String[] args){
		int num = 1;
		int sum = 0;
		while(num <= 20){
			if(num % 2 ==0){
				sum += num;
				System.out.println(num + " sum is: " + sum);
			}
			num++;
		}
	}
}