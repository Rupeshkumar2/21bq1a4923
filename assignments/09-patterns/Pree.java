public class Pree {
    public static void main(String[] args) {
//        String[] str ={"a","abc","bc","d"};
//        leetcode1967(str,"abc");
        leetcode1309("10#11#12#");
    }

    static void leetcode1967(String[] words,String word){
        int res=0;
        for(String temp:words){

        }
    }

    static void leetcode1309(String s){
        StringBuilder str = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i+2]<ch.length && ch[i+2]=='#') {
                str.append((char) (ch[i] - 48) * 10 + (ch[i + 1] + 48));
                i = i + 2;
            }else
                str.append((char)(ch[i]+48));
        } System.out.println(str.toString());
    }
}
