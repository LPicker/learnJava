public class CalcGrade{
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		String str_grades = input.nextLine();
		String grades[] = str_grades.split(" ");
		int total_score = 0;
		for(int i=0;i<grades.length;i++){
			// 强制转换为int
			total_score += Integer.parseInt(grades[i]);
		}
		double average = total_score/grades.length;
		System.out.print(total_score + " " + average);
	}
}