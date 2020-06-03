public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public Money plus(Money added) {
        int newEuro = this.euros + added.euros;
        int newCent = this.cents + added.cents;
        return new Money(newEuro, newCent);
    }

    public Money minus(Money decremented) {
        if (this.less(decremented)){
            return new Money(0, 0);
        } else {
            int newEuro = this.euros - decremented.euros;
            int newCent = this.cents - decremented.cents;
            if (this.cents < decremented.cents){
                newEuro --;
                newCent = 100 - decremented.cents;
            }
            return new Money(newEuro, newCent);
        }
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros){
            return true;
        } else if (this.euros == compared.euros){
            if (this.cents < compared.cents){
                return true;
            }
        }
        // euros equal, check cents
        return false;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }
}