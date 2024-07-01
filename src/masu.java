public class masu extends MyFrame{
	public void run() {
		CreateMeiro create=new CreateMeiro();
		addKeyListener(create);
		while(true) {
			while(true) {
				create.run(this);
				if(create.keyPressed(null)) {
					
				}
			}
		}
	}
}