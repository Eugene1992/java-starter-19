package lessons.lesson_five.home_work;

/*
1. Счастливые билетики. Есть билеты с номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма первых
трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576. С помощью программы,
подсчитайте сколько счастливых билетов.
 */
public class LuckyTickets {
    public static void main(String[] args) {
        int b = 0;
        for (int i = 1001; i < 1000000; i++) {
            int i1 = i / 100000,
                    i2 = i / 10000 % 10,
                    i3 = i / 1000 % 10,
                    i4 = i / 100 % 10,
                    i5 = i / 10 % 10,
                    i6 = i % 10;
            if (i1 + i2 + i3 == i4 + i5 + i6) {
                System.out.printf("%d%d%d%d%d%d\n", i1, i2, i3, i4, i5, i6);
                b++;
            }
        }
        System.out.printf("Lucky Tickets is : %d amount", b);
    }
}
