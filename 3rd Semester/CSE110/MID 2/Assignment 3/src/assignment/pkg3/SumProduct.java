package assignment.pkg3;

public class SumProduct {
    public static void main(String[] args) {
        int root, sum=0;
        int n=10;
        for(int i=1;i<=n;i++){
            root = i*i;
            sum = sum+root;
            System.out.printf("%d square = %d\n",i,root);
        }
        System.out.printf("Sum = %d\n",sum);
    }
}
