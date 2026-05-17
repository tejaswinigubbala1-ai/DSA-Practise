public class PrintingString {
public static void main(String[] args){
String arr[]={
"Hello","2",
"I am","3",
"Learning Java","6",
};
for(int i=0;i<arr.length;i=i+2){
String word=arr[i];
int num=0;
String n=arr[i+1];
for(int j=0;j<n.length();j++){
num=num*10+(n.charAt(j)-'0');
}
for(int k=0;k<num;k++){
System.out.print(word+" ");
}
}
}
}