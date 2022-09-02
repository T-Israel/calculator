import java.util.Scanner;

class operrations{

  double add_Num(){
    
    Scanner input = new Scanner(System.in);
    System.out.println("enter the first number you want to add");
    double num1= input.nextDouble();

    System.out.println("enter the second number");
    double num2 = input.nextDouble();

    double addition = num1+num2;

    return addition;
  }

  double multiply_num(){

    Scanner input = new Scanner(System.in);
    System.out.println("enter the first number you want to multiply");
    double num1= input.nextDouble();

    System.out.println("enter the second number");
    double num2 = input.nextDouble();

    double multiplication = num1*num2;

    return multiplication;
  }

  double divide_Num(){
    Scanner input = new Scanner(System.in);
    System.out.println("enter the first number you want to divide");
    double num1= input.nextDouble();

    System.out.println("enter the second number");
    double num2 = input.nextDouble();

    double division = num1/num2;

    return division;
  }

double reminder(){
  Scanner input = new Scanner(System.in);

  System.out.println("enter the first number you want to know the reminder of");
    double num1= input.nextDouble();

    System.out.println("enter the second number");
    double num2 = input.nextDouble();

    double reminder = num1%num2;

    return reminder;
}

double sqrt(){
  Scanner input = new Scanner(System.in);

  System.out.println("enter the number you want to know the square root of");
    double num1= input.nextDouble();

    double square_root = Math.sqrt(num1);

    return square_root;
}









}
