package introToIce;

import java.util.Scanner;

public class scripting {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter: ");
		String a = kb.nextLine();
		String b = "";
		String c = "";
		int n=0,m=0,p=1;
		for (int i=0; i<a.length(); i++){
			if(a.charAt(i)==','){
				b = b + a.substring(n,i)+" ";
				if(a.charAt(i+1)==' '){
					n=i+2;
				} else {
					n=i+1;
				}
			}
		}
		b = b + a.substring(n);
		for(int i=0; i<b.length(); i++){
			if(b.charAt(i)=='a'){
				c = c + b.substring(m,i);
				m=i+1;
			}
		}
		c = c + b.substring(m);
		String d = c.substring(0,1).toUpperCase();
		String e = "";
		for (int i=1; i<c.length(); i++){
			if(c.charAt(i)==' '){
				d = d + c.substring(p,i+1);
				e = c.substring(i+1,i+2).toUpperCase();
				d = d + e;
				p = i+2;
			}
		}
		d = d + c.substring(p);
		System.out.println(d);
	}
}