//@author: Tanveer Ahmad Baba
//@created: 02/07/2018
//@subject: Custom Split method >> Splits the gived string by specified delimeter.

import java.util.Scanner;

class Split {

	String s;
	String d;

	Split() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		s = scan.nextLine();
		System.out.println("Enter the Delimeter: ");
		d = scan.nextLine();
	}

	String [] mySplit() {
		String []strarr = new String[s.length()];
		int k = 0, i = 0;
		for( ; i < s.length(); i++) {
			try {
				if(d.equals(s.substring(i,(i+d.length())))) {
					strarr[k] = s.substring(0,i);
					s = s.substring(i+d.length());
					i = -1;
					k++;
				}
			}
			catch(StringIndexOutOfBoundsException oe) {
				continue;
			}
		}
		strarr[k] = s.substring(0,i);
		return strarr;
	}

	/*void inBuildSplit() {

		String []a = s.split(d);

		for(String str : a) {
			System.out.println(str);
		}
	}*/

	void splittedOutput(String []strarr) {
		for(String s : strarr) {
			if(s == null)
				continue;
			System.out.println(s);
		}
	}

	public static void main(String []args) {

		Split ref = new Split();

		String []strarr = ref.mySplit();

		ref.splittedOutput(strarr);

		//ref.inBuildSplit();

	}
}