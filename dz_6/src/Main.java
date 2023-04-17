public class Main {
    public static void main(String[] args) {
        //Task#1
        //Написати метод який приймає массив цілих чисел
        // і вертає суму всіх його парних елементів(не тих які мають парні індекси а ті які самі є парними). [8,2,3,4,5,6,7] -> 20


        int[] numbers = new int[]{8, 2, 3, 4, 5, 6, 7};

        Solution solution = new Solution();

        System.out.println("Task#1");
        solution.totalSum(numbers);

        // Task#2
//        Написати метод приймає стрінгу і друкує всі її унікальні значення з нового рядка.
//        Alexx9800
//        A
//        l
//        e
//        x
//        9
//        8
//        0
//
        Unique unique = new Unique();


        System.out.println("Task#2");
        unique.selectUniqueChar();


    }

}