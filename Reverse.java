public class Reverse {
//    public static void main(String[] args) {
//     String s="thane";
//     String output="";
//     for(int i=s.length()-1;i>=0;i--){
//         output=output+s.charAt(i);
//     }
//     System.out.println(output);
//    } 

public static void main(String[] args) {
    String s="prisha";
    String reverse="";
    for(int i=0;i<s.length();i++){
        reverse= s.charAt(i)+reverse;
    }
    System.out.println(reverse);
}
}
