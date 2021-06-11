import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest {

    @Test()
    public void addTest1() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1, 1, 2);
        HomeWorkFraction frc2 = new HomeWorkFraction(12, 12);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 1, 2);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test
    public void addTest2() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1, 1, 2);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 0, 0);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test
    public void addTest3() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(5, 6);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test
    public void addTest4() {
        HomeWorkFraction frc1 = new HomeWorkFraction(11, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(4, 1, 6);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test
    public void addTest5() {
        HomeWorkFraction frc1 = new HomeWorkFraction(0, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(1, 2);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test
    public void addTest6() {
        HomeWorkFraction frc1 = new HomeWorkFraction(7000000, 3000000);
        HomeWorkFraction frc2 = new HomeWorkFraction(4000000, 6000000);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test(expected = NullPointerException.class)
    public void addTest7() {
        HomeWorkFraction frc1 = new HomeWorkFraction(7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addTest8() {
        HomeWorkFraction frc1 = new HomeWorkFraction(-1,7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void addTest9() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,-7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void addTest10() {
        HomeWorkFraction frc1 = new HomeWorkFraction(-1,7, -3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void addTest11() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(-1, 2);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void addTest12() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1,-1, 3);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void addTest13() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,7, -3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1,1, -3);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = NullPointerException.class)
    public void addTest14() {
        HomeWorkFraction frc1 = new HomeWorkFraction(0, 0);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 3);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.sumFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test()
    public void difTest1() {
        HomeWorkFraction frc1 = new HomeWorkFraction(2, 7);
        HomeWorkFraction frc2 = new HomeWorkFraction(3, 4);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(-13, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test()
    public void difTest2() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1, 1, 2);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(1, 0, 0);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test()
    public void difTest3() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(-1, 6);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test()
    public void difTest4() {
        HomeWorkFraction frc1 = new HomeWorkFraction(11, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(3, 1, 6);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test()
    public void difTest5() {
        HomeWorkFraction frc1 = new HomeWorkFraction(0, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(-1, 2);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test()
    public void difTest6() {
        HomeWorkFraction frc1 = new HomeWorkFraction(3000000, 7000000);
        HomeWorkFraction frc2 = new HomeWorkFraction(7000000, 4000000);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(71, 280);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test(expected = NullPointerException.class)
    public void difTest7() {
        HomeWorkFraction frc1 = new HomeWorkFraction(7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test(expected = IllegalArgumentException.class)
    public void difTest8() {
        HomeWorkFraction frc1 = new HomeWorkFraction(-1,7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void difTest9() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,-7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void difTest10() {
        HomeWorkFraction frc1 = new HomeWorkFraction(-1,7, -3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void difTest11() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(-1, 2);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void difTest12() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1,-1, 3);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void difTest13() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,7, -3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1,1, -3);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = NullPointerException.class)
    public void difTest14() {
        HomeWorkFraction frc1 = new HomeWorkFraction(0, 0);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 3);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.differenceFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test
    public void multTest1() {
        HomeWorkFraction frc1 = new HomeWorkFraction(2, 7);
        HomeWorkFraction frc2 = new HomeWorkFraction(3, 4);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(3, 14);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test
    public void multTest2() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1, 1, 2);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(3, 4);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test
    public void multTest3() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(1, 6);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test
    public void multTest4() {
        HomeWorkFraction frc1 = new HomeWorkFraction(11, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(1, 5, 6);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test()
    public void multTest5() {
        HomeWorkFraction frc1 = new HomeWorkFraction(0, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(0, 0, 0);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test()
    public void multTest6() {
        HomeWorkFraction frc1 = new HomeWorkFraction(3000000, 7000000);
        HomeWorkFraction frc2 = new HomeWorkFraction(7000000, 4000000);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(7, 1, 2);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test(expected = NullPointerException.class)
    public void multTest7() {
        HomeWorkFraction frc1 = new HomeWorkFraction(7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test(expected = IllegalArgumentException.class)
    public void multTest8() {
        HomeWorkFraction frc1 = new HomeWorkFraction(-1,7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void multTest9() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,-7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void multTest10() {
        HomeWorkFraction frc1 = new HomeWorkFraction(-1,7, -3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void multTest11() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(-1, 2);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void multTest12() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1,-1, 3);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void multTest13() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,7, -3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1,1, -3);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = NullPointerException.class)
    public void multTest14() {
        HomeWorkFraction frc1 = new HomeWorkFraction(0, 0);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 3);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.multiplicationFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test
    public void divTest1() {
        HomeWorkFraction frc1 = new HomeWorkFraction(2, 7);
        HomeWorkFraction frc2 = new HomeWorkFraction(3, 4);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(8, 21);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test
    public void divTest2() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1, 1, 2);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(3, 0, 0);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test
    public void divTest3() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 3);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test
    public void divTest4() {
        HomeWorkFraction frc1 = new HomeWorkFraction(11, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(7, 1, 3);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test()
    public void divTest5() {
        HomeWorkFraction frc1 = new HomeWorkFraction(0, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 2);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(0, 0, 0);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test()
    public void divTest6() {
        HomeWorkFraction frc1 = new HomeWorkFraction(3000000, 7000000);
        HomeWorkFraction frc2 = new HomeWorkFraction(7000000, 4000000);


        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(6, 245);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = NullPointerException.class)
    public void divTest7() {
        HomeWorkFraction frc1 = new HomeWorkFraction(7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divTest8() {
        HomeWorkFraction frc1 = new HomeWorkFraction(-1,7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void divTest9() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,-7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void divTest10() {
        HomeWorkFraction frc1 = new HomeWorkFraction(-1,7, -3);
        HomeWorkFraction frc2 = new HomeWorkFraction(0, 0);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void divTest11() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(-1, 2);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void divTest12() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,7, 3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1,-1, 3);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = IllegalArgumentException.class)
    public void divTest13() {
        HomeWorkFraction frc1 = new HomeWorkFraction(1,7, -3);
        HomeWorkFraction frc2 = new HomeWorkFraction(1,1, -3);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }
    @Test(expected = NullPointerException.class)
    public void divTest14() {
        HomeWorkFraction frc1 = new HomeWorkFraction(0, 0);
        HomeWorkFraction frc2 = new HomeWorkFraction(1, 3);

        HomeWorkFraction resultFact = HomeWorkFractionCalculator.divisionFraction(frc1, frc2);
        HomeWorkFraction resultWont = new HomeWorkFraction(2, 5, 28);
        TestCase.assertEquals(resultFact, resultWont);
    }


}
