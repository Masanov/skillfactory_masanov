import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class game {

    public static void main(String[] args) {

        String text = "*-ки *должны* примыкать к *СЛОВУ*)";
        Pattern pattern = Pattern.compile("...");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            System.out.print(text.substring(start,end) + " ");
            System.out.print("end");
            System.out.print("new_branch");

        }


    }
}
