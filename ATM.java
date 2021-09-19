public class ATM {
    public int countBanknotes(int sum){

        int[] nominals = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
        int sumChange = sum;
        int countNominals = nominals.length;
        int[] amounts = new int[countNominals];
        int i = 0;
        int amountResult = 0;
        while (countNominals > i){
            amounts[i] = sumChange / nominals[i];
            sumChange %= nominals[i];
            amountResult += amounts[i];
            i++;
        }
        return amountResult;
    }
}
