public class ReverseString{
static Boolean isAlphabet(char ch){
if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z')){
return true;
}
return false;
}
public static void main(String[] args){
char arr[]={'h','@','e','$','l','l','&','o'};
int left=0;
int right=arr.length-1;
while(left<right){
if(! isAlphabet(arr[left]))
left++;
if(! isAlphabet(arr[right]))
right--;
else{
char temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
left++;
right--;
}
}
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]);
}
}
}