import java.util.*;

import javax.lang.model.util.ElementScanner14;

class vow{
    static void checkstring(String s){
        int lv=0,uv=0,lc=0,uc=0,sp=0,special=0,d=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u')
                lv++;
            else if(c=='A' || c=='E'|| c=='I'|| c=='O'|| c=='U')
                uv++;
            else if(c>='a' && c<='z')
                lc++;
            else if(c>='A' && c<='Z')
                uc++;
            else if(c>='0' && c<='9')
                d++;
            else if(c==' ')
                sp++;
            else
                special++;
            
        }
        System.out.println("Lower Voweols : "+lv+"\n"+
        "Upper Voweols : "+uv+"\n"+
        "Lower Consonants : "+lc+"\n"+
        "Upper  Consonants : "+uc+"\n"+
        "Digits: "+d+"\n"+
        "Spaces : "+sp+"\n"+
        "Special chars : "+special+"\n");
    }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
        checkstring(a);
    }
}