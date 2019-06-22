public class FirstJavaProgram{

    public static double sum_of_arr(double[] arr){

        // Variable for the sum
        double sum = 0;

        // Loop the array and add the array value to the sum
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        // Return the sum
        return sum;
    }

    public static double[] generate_random_array(int random_limit, int maximum_elements){

        // Create an array of double and the value to an array of double with the size
        double[] return_array = new double[maximum_elements];
        
        // Loop through array and set the value to the random number
        for(int i = 0; i < maximum_elements; i++){
            // Generate random number and round it and set it to the value
            return_array[i] = (double) (Math.round(Math.random() * random_limit));
        }
        
        // Return the array
        return return_array;

    }

    public static void printArray(double[] arr){
        // Loop the array
        for(int i = 0; i < arr.length; i++){
    
            // Print the values
            System.out.println(i + ": " + arr[i]);
        }
    }
     
    public static void main(String[] args){
        // Variable to hold array
        double[] arr = generate_random_array(100, 10);

        // Variable for sum of the array
        double sum_of_array = sum_of_arr(arr);

        // Run the printArray method (attempt to declutter code)
        printArray(arr);

        // Print the sum
        System.out.println("Total sum: " + sum_of_array);
    }

}