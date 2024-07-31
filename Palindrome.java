public class Palindrome {
    public static void main(String[] args) {
        String s="levEl";
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse +s.charAt(i);
        }
        if(s.equalsIgnoreCase(reverse)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not a plaindrome");
        }
    }
}