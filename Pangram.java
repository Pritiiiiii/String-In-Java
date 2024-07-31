import java.util.HashSet;
import java.util.Set;
public class Pangram {
    //!By using array
    /*
     *  public static void main(String[] args) {
        String s="java is a programming lang";
        s=s.toLowerCase();
        boolean [] b=new boolean[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
                int x=s.charAt(i)-'a';
                b[x]=true;
            }
        }
        int count=0;
        for(int i=0;i<b.length;i++){
            if(b[i]==true){
                count++;
            }
        }
        if(count==26){
            System.out.println("String is pangram");
        }else{
            System.out.println("String is not pangram");
        }
    }
     */

     //!by using collection
     public static void main(String[] args) {
        String s="Sphinx of block quartz,judge my vow";
        Set<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
set.add(s.charAt(i));
            }
        }
        if(set.size()==26){
            System.out.println("pangram");
        }else{
            System.out.println("not a pangram");
        }
     }
   
}
