public class mathTesterActual {
    public static void main(String[] args) {
        String firstWord;
        String secondWord;
        int firstNumber, secondNumber;
        int total;

        firstWord = "dog";
        secondWord = "house";
        firstNumber = 5;
        secondNumber = 10;


        System.out.println(firstWord + secondWord);
        System.out.println(firstWord + (firstNumber + secondNumber));
        System.out.println("firstNumber + secondNumber is " + (firstNumber + secondNumber));
        System.out.println("firstNumber - secondNumber is " + (firstNumber - secondNumber));
        System.out.println("secondNumber / firstNumber is " + (secondNumber / firstNumber));
        System.out.println("firstNumber * secondNumber is " + (firstNumber * secondNumber));
        System.out.println("This is the modulus of the secondNumber by the firstNumber is " + (firstNumber % secondNumber));

        total = firstNumber+secondNumber/secondNumber;

        System.out.println("the total of firsNumber + secondNumber / secondNumber is " +total);



    }
}



















}
