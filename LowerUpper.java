public class LowerUpper {
    public static void main(String[] args) {
        String s="java@ programming123";
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
if(Character.isLowerCase(ch[i]))//ch[i]>='a'&& ch[i]<='z'
{
ch[i]=(char)(ch[i]-32);
}
        }
        String uppper=new String(ch);
        System.out.println(uppper);
    }
}
