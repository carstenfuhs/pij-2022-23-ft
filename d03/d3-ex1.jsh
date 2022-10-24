double d1 = 1.255;
double d2 = d1 + 7 - 4 - 3;
//if (d1 - d2 < 1E-6 || d2 - d1 < 1E-6) {
if (Math.abs(d1 - d2) < 1E-6) {
    System.out.println("1.255 is equal to 1.255 plus 7 minus 7");
} else {
    System.out.println("1.255 is NOT equal to 1.255 plus 7 minus 7");
}

// Let's have a DEMO at 3:40 pm!