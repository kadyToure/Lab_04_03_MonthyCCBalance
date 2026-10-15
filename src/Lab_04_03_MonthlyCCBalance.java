public class Lab_04_03_MonthlyCCBalance {

    public static void main (String[]args){
        {
            double balance = 5000.0;
            final double RATE = .17;

            //first month
            balance = balance + balance * RATE;
            IO.println("The balance after one month is: " + balance);

            // Second Month
            balance = balance + balance * RATE;
            IO.println("The balance after two months is: " + balance);

        }


    }

}
