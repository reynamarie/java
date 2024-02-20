import tester.*;

class DesignRecipeExamples { int volume(int length, int width, int height) {
    return length * width * height;
}
    int volume_test1 = this.volume(2,2,2); // expect 8
    int volume_test2 = this.volume(4,5,6); // expect 120

    int quadraticEquation(int a, int b, int c, int x){
        return a * x * x + b * x + c;
   }
    int quadraticEquation_test1 = this.quadraticEquation(1, 2, 3, 4); // expect 27
    int quadraticEquation_test2 = this.quadraticEquation(2, 3, 4, 5); // expect 69

int farenheitToCelsius(int farenheit){
    /*
     * Method that converts farenheit to celcius. It takes one int parameter, converts it to another int value, and returns the new int value.
     */
    return (farenheit - 32) * 5 / 9;
}
    int farenheitToCelsius_test1 = this.farenheitToCelsius(95); // expect 35
    int farenheitToCelsius_test2 = this.farenheitToCelsius(212); // expect 100

    int totalInchesOfFeetAndInches(int feet, int inches){
        /*
         * Method that converts feet and inches to inches. It takes two int parameters, converts them to another int value, and returns the new int value.
         */
        return feet * 12 + inches;
    }

    int totalInchesOfFeetAndInches_test1 = this.totalInchesOfFeetAndInches(5, 6); // expect 66
    int totalInchesOfFeetAndInches_test2 = this.totalInchesOfFeetAndInches(9, 3); // expect 111
    // The output is incorrect because the method cannot handle integer overflow
    int totalInchesOfFeetAndInches_test3 = this.totalInchesOfFeetAndInches(Integer.MAX_VALUE, 2); // integer overflow expected

}



    
         
   
   



