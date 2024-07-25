import java.util.*;

public class test3 {
    static String[] ans(String[] arr)
    {
        String[] out=new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String an="";
            int num=Integer.parseInt(arr[i]);
            int n=arr[i].length();
            if(n==6)
                an+="C";
            else
                an+="W";
            if(isprime(num))
                an+="P";
            else
                an+="N";
            int ans=0,n1=num;;
            do {
                ans=0;
                do {
                    int rev = n1 % 10;
                    ans += rev;
                    n1 /= 10;
                }while (n1>0);
                n1=ans;
            } while (ans >=10);
            an+=ans;
            an+=num/2;
            out[i]=an;
        }
        return out;
    }
    static boolean isprime(int n)
    {
        if(n==1 || n==0)
            return false;
        for (int i=2;i<n/2+1;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String[] arr=new String[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.next();
        }
        String[] out=ans(arr);
        System.out.println(Arrays.stream(out).toList());
    }
}