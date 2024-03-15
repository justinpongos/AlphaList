import javax.swing.JOptionPane;

public class Alphalist {
	public static void main(String[] args) {
		
		int rows = Integer.parseInt(JOptionPane.showInputDialog("How many rows?"));
		int cols = Integer.parseInt(JOptionPane.showInputDialog("How many cols?"));
			String[][] grid = new String[rows][cols];
			String list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			int ooo = 0;
			
			for(int row = 0; row < grid.length; row ++) {
				for(int col = 0; col < grid[0].length; col ++) {
					grid[row][col] = list.substring(ooo, ooo+1);
					ooo++;
					System.out.print(grid[row][col] +  " ");		
					if(ooo >= 26) {
						ooo = 0;
					}//end if
				}//end for
				System.out.print("\n");
			}//end for
		}//end main
	}//end class