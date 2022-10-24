//Methods
//(aka subroutine, functions, procedures, ...)

//name
//inputs (with type) -> signature
//output (with type)

//int length() in class String
//char charAt(int)
//boolean contains(String)

// returns two times the parameter value x
int timesTwo(int x) {
    //return x*2;
    return x + x;
}

// returns s + s + ... + s, howOften times
// example: s = "ab" and howOften = 3, get
// "ababab"
String repeat(String s, int howOften) {
    String result = "";
    for (int count = 1; count <= howOften; count++) {
        result = result + s;
    }
    return result;
}

