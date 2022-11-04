package recursion;

public class StringReverse {
    public static void main(String[] args) {
        reverse("Isha Narang");
    }
    static boolean reverse(String str){

        char[] arr = str.toCharArray();
        reverse(arr);
        String string = new String(arr);
        System.out.println(string);

        return false;
    }
    static void reverse(char[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            swap(arr, i , arr.length-i-1);
        }

    }
    static void swap(char[] arr, int i, int j){
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
