import java.util.Random;

public class ServerNameGenerator {
    //    private static String[] adj  = new String[10];
    private static String[] adj = {"funny", "gentle", "friendly", "jealous", "kind", "hurt", "wicked", "tough", "tender", "witty"};
    //    private static String[] noun  = new String[10];
    private static String[] noun = {"Helmet", "Guitar", "Lawyer", "Magazine", "Lion", "Daughter", "Sugar", "America", "Eye", "Popcorn"};

    public static String random(String[] arr) {
        String result = "";
        int rndNum = (int) Math.floor(Math.random() * arr.length);
        result = arr[rndNum];
        return result;
    }

    public static void main(String[] args) {
//        noun[0] = "Helmet";
//        noun[1] = "Guitar";
//        noun[2] = "Lawyer";
//        noun[3] = "Magazine";
//        noun[4] = "Lion";
//        noun[5] = "Daughter";
//        noun[6] = "Sugar";
//        noun[7] = "America";
//        noun[8] = "Eye";
//        noun[9] = "witty";

//        adj[0] = "funny";
//        adj[1] = "gentle";
//        adj[2] = "friendly";
//        adj[3] = "jealous";
//        adj[4] = "kind";
//        adj[5] = "hurt";
//        adj[6] = "wicked";
//        adj[7] = "tough";
//        adj[8] = "tender";
//        adj[9] = "witty";

        System.out.println("Here is your server name : \n"+ (random(adj)+ "-" + random(noun)));

    }


}
