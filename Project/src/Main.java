public class main {
    private static int BonusReplenishment;

    public static void main(String[] args) {
        int PersonalAccount = 100;
        int BonusReplenishment = 0;
        int Replenishment = 1100;
        if (Replenishment >= 1000) {
            BonusReplenishment = Replenishment / 100;
        }
        System.out.println(BonusReplenishment + Replenishment + PersonalAccount);
    }
}
