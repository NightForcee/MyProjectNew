/**
 * Создать класс, описывающий банкомат.
 * Набор купюр, находя
 * щихся в банкомате должен задаваться тремя
 * свойствами:
 * количеством купюр номиналом 20, 50 и 100. Сделать методы для
 * добавления денег в банкомат.
 * Сделать функцию, снимающую деньги, которая принимает сумму денег ,а возвращает булевое значение
 * - успешность выполнения операции.
 * При снятии денег функция должна распечатывать каким
 * количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами
 * -количеством купюр каждого номинала.
 *
 * @autour Slidenko Artem
 * @version Lesson4HomeWork
 */

package Lesson4HomeWork;

import java.util.Scanner;

public class ATM {
    int nominal20;
    int nominal50;
    int nominal100;
    int kollNominala20;
    int kollNominala50;
    int kollNominala100;
    int daetTolkoNominal20;

    public ATM(int kollNominala1, int kollNominala2, int kollNominala3) {
        this.kollNominala20 = kollNominala1;
        this.kollNominala50 = kollNominala2;
        this.kollNominala100 = kollNominala3;
    }

    public void addMoneyToATM(int add1, int add2, int add3) {
        nominal20 += add1;
        nominal50 += add2;
        nominal100 += add3;
    }

    public void addMoneyDo200(int sumOfMoney) {
        if (sumOfMoney <= 200 && sumOfMoney >= 20 && sumOfMoney % 10 == 0) {
            if (sumOfMoney % 20 == 0) {
                daetTolkoNominal20 = sumOfMoney / 20;
                kollNominala100 = sumOfMoney / 100;
                kollNominala20 = (sumOfMoney - kollNominala100 * 100) / 20;
//                System.out.println(daetTolkoNominal20 + "x20," + "\n" + kollNominala100 + "x100," + kollNominala20 + "x20");
            }
            if (sumOfMoney % 20 != 0 && sumOfMoney % 130 != 0 && sumOfMoney % 110 != 0 && sumOfMoney != 30) {
                kollNominala100 = sumOfMoney / 100;
                kollNominala50 = (sumOfMoney - kollNominala100 * 100) / 50;
                kollNominala20 = (sumOfMoney - kollNominala100 * 100 - kollNominala50 * 50) / 20;
                System.out.println("Доступный номинал : " + kollNominala100 + "x100," + kollNominala50 + "x50," + kollNominala20 + "x20");
                System.out.println("Ваша сумма : " + sumOfMoney + "\n" + "Вы выбрали номинал : " + kollNominala100 + "x100," + kollNominala50 + "x50," + kollNominala20 + "x20");
            }
            if (sumOfMoney % 130 == 0 || sumOfMoney == 30) {
                System.out.println("Введите другую сумму");
            }
            if (sumOfMoney % 110 == 0) {
                kollNominala50 = (sumOfMoney / 50) - 1;
                kollNominala20 = (sumOfMoney - kollNominala50 * 50) / 20;
                System.out.println(kollNominala50 + "x50," + kollNominala20 + "x20");
                System.out.println("Ваша сумма : " + sumOfMoney + "\n" + "Вы выбрали номинал : " + kollNominala50 + "x50," + kollNominala20 + "x20");
            }
        }
        if (sumOfMoney == 10) {
            System.out.println("Введите другую сумму");
        }
    }

    public void addMoneyMore200(int sumOfMoney) {
        if (sumOfMoney >= 210) {
            kollNominala100 = sumOfMoney / 100;
        }
        if (sumOfMoney - kollNominala100 * 100 == 10) {
            kollNominala50 = (sumOfMoney / 50) - 1;
            kollNominala20 = (sumOfMoney - kollNominala50 * 50) / 20;
            System.out.println(kollNominala50 + "x50," + kollNominala20 + "x20");
            System.out.println("Ваша сумма : " + sumOfMoney + "\n" + "Вы выбрали номинал : " + kollNominala50 + "x50," + kollNominala20 + "x20");
        }
        if (sumOfMoney % 20 == 0) {
            daetTolkoNominal20 = sumOfMoney / 20;
            kollNominala100 = sumOfMoney / 100;
            kollNominala20 = (sumOfMoney - kollNominala100 * 100) / 20;
//            System.out.println(daetTolkoNominal20 + "x20," + "\n" + kollNominala100 + "x100," + kollNominala20 + "x20");
        }
        if ((sumOfMoney - kollNominala100 * 100 != 30 && sumOfMoney - kollNominala100 * 100 != 10) && sumOfMoney % 20 != 0) {
            kollNominala100 = sumOfMoney / 100;
            kollNominala50 = (sumOfMoney - kollNominala100 * 100) / 50;
            kollNominala20 = (sumOfMoney - kollNominala100 * 100 - kollNominala50 * 50) / 20;
            System.out.println("Доступный номинал :" + kollNominala100 + "x100," + kollNominala50 + "x50," + kollNominala20 + "x20");
            System.out.println("Ваша сумма : " + sumOfMoney + "\n" + "Вы выбрали номинал : " + kollNominala100 + "x100," + kollNominala50 + "x50," + kollNominala20 + "x20");
        }
        if (sumOfMoney - kollNominala100 * 100 == 30) {
            System.out.println("Введите другую сумму");
        }
    }

    public void printMoneyToATM() {
        System.out.println("В банкомате было : " + "\n" + "Купюры номиналом 100 = " + nominal100 + "\n" + "Купюры номиналом 50 = " + nominal50 + "\n" + "Купюры номиналом 20 = " + nominal20);
        System.out.println("В банкомате осталось  : ");
        System.out.println("Купюры номиналом 100 = " + (nominal100 - kollNominala100));
        System.out.println("Купюры номиналом 50 = " + (nominal50 - kollNominala50));
        System.out.println("Купюры номиналом 20 = " + (nominal20 - kollNominala20 - daetTolkoNominal20));
    }


    public static void main(String[] args) {
        ATM atm = new ATM(0, 0, 0);
        atm.addMoneyToATM(100, 100, 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Приветствуем вас! Введите сумму, которую хотите получить :");
        int sumOfMoney = sc.nextInt();
        atm.addMoneyDo200(sumOfMoney);
        if (sumOfMoney <= 200 && sumOfMoney > 0) {
            if (sumOfMoney % 20 == 0) {
                System.out.println("Выберите доступный номинал: " + "\n" + "1) " + atm.daetTolkoNominal20 + "x20" + "\n" + "2) " + atm.kollNominala100 + "x100," + atm.kollNominala20 + "x20");
                int q = sc.nextInt();
                if (q == 1) {
                    System.out.println("Ваша сумма : " + sumOfMoney + "\n" + "Вы выбрали номинал : " + atm.daetTolkoNominal20 + "x20");
                } else {
                    System.out.println("Ваша сумма : " + sumOfMoney + "\n" + "Вы выбрали номинал : " + atm.kollNominala100 + "x100," + atm.kollNominala20 + "x20");
                }
            }
        } else if (sumOfMoney >= 210 && sumOfMoney <= 800 && sumOfMoney > 0) {
            atm.addMoneyMore200(sumOfMoney);
            if (sumOfMoney % 20 == 0) {
                System.out.println("Выберите доступный номинал: " + "\n" + "1) " + atm.daetTolkoNominal20 + "x20" + "\n" + "2) " + atm.kollNominala100 + "x100," + atm.kollNominala20 + "x20");
                int w = sc.nextInt();
                if (w == 1) {
                    System.out.println("Ваша сумма : " + sumOfMoney + "\n" + "Вы выбрали номинал : " + atm.daetTolkoNominal20 + "x20");
                } else {
                    System.out.println("Ваша сумма : " + sumOfMoney + "\n" + "Вы выбрали номинал : " + atm.kollNominala100 + "x100," + atm.kollNominala20 + "x20");
                }
            }
        } else System.out.println("Введите другую сумму");
    }
}