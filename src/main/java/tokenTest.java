import java.util.StringTokenizer;

public class tokenTest {
    public static void main(String[] args) {
        String std = "No=std%Name=ym%Age=23";
        StringTokenizer tokens = new StringTokenizer(std, "%");
        while(tokens.hasMoreTokens()){
            String token = tokens.nextToken();
            String ele[] = token.split("=");
            System.out.println(ele[0]+"정보:"+ele[1]);
        }

    }
}
