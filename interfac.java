interface room1{
	int a = 50;
	void fen1();
	void fen2();
}
interface room2{
	void fen3();
	void fen4();
}
class semtwo implements room1, room2{
	public void fen1(){
		System.out.println("Red");
	}
	public void fen2(){
		System.out.println("Green");
	}
	public void fen3(){
		System.out.println("Yellow");
	}
	public void fen4(){
		System.out.println("Blue");
	}
}
class interfac{
	public static void main(String[] args){
		semtwo semtwo = new semtwo();
		System.out.println(semtwo.a);
		
		semtwo.fen1();
		semtwo.fen2();
		semtwo.fen3();
		semtwo.fen4();
	}
}