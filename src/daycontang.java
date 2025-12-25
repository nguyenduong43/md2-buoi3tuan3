import java.util.Scanner;
public class daycontang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap 1 chuoi ti tu ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int d = 0;
        int i = 0;String s2="";
    while (i < arr.length-d)
    {
        int d1=1;
        char c=arr[i];
        String s1=c+"";
      for (int j=i+1;j<arr.length;j++)
          if (arr[j]>c) {d1++;s1+=arr[j];c=arr[j];}
      if (d1>d) s2=s1;
      i++;d=d1;
    }
        System.out.println("day can tim la "+ s2);



    }
}
