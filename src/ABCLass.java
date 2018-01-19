import java.util.Scanner;

public class ABCLass {
	public static void main(String[] args) {
		String[] Sound={"eeeehk!","eeeehk?","ehhhk","ekhhh"};
		String[] Meaning={"hello","are you sure?","there","fish"};
		String output="";
		System.out.println("Enter the Sound!");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String result="";
		
	
			 result = input.replaceAll("[\\@\\#\\$\\%\\^\\&\\*\\-\\_\\+\\=\\;\\'\\,\\.]","");
	
		String[] splited = result.split("\\s+");
		
		
		for (String sp: splited) {
			for(int j=0;j<Sound.length;j++) {
				if(sp.equals(Sound[j])) {	
					output=output.concat(Meaning[j]);
					
				}
			}
			
		}
		System.out.println(output);
		
		
	}
	
	

	
}


