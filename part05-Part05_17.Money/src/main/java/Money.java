
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros() + addition.euros(), this.cents() + addition.cents());
        return newMoney;
    }
    
    public Money minus(Money decreaser) {
    int totalCentsFirst = this.euros * 100 + this.cents;
    int totalCentsSecond = decreaser.euros() * 100 + decreaser.cents();
    
    int differenceInCents = totalCentsFirst - totalCentsSecond;

    if (differenceInCents < 0) {
        return new Money(0, 0);
    }

    int newEuros = differenceInCents / 100;
    int newCents = differenceInCents % 100;

    return new Money(newEuros, newCents);
}
       

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }

        if (this.euros > compared.euros()) {
            return false;
        }

        return this.cents < compared.cents();
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
