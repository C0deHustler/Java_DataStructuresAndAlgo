// Basic implementation of hashing using a simple hash function

public class Prepbytes_Hashing_ModFunction {
    public static void main(String[] args) {
        int[] arr = {11, 145, 156, 172, 293, 758};

        int[] hash = new int[10];
        for(int i=0; i<10; i++){
            hash[i] = -1;
        }

        for(int i=0; i<6; i++){
            hash[arr[i] % 10] = arr[i];
        }

        for(int i=0; i<10; i++){
            if(hash[i] != -1){
                System.out.println("The element at key "+i+" is "+hash[i]);
            }
        }
    }
}
