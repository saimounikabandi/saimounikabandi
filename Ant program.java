import java.util.*;
public class main{
    public static int countReturnToOriginal(int[]A,int N){
        int position=0,count=0;
        for(int i=0;i<N;i++){
            position+=A[i];
            if(position==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int result=countReturnToOriginal(A,N);
        System.out.println(result);
        }
    }