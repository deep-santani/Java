import java.util.Arrays;
class Main
{
    public static void main(String[] args) {
        int arr1[]={10,20,30,40,50};
        int arr2[]={10,20,30,40,50};

        boolean ans = Arrays.equals(arr1,arr2);
        System.out.println("Ans : "+ans);
    }
}