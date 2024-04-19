public class Main {
    public static void main(String[] args) {
        //Задача 1
        int deposit = 15_000;
        int capital = 0;
        int capitalMonth = 1;
        while (capital <= 2_459_000) {
            capital *= 1.01;
            capital += deposit;
            System.out.println("Месяц " + capitalMonth + ", сумма накоплений равна " + capital + " рублей.");
            capitalMonth++;
        }


        //Задача 2
        int oneSort = 1;
        while (oneSort <= 10) {
            System.out.print(oneSort + " ");
            oneSort++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        //Задача 3
        int yPopulation = 12_000_000;
        float yBirthRate = 0.017f;
        float yDeathRate = 0.008f;
        int year = 0;
        while (year <= 10) {
            yPopulation = (int) (yPopulation + yPopulation * (yBirthRate - yDeathRate));
            System.out.println("Год " + year + ": численность населения составляет " + yPopulation);
            year++;
        }

        //Задача 4
        int vasiliyDeposit = 15_000;
        int vasiliyCapital = 0;
        int vasiliySum = 12_000_000;
        int vasiliySumMonth = 0;
        while (vasiliyCapital <= vasiliySum) {
            vasiliyDeposit += vasiliyDeposit*7/100;
            vasiliyCapital += vasiliyDeposit;
            vasiliySumMonth++;
            System.out.println("В месяц " + vasiliySumMonth + " накопления составляют " + vasiliyCapital + " рублей.");
        }

        //Задача 5
        vasiliyDeposit = 15_000;
        vasiliyCapital = 0;
        vasiliySumMonth = 0;
        while (vasiliyCapital <= vasiliySum) {
            vasiliyDeposit += vasiliyDeposit*7/100;
            vasiliyCapital += vasiliyDeposit;
            vasiliySumMonth++;
            if (vasiliySumMonth % 6 == 0) {
                System.out.println("В месяц " + vasiliySumMonth + " (кратный 6) накопления составляют " + vasiliyCapital + " рублей.");
            }
        }

        //Задача 6
        vasiliyDeposit = 15_000;
        vasiliyCapital = 0;
        vasiliySumMonth = 0;
        int vasiliyCapitalDuration = 9 * 12;    // Василий будет копить деньги 9 лет
        int vasiliyYear = 1;
        while (vasiliySumMonth <= vasiliyCapitalDuration) {
            vasiliyDeposit += vasiliyDeposit*7/100;
            vasiliyCapital += vasiliyDeposit;
            vasiliySumMonth++;
            if (vasiliySumMonth % 6 == 0) {
                System.out.println("В месяц " + vasiliySumMonth + " (год " + vasiliyYear + ") " + " накопления составляют " + vasiliyCapital + " рублей.");
            }
            if (vasiliySumMonth % 12 == 0) {
                vasiliyYear++;
            }
        }

        //Задача 7
        int firstFriday = 3;
        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }

        //Задача 8
        int lastTwoHundredsYears = 2024 - 200;
        int nextOneHundredsYears = 2025 + 100;
        for (int i = lastTwoHundredsYears; i <= nextOneHundredsYears; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}