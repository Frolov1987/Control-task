public class Paymants {
    static String pay;
    static double summ;
    static double topay;

    public static void main(String[] args) {

        summ = 100;
        pay = "3";

        switch (pay.trim()) {

            case "1":
                topay = summ;
                System.out.printf("cash paymand %.0f", topay);
                break;

            case "2":
                topay = summ * 1.05;
                System.out.printf("paymant to a checking account %.5f", topay);
                break;

            case "3":
                topay = summ * 1.02;
                System.out.printf("card paymand %.2f", topay);
                break;

            default:
                System.out.println("Unknown xc:/");
        }

    }
}

