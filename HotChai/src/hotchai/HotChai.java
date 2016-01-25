package hotchai;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Prem
 */
public class HotChai {

    public static final double chaiTemp = 70;
    public static final double tooHot = 80;
    public static final double tooCold = 60;

    public static void drinkingChai(double temp) throws TooHotException, TooColdException {

        if (temp >= tooHot) {

            throw new TooHotException();

        } else if (temp <= tooCold) {

            throw new TooColdException();

        } else {
            System.out.println("THe Chai at Right temperature to Drink");
        }

    }

    public static void main(String[] args) throws TooHotException, TooColdException, InterruptedException {
        double currentTemp = 100;
        boolean wrongTemp = true;

        while (wrongTemp) {
            try {
                drinkingChai(currentTemp);
                wrongTemp = false;
            } catch (TooHotException e1) {
                System.out.println("Chai is too Hot " + e1);
                currentTemp = currentTemp - 10;
            } catch (TooColdException e2) {
                System.out.println("Chai is too Cold " + e2);
                currentTemp = currentTemp + 10;
            } /*finally {
                System.out.println("Finally Chai is over");
            } */

            TimeUnit.SECONDS.sleep(2);

        }
        System.out.println("End of the program");

    }

}
