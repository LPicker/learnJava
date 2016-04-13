public class Filter {
	public static void main(String[] args) {
		String source = "天气太hot，食物都放坏了，我昨天就吃了一个坏的蛋黄派，"
+"真是Stupid啊，怎么能这么STUPID呢？";
		String word = "笨蛋,坏蛋,stupid";
		
		//将不文明词汇分隔为数组
		String words[] = word.toUpperCase().split(",");
		boolean isGood;
		int n = 0;

		do
		{
			isGood = true;
			for (int i=0; i<words.length; i++)
			{
				int inx = source.toUpperCase().indexOf(words[i]);
				if (inx!=-1)
				{
					source = source.substring(0, inx)
						   + "****"
						   + source.substring(inx+words[i].length());
					isGood = false;
					++n;
				}
			}
		}
		while (!isGood);
		System.out.println("找到了"+n+"个敏感词！");
		System.out.println(source);
	}
}