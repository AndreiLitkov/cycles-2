public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");
        int accumulation = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + accumulation;
            i++;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total);
        }
        System.out.println(total);
        float years = i / 12f;
        System.out.printf("Для накопления суммы потребуется " + years + " лет.");
        System.out.println();
        // Task 2
        System.out.println("Task 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a);
        }
        System.out.println();

        for (int b = 10; b > 0; b--) {
            System.out.print(b);
        }
        System.out.println();
        //Task 3
        System.out.println("Task 3");
        int population = 12_000_000;
        int birthRate = (population / 1000) * 17;
        int deathRate = (population / 1000) * 8;
        int populationIncrease = birthRate - deathRate;
        for (int c = 0; c < 10; c++) {
            population = population + populationIncrease;
            System.out.println("Год " + (c + 1) + " , численность населения составляет " + population);
        }
        System.out.println("Численность населения через 10 лет " + population);

        //Task 4
        System.out.println("Task 4");
        int money = 15000;
        int totalNew = 0;
        for (int q = 0; totalNew <= 12_000_000; q++) {
            totalNew = totalNew + totalNew * 7 / 100;
            totalNew = totalNew + money;
            System.out.println("Месяц " + (q + 1) + " сумма накопления по вкладу = " + totalNew);
        }
        //Task 5
        System.out.println("Task 5");
        int totalNew1 = 0;
        for (int q = 0; totalNew1 <= 12_000_000; q++) {
            totalNew1 = totalNew1 + totalNew1 * 7 / 100;
            totalNew1 = totalNew1 + money;
            if (q % 6 == 0) {
                System.out.println("Месяц " + q + " сумма накопления по вкладу = " + totalNew1);
            }
        }
        //Task 6
        System.out.println("Task 6");
        int moneyVasilii = 15000;
        int finalSum = 0;
        for (int g = 0; g <= 108; g++) {
            finalSum = finalSum + finalSum * 7 / 100;
            finalSum = finalSum + moneyVasilii;
            if (g % 6 == 0) {
                System.out.println("Сумма накоплений за " + g + " месяцев составляет " + finalSum);
            }
        }
        //Task 7
        System.out.println("Task7");
        int day = 1; // Первая пятница месяца
        for (int d = day; d <= 30; d = d + 7) {
            System.out.println("Сегодня пятница " + d + "-e число. Небходимо подготовить отчет!");
        }
        //Task 8
        System.out.println("Task 8");
        int year = 2025;
        int lastYears = year - 200;
        int nextYears = year + 100;
        int y;
        for (y = 0; y < nextYears; y = y + 79) {
            if (y >= lastYears) {
                System.out.println(y);
            }
        }
    }
}
