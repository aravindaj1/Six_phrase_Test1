import java.util.*;
public class test4 {
    public static char[] check(int[] ip)
    {
        int N=ip.length;
        char[] op=new char[N];
        int[] sortin=Arrays.copyOf(ip,N);
        Arrays.sort(sortin);
        Map<Integer,Integer> index=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            index.put(sortin[i], i);
        }
        for(int i=0;i<N;i++)
        {
            int pos=index.get(ip[i]);
            op[i]=(char)('a'+pos);
        }
        return op;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] ip=new int[n];
        for(int i=0;i<n;i++)
        {
            ip[i]=in.nextInt();
        }
        char[] op= check(ip);
        System.out.println(Arrays.toString(op));
    }

}
