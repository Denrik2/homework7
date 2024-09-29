public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_461_000) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total +" рублей");
            i = i + 1;
            total = total + salary;
        }
        //Задание 2
        System.out.println("Задание 2");
        int f = 1;
        while (f < 11) {
            System.out.print(f + " ");
            f++;
        }
        System.out.println();
        int c = 10;
        while (c > 0) {
            System.out.print(c + " ");
            c--;
        }
        //Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRate = population / 1000 * (17 - 8);
        int a = 0;
        while (a < 11){
            System.out.println("Год " + a + ", численность населения составляет " + population);
            population = population + birthRate;
            a++;
        }
        //Задание 4
        System.out.println("Задание 4");
        int contribution = 15_000;
        int z = 0;
        while (contribution < 12_200_000) {
            System.out.println("Месяц " + z + ", сумма накоплений равна " + contribution +" рублей");
            z = z + 1;
            contribution = contribution + 15_000;
            contribution = contribution + (contribution / 100 * 7);
        }
        //Задание 5
        System.out.println("Задание 5");
        int contribution1 = 15_000;
        int z1 = 0;
        while (contribution1 < 12_200_000) {
            z1 = z1 + 1;
            contribution1 = contribution1 + 15_000;
            contribution1 = contribution1 + (contribution1 / 100 * 7);
            if (z1 % 6 == 0){
                System.out.println("Месяц " + z1 + ", сумма накоплений равна " + contribution1 +" рублей");
            }
        }
        //Задание 6
        System.out.println("Задание 6");
        int contribution2 = 15_000;
        int c1 = 0;
        while (c1 < 109) {
            c1 = c1 + 1;
            contribution2 = contribution2 + 15_000;
            contribution2 = contribution2 + (contribution2 / 100 * 7);
            if (c1 % 6 == 0){
                System.out.println("Месяц " + c1 + ", сумма накоплений равна " + contribution2 +" рублей");
            }
        }
        //Задание 7
        System.out.println("Задание 7");
        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
        //Задание 8
        System.out.println("Задание 8");
        int thePast = 0;
        int future = 0;
        while (future < 2124) {
            thePast = thePast + 79;
            future = future + 79;
            if (thePast > 1824 && thePast < 2024)
                System.out.println(thePast);
            else if (future > 2024 && future < 2124) {
                System.out.println(future);
            }
        }

    }
}