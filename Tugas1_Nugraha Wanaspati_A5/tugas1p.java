class Oprator {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
boolean Bool1, Bool2, TF ; 
int i, j, hsl ;
float x, y, res;
/* algoritma */
System.out.println ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");
Bool1 = true; 
Bool2 = false;
TF = Bool1 && Bool2 ; /* Boolean AND */
System.out.println("Bool1 && Bool2 = " + (Bool1 && Bool2));
TF = Bool1 || Bool2 ; /* Boolean OR */
System.out.println("Bool1 || Bool2 = " + (Bool1 | Bool2));
TF = ! Bool1 ; /* NOT */
System.out.println("!Bool1 = " + !Bool1);
TF = Bool1 ^ Bool2; /* XOR */
System.out.println("Bool1 ^ Bool2 = " + (Bool1 ^ Bool2));
/* operasi numerik */
i = 5; j = 2 ;
hsl = i + j; 
System.out.println("i + j = " + (i + j));
hsl = i - j; 
System.out.println("i - j = " + (i - j));
hsl = i / j; 
System.out.println("i / j = " + (i / j));
hsl = i * j;
System.out.println("i * j = " + (i * j));
hsl = i / j; /* pembagian bulat */
System.out.println("i / j = " + (i / j));
hsl = i % j; /* sisa. modulo */
System.out.println("i % j = " + (i % j));
/* operasi numerik */
x = 5 ; 
y = 5 ;
res = x + y; 
System.out.println("x + y = " + (x + y));
res = x - y; 
System.out.println("x - y = " + (x - y));
res = x / y; 
System.out.println("x / y = " + (x / y));
res = x * y;
System.out.println("x * y = " + (x * y));
/* operasi relasional numerik */
TF = (i == j); 
System.out.println("i == j = " + (i == j));
TF = (i != j);
System.out.println("i != j = " + (i != j));TF = (i < j); 
System.out.println("i < j = " + (i < j));
TF = (i > j); 
System.out.println("i > j = " + (i > j));
TF = (i <= j);
System.out.println("i <= j = " + (i <= j));
TF = (i >= j);
System.out.println("i >= j = " + (i >= j));
/* operasi relasional numerik */
TF = (x != y);
System.out.println("x != y = " + (x != y));
TF = (x < y); 
System.out.println("x < y = " + (x < y));
TF = (x > y); 
System.out.println("x > y = " + (x > y));
TF = (x <= y); 
System.out.println("x <= y = " + (x <= y));
TF = (x >= y);
System.out.println("x >= y = " + (x >= y));
}
}