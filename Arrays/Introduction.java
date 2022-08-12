public class Introduction {
    public static void main(String[] args){  // (String args[]) -> also valid
        int[] marks = new int[3];  //Method-2 ->  int marks[] = new int[3];  (Also valid)
                                                 // Method-3 ->  int marks[] = {98, 95, 88};
        marks[0] = 98;  //maths
        marks[1] = 95;  //physics      // if Method-3, then no need to do this seperate allocation
        marks[2] = 88;  //chemistry

        System.out.println("Marks obtained in Maths - "+marks[0]);
        System.out.println("Marks obtained in Physics - "+marks[1]);
        System.out.println("Marks obtained in Chemistry - "+marks[2]);

        //for printing all the values of an array, we can also use loop
        // for(int i=0;i<3;i++){
        //    System.out.println(marks[i]);
    }
}
