import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] s={in.nextLine(),in.nextLine(),in.nextLine()};
        String[] fnt=new String[3];
        String[] mid=new String[3];
        String[] end=new String[3];
        for (int i = 0; i < 3; i++) {
            int n=s[i].length();
            switch (n%3)
            {
                case 0:
                    fnt[i]=s[i].substring(0,n/3);
                    mid[i]=s[i].substring(n/3,2*(n/3));
                    end[i]=s[i].substring(2*(n/3),n);
                    break;
                case 1:
                    fnt[i]=s[i].substring(0,n/3);
                    mid[i]=s[i].substring(n/3,2*(n/3)+1);
                    end[i]= s[i].substring(2*(n/3)+1,n);
                    break;
                case 2:
                    fnt[i]=s[i].substring(0,n/3+1);
                    mid[i]=s[i].substring(n/3+1,2*(n/3)+1);
                    end[i]=s[i].substring(2*(n/3)+1,n);
                    break;
            }
        }
        String out1=fnt[0]+mid[1]+end[2];
        String out2=mid[0]+end[1]+fnt[2];
        String out3=end[0]+fnt[1]+mid[2];
        String s1 = "";
        for (int i = 0; i < out3.length(); i++) {
            if (Character.isUpperCase(out3.charAt(i)))
                s1 = s1 + Character.toLowerCase(out3.charAt(i));
            else
                s1 = s1 + Character.toUpperCase(out3.charAt(i));
        }
        out3=s1;
        System.out.println("Output1 :"+out1+"\nOutput2 :"+out2+"\nOutput3 :"+out3);
    }
}
