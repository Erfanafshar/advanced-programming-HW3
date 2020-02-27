import java.util.Scanner;
public class WordCount {

    //String str ;
    public char ch ;
    public WordCount (){
        //str = get.nextLine();
    }


    public static void main(String[] args) {


        Scanner get = new Scanner(System.in);
        //String str = get.next();
        //char c = str.charAt(0);

        //WordCount wc = new WordCount();
        if (args[0] == null) {
            System.out.println("all");
        } else {
            if (args[0].equals("-l") || args[0].equals("--lines")) {
                //System.out.println("lines");
                for(int i=0 ; i<100 ; i++) {
                    String str = get.next();
                    char c = str.charAt(0);
                    if (c == '-') {
                        System.out.println("next line ");
                        break;
                    } else ;
                }






            } else {
                if (args[0].equals("-w") || args[0].equals("--words")) {
                    System.out.println("words");
                } else {
                    if (args[0].equals("-c") || args[0].equals("--chars")) {
                        System.out.println("chars");
                    } else {
                        System.out.println("invalid input");
                    }

                }
            }
        }
    }
    }

