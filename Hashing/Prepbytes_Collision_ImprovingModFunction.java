// Basic implementation of hashing using a simple hash function

public class Prepbytes_Collision_ImprovingModFunction {
    public static void main(String[] args) {
        // Not a good Hash function
        int[] arr = {11, 141, 156, 66, 296, 758};   // if we'll do (mod 10)
                                                    // 11 will be overridden by 141
                                                    // 156 and 66 will be overridden by 296

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
        System.out.println();

        // A good Hash function
        // a prime number is preferred in size of array as well as in mod function to get better results
        System.out.println("Improved Hash Function");
        int[] arr2 = {11, 141, 156, 66, 296, 758};

        int[] hash2 = new int[11];
        for(int i=0; i<11; i++){
            hash2[i] = -1;
        }

        for(int i=0; i<6; i++){
            hash2[arr2[i] % 11] = arr[i];
        }

        for(int i=0; i<11; i++){
            if(hash2[i] != -1){
                System.out.println("The element at key "+i+" is "+hash2[i]);
            }
        }
    }
}
