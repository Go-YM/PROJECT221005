package Quiz_5;

import java.util.Scanner;

class Won2Dollar
{
    Scanner scanner = new Scanner(System.in);

    private double money;
    private double dollar;
    private double rate;

    public Won2Dollar(int rate)
    {
        this.rate = rate;
    }

    public void run()
    {
        System.out.print("원을 입력하세요>>");
        money = scanner.nextDouble();
        dollar = money/rate;
        System.out.println("변환 결과 : "+dollar+"달러입니다.");
    }
}

public class Quiz5_3
{
    public static void main(String[] args)
    {
        Won2Dollar toDollar = new Won2Dollar(1200);
        toDollar.run();
    }
}
