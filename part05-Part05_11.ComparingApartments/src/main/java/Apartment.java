
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        
        if(this.squares > compared.getSquares()){
            return true;
        }
        
        return false;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.pricePerSquare * this.squares > compared.getPricePerSquare() * compared.getSquares()) {
            return true;
        }
        return false;
    }
    
    public int getRooms() {
        return this.rooms;
    }
    
    public int getSquares() {
        return this.squares;
    }
    
    public int getPricePerSquare() {
        return this.pricePerSquare;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs((pricePerSquare * squares) - (compared.getPricePerSquare() * compared.getSquares()));
    }

}
