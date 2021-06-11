public class HomeWorkFraction {
    private int numerator;
    private int denominator;
    private int wholePart;

    public HomeWorkFraction() { //default

    }

    public HomeWorkFraction(int numerator, int denominator) {

        this.numerator = numerator;
        this.denominator = denominator;


    }

    public HomeWorkFraction(int wholePart, int numerator, int denominator) {

        this.numerator = numerator;
        this.denominator = denominator;
        this.wholePart = wholePart;
    }


    public void setNumerator(int a) {
        this.numerator = a;
    }

    public void setDenominator(int b) {
        this.denominator = b;
    }

    public void setWholePart(int c) {
        this.wholePart = c;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getWholePart() {
        return wholePart;
    }


    @Override
    public String toString() {
        if (wholePart == 0) {
            return numerator + "/" + denominator;
        } else if (numerator == 0 || denominator == 0) {
            return String.valueOf(wholePart);
        } else {
            return wholePart + numerator + "/" + denominator;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HomeWorkFraction)) return false;

        HomeWorkFraction that = (HomeWorkFraction) o;

        if (numerator != that.numerator) return false;
        if (denominator != that.denominator) return false;
        return wholePart == that.wholePart;
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        result = 31 * result + wholePart;
        return result;
    }
}
