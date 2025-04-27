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


    }
}