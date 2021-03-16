/* pembagian integer, casting */
class nug {

public static void main(String[] args) {
// TODO Auto-generated method stub
/* KAMUS */
int x = 1; int y = 2; float fx; float fy;
/* ALGORITMA */
System.out.print ("x/y (format integer) = "+ x/y); 
System.out.print ("\nx/y (format float) = "+ (float)x/(float)y);
/* supaya hasilnya tidak nol */
fx=x;
fy=y;
System.out.print ("\nx/y (format integer) = "+ x/y); 
System.out.print ("\nx/y (format float) = "+ fx/fy);
/* casting */
System.out.print ("\nfloat(x)/float(y) (format integer) = "+ x/y); 
System.out.print ("\nfloat(x)/float(y) (format float) = "+ 
(float)x/(float)y);
x = 10; y = 3; float a; float b;
a=x;
b=y;
System.out.print ("\nx/y (format integer) = "+ x/y); 
System.out.print ("\nx/y (format float) = "+ a/b); 
}
}
