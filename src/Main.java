public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        int monthlyAmount = 0;
        int[] monthlyPayment = new int [5];
        monthlyPayment[0] = 200;
        monthlyPayment[1] = 250;
        monthlyPayment[2] = 100;
        monthlyPayment[3] = 180;
        monthlyPayment[4] = 240;
        for(int i = 0; i < monthlyPayment.length; i++){
            monthlyAmount = monthlyAmount + monthlyPayment[i];
        }
        System.out.println("Сумма трат за месяц составила " + monthlyAmount + " рублей");

        //task 2
        System.out.println("Task 2");
        int maximumAmount = 0;
        int[] monthlyPaymentNew = new int [5];
        monthlyPaymentNew[0] = 200;
        monthlyPaymentNew[1] = 250;
        monthlyPaymentNew[2] = 100;
        monthlyPaymentNew[3] = 180;
        monthlyPaymentNew[4] = 240;

        int minimumAmount = monthlyPaymentNew[0];
        for(int i = 0; i < monthlyPaymentNew.length; i++){
            if (monthlyPaymentNew[i] < minimumAmount) {
                minimumAmount = monthlyPaymentNew[i];
            }
            if (monthlyPaymentNew[i] > maximumAmount) {
                maximumAmount = monthlyPaymentNew[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minimumAmount + " рублей. Максимальная сумма трат за неделю составила " + maximumAmount + " рублей.");

    }
}