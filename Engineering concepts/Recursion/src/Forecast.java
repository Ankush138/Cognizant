public class Forecast {


        static double futureValue(double amount, double rate, int years, double[] dp) {

            if (years == 0) {
                return amount;
            }

            if (dp[years] != 0) {
                return dp[years];
            }

            dp[years] = futureValue(amount, rate, years - 1, dp) * (1 + rate);

            return dp[years];
        }

        public static void main(String[] args) {

            double amount = 10000;
            double rate = 0.10;
            int years = 5;

            double[] dp = new double[years + 1];

            double result = futureValue(amount, rate, years, dp);

            System.out.println("Future Value = " + result);
        }
}

