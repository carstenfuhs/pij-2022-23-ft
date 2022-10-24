// Write a program that requests two numbers from the user and then outputs their product.
// You cannot use the “*” operator.

System.out.println("Please enter two numbers!");
int x = Integer.parseInt( System.console().readLine() );
int y = Integer.parseInt( System.console().readLine() );

int product = 0;
// how to multiply x and y without the "*"?
// 5 * 3 = 0 + 5 + 5 + 5

int yCount = y;

if (y < 0) {
  yCount = -y; // do the multiplication with the absolute value
}

while (yCount > 0) {
  product = product + x;
  yCount = yCount - 1;
}

if (y < 0) {
  product = -product; // add the sign information to product
}

// done!
System.out.println(x + " * " + y + " = " + product);
