public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int priceTotal;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.priceTotal = squareMeters * pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }

    public int priceDifference(Apartment otherApartment){
        return Math.abs(this.priceTotal - otherApartment.priceTotal);
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        return this.priceTotal > otherApartment.priceTotal;
    }
}