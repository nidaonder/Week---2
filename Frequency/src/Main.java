public class Main {

    static void isRepeat(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count ++;
                }
            }
            System.out.println(arr[i] + " sayısı " + count + " kez tekrar ediyor. ");
        }
    }

    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        isRepeat(list);
    }
}