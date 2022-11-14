public class PrintNumbers {

/*
Workings:

stack grows to the right
time goes down

pn(6)
 6
 pn(4)
  4
  pn(2)
   2
   pn(0)
   pn(-1)
   2
  pn(1)
   1
   pn(-1)
   pn(-2)
   1
  4
 pn(3)
  3
  pn(1)
   1
   pn(-1)
   pn(-2)
   1
  pn(0)
  3
 6

Answer:

6
4
2
2
1
1
4
3
1
1
3
6

*/
    public static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n-2);

        // this method call happens only after printNumbers(n-2) has finished
        printNumbers(n-3);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNumbers(6);
    }
}
