System.out.println("Please enter two numbers!");
double x = Double.parseDouble(System.console().readLine());
double y = Double.parseDouble(System.console().readLine());

System.out.println("Please select your operator!");
System.out.println("+ for addition");
System.out.println("- for subtraction");
System.out.println("x for multiplication");
System.out.println("/ for division");

String choice = System.console().readLine();

double result = 0;
switch (choice) {
case "+":
    result = x + y;
    break;
case "-":
    result = x - y;
    break;
case "x":
    result = x * y;
    break;
case "/":
    result = x / y;
    break;
default:
    System.out.println("I don't know what you mean by input " + choice);
}

System.out.println("The result is: " + result);
