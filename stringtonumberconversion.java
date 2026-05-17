public class stringtonumberconversion{
public static void main(String[] args){
String str="23";
int number=0;
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
number=number*10+(ch-'0');
}
System.out.println(number);
}
}