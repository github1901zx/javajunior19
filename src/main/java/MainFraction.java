public class MainFraction {
    public static void main(String[] args) {

        HomeWorkFraction fr1 = new HomeWorkFraction(5,0);
        HomeWorkFraction fr2 = new HomeWorkFraction(2,3);

        HomeWorkFraction result = HomeWorkFractionCalculator.sumFraction(fr1,fr2);
        System.out.println(result);
    }
}
