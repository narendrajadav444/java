class semone{
	void check(){
		System.out.println("Sem One");
	}
}
class semtwo extends semone{
	void check(){
		System.out.println("Sem Two");
	}
}
class user{
	public static void main(String[] args){
		semtwo semtwo = new semtwo();
		semtwo.check();
	}
}