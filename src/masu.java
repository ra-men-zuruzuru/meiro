
public class masu extends MyFrame{
	static int path=0;
	static int wall=1;
	int height=15;
	int wigth=15;
	
	public void run() {
		int [][] maze=pw(height,wigth);
		for(int i=0;i<height;i++) {
			for(int j=0;j<wigth;j++) {
				if(maze[i][j]==wall) {
					fillRect(100+i*15,100+j*15,15,15);
					
				}else {
					
				}
			}
		}
	}
	
	public static int[][] pw(int x,int y){
		int[][]maze=new int [15][15];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				if(i==0 ||i==x-1 ||j==0 ||j==y-1) {
					maze[i][j]=wall;
				}
				else {
					maze[i][j]=path;
				}
			}
		}
		return maze;
	}
	
}