public class masu extends MyFrame{
	static boolean isSpace=false;
	public void run(){
		CreateMeiro create=new CreateMeiro();
		addKeyListener(create);
		while(true) {
			create.run(this);
			isSpace=false;
			while(true) {
				if(isSpace) {
					break;
				}
				sleep(0.1);
			}
		}
	}
}