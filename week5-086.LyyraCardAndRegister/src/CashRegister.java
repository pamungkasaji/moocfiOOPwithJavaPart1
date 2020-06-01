public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold
    private final double ECONOMICAL_LAUNCH_PRICE = 2.5;
    private final double GOURMET_LAUNCH_PRICE = 4.0;

    public CashRegister() {
        // at start the register has 1000 euros
        cashInRegister = 1000;
        economicalSold = 0;
        gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
        if (cashGiven >= ECONOMICAL_LAUNCH_PRICE){
            cashInRegister += ECONOMICAL_LAUNCH_PRICE;
            economicalSold ++;
            return cashGiven - ECONOMICAL_LAUNCH_PRICE;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to the register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
        if (cashGiven >= GOURMET_LAUNCH_PRICE){
            cashInRegister += GOURMET_LAUNCH_PRICE;
            gourmetSold ++;
            return cashGiven - GOURMET_LAUNCH_PRICE;
        } else {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() >= ECONOMICAL_LAUNCH_PRICE){
            card.pay(ECONOMICAL_LAUNCH_PRICE);
            economicalSold ++;
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() >= GOURMET_LAUNCH_PRICE){
            card.pay(GOURMET_LAUNCH_PRICE);
            gourmetSold ++;
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >= 0){
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}