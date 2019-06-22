public class FirstJavaProgram{

    public static int sum_of_arr(long[] arr){

        // Variable for the sum
        int sum = 0;

        // Loop the array and add the array value to the sum
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        // Return the sum
        return sum;
    }

    public static long[] generate_random_array(int random_limit, int maximum_elements){

        // Create an array of long and the value to an array of long with the size
        long[] return_array = new long[maximum_elements];
        
        // Loop through array and set the value to the random number
        for(int i = 0; i < maximum_elements; i++){
            // Generate random number and round it and set it to the value
            return_array[i] = (long) (Math.round(Math.random() * random_limit));
        }
        
        // Return the array
        return return_array;

    }

    public static void printArray(long[] arr){
        // Loop the array
        for(int i = 0; i < arr.length; i++){
    
            // Print the values
            System.out.println((i+1) + ": " + arr[i]);
        }
    }
     
    public static void main(String[] args){
        // Variable to hold array
        long[] arr = generate_random_array(100, 10);

        // Variable for sum of the array
        int sum_of_array = sum_of_arr(arr);

        // Run the printArray method (attempt to declutter code)
        printArray(arr);

        // Print the sum
        System.out.println("Total sum: " + sum_of_array);
    }

}
