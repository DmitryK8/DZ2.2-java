public class main {
    private static int bonusReplenishment;

    public static void Main(String[] args) {
        int personalAccount = 100;
        int bonusReplenishment = 0;
        int replenishment = 1100;
        if (replenishment >= 1000) {
            bonusReplenishment = replenishment / 100;
        }
        System.out.println(bonusReplenishment + replenishment + personalAccount);
    }
}
