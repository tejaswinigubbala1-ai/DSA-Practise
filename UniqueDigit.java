public class UniqueDigit{
static Boolean uniqueDigits(int num){
int visited[]=new int[10];
while(num>0){
int digit=num%10;
if(visited[digit]==1){
return false;
}
visited[digit]=1;
num/=10;
}
return true;
}
public static void main(String[] args){
int start=100;
int end=120;
for(int i=start;i<=end;i++){
if(uniqueDigits(i)){
System.out.print(i+" ");
}
}
}
}