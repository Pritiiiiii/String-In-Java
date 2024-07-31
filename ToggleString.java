public class ToggleString {
    public static void main(String[] args) {
        String s="Hello World";
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
 if(Character.isLowerCase(ch[i]))//ch[i]>='a'&& ch[i]<='z'
{
ch[i]=(char)(ch[i]-32);
}else if(Character.isUpperCase(ch[i])){
ch[i]=(char)(ch[i]+32);
}
 }
        String result=new String(ch);
        System.out.println(result);
    }
}
