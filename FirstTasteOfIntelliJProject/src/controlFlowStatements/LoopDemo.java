package controlFlowStatements;

public class LoopDemo {

    public static void main(String[] args) {

        //while loop example
        int num = 1;
        while(num < 10 ){
            System.out.println("say num is " + num);
            num = num + 1;
        }

        //do-while loop
        int count = 1;
        do{
            System.out.println("Count is " + count);
            count++;
        }while (count < 11);


        //for loop example
        //Syntax: {for(Initialisation; termination; increment}
        int age;
        for(int i = 1; i < 10; i++){
            System.out.println("age is " + i);
        }

        //advanced for or foreach loop
        int[] numbers = { 1,2,3,4,5,6,7,8,9,10};
        for (int number : numbers) {
                //System.out.println(number);
                if(number == 6){
                    System.out.println(number);
                    break;
                }

        }

    }
}
