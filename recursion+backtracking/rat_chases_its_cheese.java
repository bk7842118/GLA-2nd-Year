package lec1;
import java.util.*;
public class rat_chases_its_cheese {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		char maze[][]=new char[m][n];
		for(int i=0;i<m;i++) {
			String s=sc.next();
			for(int j=0;j<n;j++) {
				maze[i][j]=s.charAt(j);
			}
			}
		int ans[][]=new int[m][n];
          rat_maze(maze,0,0,m,n,ans);
//          if(x==false) {
//          syso(path not found);
//          }
	}
	static boolean x=false;
	public static void rat_maze(char maze[][],int row,int col,int m,int n,int ans[][]) {
		if(row<0 || col<0  || row>=m || col >=n || maze[row][col]=='X') {
			return;
		}
		if(row==m-1 && col==n-1) {
			ans[row][col]=1;
			x=true;
			print(ans,m,n);
			return;
		}
		maze[row][col]='X';
		ans[row][col]=1;
		int r[]= {-1,0,0,1};
		int c[]= {0,-1,1,0};
//		 rat_maze(maze,row-1,col,m,n,ans);
//		 rat_maze(maze,row+1,col,m,n,ans);
//		 rat_maze(maze,row,col+1,m,n,ans);
//		 rat_maze(maze,row,col-1,m,n,ans);
		for(int i=0;i<c.length;i++) {
			rat_maze(maze,row+r[i],col+c[i],m,n,ans);
		}
		 maze[row][col]='O';
		 ans[row][col]=0;
	}
	public static void print(int ans[][],int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}
