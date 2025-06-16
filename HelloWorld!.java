class Secondary {
    static int thirde = 10;
    static int fourthe = 20;
    static int fifthe = 40;
    static int sixthe = 60;

    static int sume = ((thirde + fourthe) * fifthe) / sixthe;
    static String factcheck;

    static {
        if (sume > 10) {
            factcheck = "true";
        } else {
            factcheck = "false";
        }
    }
}

public class Main {
    static int firste = 10;
    static int seconde = 20;
    static int sum = firste + seconde;

    public static void main(String[] args) {
        System.out.println(sum);
        System.out.println(Secondary.sume);
        System.out.println(Secondary.factcheck);
    }
}