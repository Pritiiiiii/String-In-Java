//wap to count all the vowels present in the string.
//wap to count all the consonant prsent  in the string
//wap to count all the numeric values prsent in the string
public class RemoveVowels {
    /*public static void main(String[] args) {
        String s="helloaeio";
        // char ch='o';
        String output="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='i'||s.charAt(i)=='u' ){
                output= output + s.charAt(i);
            count++;
           }
        }
        System.out.println("count of vowels that are present in string: "+count);
        System.out.println("only vowels :"+output);
        
    } */

    //WAP TO REMOVE ALL THE vowels FROM THE STRING
    /*public static void main(String[] args) {
        String s="thane is big city";
        String output="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'&& s.charAt(i)!='e' && s.charAt(i)!='i'&& s.charAt(i)!='o'&& s.charAt(i)!='u'){
output=output+s.charAt(i);
            }
        }
        System.out.println(output);
    } */

    //
    //wap to count all the numeric values present in the string
    /* public static void main(String[] args) {
        String s="12abcd45uyi";
        String output="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if
                (Character.isDigit(s.charAt(i))){
                    output=output+s.charAt(i);
                    count++;
                }

}  
        System.out.println(count);
        System.out.println(output);
}*/
    //wap to count all the consonant present  in the string
    public static void main(String[] args) {
        String s="hello prisha";
        String output="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a' && s.charAt(i)!='e'&& s.charAt(i)!='i'&& s.charAt(i)!='o' && s.charAt(i)!='u'){
output=output+s.charAt(i);
count++;
            }
        }
        System.out.println("count of consonant: "+count);
        System.out.println(output);
    }
}

