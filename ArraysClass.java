import java.util.Arrays;
import java.lang.Float;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int a[]={10,11,8,7,6,11,1,1,2,0};
        for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");
        }System.out.println();
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.sort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println(4.0/0);
        
         float b[]={100.0f,11f,0f,Float.NaN,0.0f,-0.0f,1.0f};
        Arrays.sort(b);
        System.out.println();
        for(float i:b){
            System.out.print(i+" ");
        }
    }
}
