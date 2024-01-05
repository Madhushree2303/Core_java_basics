package Java_basics_03;

import java.util.Scanner;

public class Java_concept_24 {
    public static void main(String[] args) {
        // if & switch -> condition based
        //Loops -> for, while & do while -> repeats the code until the condition met

        //Enter a browser name and system will run the code on that browser

        Scanner sc= new Scanner(System.in);
        System.out.println("enter browser name");
        String browser_name=sc.nextLine();

        switch (browser_name){
            case "chrome":
                System.out.println("execute the code in chrome browser");
                break;
            case "firefox":
                System.out.println("execute the code in firefox browser");
                break;
            case "safari":
                System.out.println("execute the code in safari browser");
                break;
            case "edge":
                System.out.println("execute the code in edge browser");
            default:
                System.out.println("No idea about the browser");

        }
    }
}

