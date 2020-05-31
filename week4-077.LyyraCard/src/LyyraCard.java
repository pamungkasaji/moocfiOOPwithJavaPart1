public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        balance = balanceAtStart;
    }

    public void payEconomical() {
        // write code here
        if(balance >= 2.5){
            balance -= 2.5;
        }
    }

    public void payGourmet() {
        // write code here
        if(balance >= 4){
            balance -= 4;
        }
    }

    public void loadMoney(double amount) {
        // write code here
        if(amount > 0){
            if ((balance + amount) > 150) {
                balance = 150;
            } else {
                balance += amount;
            }
        }
    }

    public String toString() {
        // write code here
        return "The card has " + balance + " euros";
    }
}