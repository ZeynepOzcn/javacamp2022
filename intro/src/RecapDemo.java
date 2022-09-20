public class RecapDemo {
    public static void main(String[] args) {
        double[] myList = {1.2, 4.1, 6.0, 8.6};
        double total = 0;
        double max = myList[0];
        for (double numbers : myList) {
            if (max < numbers) {
                max = numbers;
            }
            total = total + numbers;
            System.out.println(numbers);
        }
        System.out.println("TOPLAM = " + total);
        System.out.println("EN BÜYÜK = " + max);

    }
}
