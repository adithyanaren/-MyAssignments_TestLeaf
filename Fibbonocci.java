package week1.day1;

public class Fibbonocci {

	public static void main(String[] args) {
		
		int firstnum = 0, secNum = 1, sum = 0;
		System.out.println(firstnum+" "+secNum);
		for (int i = 2; i < 11 ; i++){
		sum = firstnum+secNum;
		System.out.print(" "+ sum + " " );
		firstnum=secNum;
		secNum=sum;
		}
	}

}
