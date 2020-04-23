import java.util.Arrays;

public class ReverseArraybyStack {
    public static void main(String[] args) throws Exception {
        int[] array = new int[]{1,2,3,4,5,6,7};
        int[] reversedArray = new int[array.length];
        MyStack stack = new MyStack(array.length);

        for (int i = 0; i < array.length; i++){
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++){
            reversedArray[i] = stack.pop();
        }
        System.out.println("Mảng nhập vào: " + Arrays.toString(array));
        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(reversedArray));
    }
}
