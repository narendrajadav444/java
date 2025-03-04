class supclass{
	private int a = 50;
	class subclass{
		void show(){
			supclass obj = new supclass();
			System.out.println(obj.a);
		}
	}
}
class nestingCls{
	public static void main(String[] args){
		supclass obj = new supclass();
		supclass.subclass object = obj.new subclass();
		object.show();
	}
}