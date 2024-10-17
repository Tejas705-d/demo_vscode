class Accenturecode
{
public static void main(String [] args)
{
String input1 ="ABABCC";
String input2 ="AB";
String output ="solve (input1,input2";
System.out.println(output); //print the output
}

// Correct method declaration with return type String
    public static String solve(String input1, String input2)
{
   
    for (int i = 0; i < input2.length(); i++) {

char ch = input2.charAt(i);
    for (int j=0; j<input1.length(); j++)
{
char ch1 = input1.chatAt(j);
   if (ch!=ch1) {
       
}
   if (ch==ch1){
   return;
     }
}


