public class RandomMathFloor {
 
    public static void main(String[] args) {
        // Declare variables  
        int randomNumber, firstRandom, secondRandom, thirdRandom, forthRandom, minValue = 1, maxValue = 20;
                 
        // Generate random numbers using the math floor
        firstRandom = (int)Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
        secondRandom = (int)Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
        thirdRandom = (int)Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
        forthRandom = (int)Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
       
        // Determine sum of the random numbers
        randomNumber = firstRandom + secondRandom + thirdRandom + forthRandom;
        
        // Display the random numbers and their sum
        System.out.println("The first random number is " + firstRandom + "\n" +
                           "The second random number is " + secondRandom + "\n" +
                           "The third random number is " + thirdRandom + "\n" +
                           "The forth random number is " + forthRandom + "\n\n" +
                           "The sum of random numbers is " + randomNumber);
    }
    
}
