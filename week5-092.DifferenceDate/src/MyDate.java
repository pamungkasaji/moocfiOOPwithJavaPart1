
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        double diff = 0;

        // check if this object date is earlier than compared date
        if (this.earlier(comparedDate)){
            // convert month and day to year
            diff = (comparedDate.year + (double) comparedDate.month / 12 + (double) comparedDate.day / 365)
                    - (this.year + (double) this.month / 12 + (double) this.day / 365);
        } else {
            diff = (this.year + (double) this.month / 12 + (double) this.day / 365)
                    - (comparedDate.year + (double) comparedDate.month / 12 + (double) comparedDate.day / 365);
        }

        return (int) diff;
    }

    // dibawah tidak digunakan di exercise ini

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
