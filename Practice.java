import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Practice {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     String s=sc.nextLine();
    //     Set<Character>set=new HashSet<>();
    //     for(int i=0;i<s.length();i++){
    //         if(Character.isAlphabetic((s.charAt(i)))){
    //             set.add(s.charAt(i));
    //         }
    //     }
    //     if(set.size()==26){
    //         System.out.println("pangram");
    //     }else{
    //         System.out.println("not pangram");
    //     }
    // }

//     public static void main(String[] args) {
//         String s="hello World3567";
// char [] ch=s.toCharArray();
// for(int i=0;i<ch.length;i++){
//     if(Character.isLowerCase(ch[i])){
// ch[i]= (char)(ch[i]-32);
//     }else if(ch[i]>'A'&&ch[i]<='z'){
//         ch[i]=(char)(ch[i]+32);
//     }
// }
// String ans=new String(ch);
// System.out.println(ans);
//     }

// public static void main(String[] args) {
//     String s="aman";
//     String reverse="";
//     char []ch=s.toCharArray();
//     for(int i=ch.length-1;i>=0;i--){
// reverse+=ch[i];
//     }
// System.out.println(reverse);
// if(s.equalsIgnoreCase(reverse)){
//     System.out.println("string is palindrome");
// }else{
//     System.out.println("string is not palindrome");
// }
// }

//count of vowels
// public static void main(String[] args) {
//     String s="oye prisha";
//     String ans="";
//     int count=0;
// char[] ch=s.toCharArray();
// for(int i=0;i<ch.length;i++)
// {
// if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i' || ch[i]=='o'|| ch[i]=='u'){
// ans +=ch[i];
// count++;
// }
// }
// System.out.println("count of vowels: "+count);
// System.out.println(ans);

// }

//remove vowels
// public static void main(String[] args) {
//     String s="Oye priti molawade";
//     s.toLowerCase();
//     String ans="";
//     char []ch=s.toCharArray();
//     for(int i=0;i<ch.length;i++){
//         if(ch[i]!='a'&& ch[i]!='e'&& ch[i]!='i' && ch[i]!='o' && ch[i]!='u'){
//             ans +=ch[i];
//         }
//     }
//     System.out.println(ans);
// }

//!pangram
public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    String s="Sphinx of block quartz,judge my vow";
    char[] ch=s.toCharArray();
    Set<Character>set=new HashSet<>();
        for(int i=0;i<ch.length;i++){
if(Character.isAlphabetic(ch[i])){
    set.add(ch[i]);
}
    }
    if(set.size()==26){
        System.out.println("String is pangram");
    }else{
        System.out.println("String is not pangram");
    }
}
}
