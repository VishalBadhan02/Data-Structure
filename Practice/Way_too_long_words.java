public class Way_too_long_words {
    public static void main(String[] args) {
        String a = "word";

        int l = a.length();
        if(l<10){
            System.out.println(a);
        }
        else{
            System.out.println(a.charAt(0)+""+(l-2)+""+a.charAt(l));
        }
    }
}
