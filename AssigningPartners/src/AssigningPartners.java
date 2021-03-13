import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AssigningPartners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] first=sc.nextLine().split(" ");
		List<String> l1=Arrays.asList(first);
		String[] second=sc.nextLine().split(" ");
		List<String> l2=Arrays.asList(second);
		for(int i=0;i<n;i++) {
			String a=l1.get(i);
			String b=l2.get(i);
			int idx1=l2.indexOf(a);
			int idx2=l1.indexOf(b);
			if(idx1!=idx2) {
				System.out.println("bad");
				return;
			}
			
		}
		System.out.println("good");

	}

}
