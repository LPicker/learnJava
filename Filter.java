public class Filter {
	public static void main(String[] args) {
		String source = "����̫hot��ʳ�ﶼ�Ż��ˣ�������ͳ���һ�����ĵ����ɣ�"
+"����Stupid������ô����ôSTUPID�أ�";
		String word = "����,����,stupid";
		
		//���������ʻ�ָ�Ϊ����
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
		System.out.println("�ҵ���"+n+"�����дʣ�");
		System.out.println(source);
	}
}