int power(int b, int e) {
    int result = 1;
    for (int i = 0; i < e; i++) {
        result *= b;
    }
    return result;
}

int power2(int e) {
    return power(2, e);
}

int binary2decimal(String s) {
    int result = 0;
    int exponent = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
        char ch = s.charAt(i);
        if (ch == '1') {
            result = result + power2(exponent);
        }
        exponent++;
    }
    return result;
}

// decimal 11
// 11 % 2 = *1*
// 11 / 2 = 5
// 5 % 2 = *1*
// 5 / 2 = 2
// 2 % 2 = *0*
// 2 / 2 = 1
// 1 % 2 = *1*
// 1 / 2 = 0
// ====> binary 1011
String decimal2binary(int x) {
    String result = "";
    while (x > 0) {
        result = (x % 2) + result;
        //if (x % 2 == 1) {
        //  result = "1" + result;
        //} else {
        //  result = "0" + result;
        //}
        x = x / 2;
    }
    return result;
}
