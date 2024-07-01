public class masu extends MyFrame{
	boolean isSpace=false;
	public void run(){
		CreateMeiro create=new CreateMeiro();
		System.out.println("a");
		while(true) {
			create.run(this);
		}
	}
}