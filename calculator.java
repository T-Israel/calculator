
import java.util.Scanner;

class calculator{
operrations merge;

    calculator(){
        merge=new operrations();
    }


private void user_decision(){

Scanner insert = new Scanner(System.in);
System.out.println("choose the operation (+, x, /, reminder, square root)");
String input = insert.nextLine();

if(input.equals("+")){
    System.out.println(merge.add_Num());
}

else if(input.equals("x")){
   System.out.println(merge.multiply_num());
}

else if(input.equals("/")){
   System.out.println(merge.divide_Num());
}

else if(input.equals("reminder")){
    System.out.println(merge.reminder());
}

else if(input.equals("square root")){
    System.out.println(merge.sqrt());
}

else {
    System.out.println("please select between the given operations");
}

}


    
public static void main(String[]args){

    calculator calc = new calculator();

    calc.user_decision();
}

}
