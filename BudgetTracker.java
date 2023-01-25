/* Что нужно нам?
 В принципе как ATM практически.
 То есть есть счёт.
 на него скидываются покупки - как правило добавляются.
 Можно закинуть денег. Но я бы не балансировал доход

 а просто считал расходы
 по группам

 в идеале мне бы хотелось, простенькую систему учёта, по группам. И правильный пересчёт валюты по указанному курсу.
 С фиксацией значений по курсу в точке расчёта.
  */


import java.util.Scanner;

public class BudgetTracker {
    int balance;

    public BudgetTracker() {
        balance = 0;
    }



        /* what capabilities?

            CRUD
                where to store it?
                    Database sqLite
                how to store it in memory?
                    object.  so we have BudgetTracker
                                            it can do CRUD
                                               and report

                                we have also record class. which contains fields
                                we have Database management class
                hot wo transfer to DB?


            report (different specifics)
            adjust Currency converter

         */

    public static void addRecord(int price, String item, String type) {



        // здесь нужно внедрить какое-то хранилище. Временное может быть HashMaps. Но нужно учить DB кажется.

    }



    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter bought item: ");
        String item = input.nextLine();
        System.out.println("Price? ");
        int price = input.nextInt();
        System.out.println("Type: ");
        String type = input.nextLine();

        Record record = new Record("Towel", 200, "House");
*/

        DbConnection.connect();


        // [DONE] connect SQLITE. OMG! I did it!
        //    we are connected hooray

        // learn how to store. And how DBPC works.

        // итого, для начала нужно подтянуть DB, чтобы хотя бы записывать значения
        // далее можно будет сделать конвертер валюты
        // Визуализация
        // Редактирование entries + удаление
        // Попробую сделать веб сервер Spring и сделать API
        // Перевод на Android
      
    }
}
