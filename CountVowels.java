public class CountVowels {
    public static void main(String[] args) {
        String s="education";
        int count=0;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
