import java.util.Scanner;

public class AnagramMain {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] aArr = a.toCharArray(); // or split("")
        char[] bArr = b.toCharArray();

        sort(aArr);
        sort(bArr);

        return String.valueOf(aArr).equals(String.valueOf(bArr));
    }

    static void sort(char[] arr){
        char tem = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }
    }
}
