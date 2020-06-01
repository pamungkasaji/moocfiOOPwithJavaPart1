public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }

        // years and months the same, we'll compare the days
        return this.year == compared.year && this.month == compared.month &&
                this.day < compared.day;
    }

    public void advance (){
        if (day != 30){
            day ++;
        } else {
            if (month != 12){
                day = 1;
                month ++;
            } else {
                day = 1;
                month = 1;
                year ++;
            }
        }
    }

    public void advance(int numberOfDays) {
        for(int i = 0; i < numberOfDays; i++){
            advance();
        }
    }

    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);

        newMyDate.advance(days);

        return newMyDate;
    }
}