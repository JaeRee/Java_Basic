package Plane;

public abstract class Airline {
	int iRow;
	char chCol;
	boolean[][] isArrSeat = new boolean[30][6];
	
	public abstract void printWelcom();
	
	public void reserveSeat(int row, char col) {
		iRow = row;
		chCol = col;
		
		if (isArrSeat[iRow][chCol-65]) { 
			System.out.println("이미 예약된 자리입니다.");
		} else {
			isArrSeat[iRow][chCol-65]= true;
			System.out.println((iRow+1) + "" + chCol + "으로 예약 되었습니다.");
		}
	}
	
	public void checkSeat() {
		System.out.println("\tA B C \tD E F");
		for (int i = 0; i < isArrSeat.length; i++) {
			System.out.print(i+1 + "\t");
			for (int j = 0; j < isArrSeat[i].length; j++) {
				if (isArrSeat[i][j])
					System.out.print("1 ");
				else
					System.out.print("0 ");
				if(j==2) {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}

