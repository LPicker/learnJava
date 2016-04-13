public class Chapter4 {
	public static void main(String[] args) {
		// 变量 cycle 为项目周期
		int cycle = 63;
		// remainDays 保存整除一周后，剩余的天数。
		int remainDays = cycle % 5;
		int result = (remainDays + 3) % 5;

		System.out.print("项目结束时是星期：");
		System.out.print(result);
	}
}