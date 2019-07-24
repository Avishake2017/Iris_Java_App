class StringDemo4{
	public static void main(String[] args){
		String s1 = "Ali-Al-Ali";
		String s2 = "Ahmed-Al-Ahmed";
		String s3 = s1.substring(7,10);
		System.out.println(s3);
		String s4 = s2.substring(9,14);
		System.out.println(s4);
		
		int index = s1.lastIndexOf('A');
		s1 = s1.replace(s2.substring(index,10),);
		System.out.println(s1);
	}
}