//Pornkanok Ketmalasiri 5631288521
//Benya Vachalathiti 5631271821
package intro;
public class Script {
		public static void main (String [] args){
			String a = "Hi, my name, is Pac.";
			String b="";
			int temp=0;
			
//cut out comma
			
		for (int i=0; i<a.length();i++){
			if (a.charAt(i)==','){
					b = b + a.substring(temp, i);
					temp=i+1; 
			}
		}

		b=b+a.substring(a.lastIndexOf(",")+1,a.length());
			System.out.println(b);
	
// cut out a		
			temp=0;
			a=b;
			b="";
			
			for (int i=0; i<a.length();i++){
				if (a.charAt(i)=='a'){
						b = b + a.substring(temp, i);
						temp=i+1; 
				}
			}
			b=b+a.substring(a.lastIndexOf("a")+1,a.length());
				System.out.println(b);

// make capital
			temp=-1;
			a=b;
			b="";
			String c;
			String d;
			String f="";
			String fin="";
			for (int i=0; i<a.length(); i++){
				if (a.charAt(i)==' '){
					
					c=a.substring(temp+1,i);
					b=a.substring(i,a.length());
					d=c.substring(0,1).toUpperCase()+c.substring(1,c.length());
					fin=fin+d+" ";
					temp=i;	
				}
			}
			fin=fin+a.substring(a.lastIndexOf(' ')+1,a.length());
			System.out.println(fin);
	}
}
