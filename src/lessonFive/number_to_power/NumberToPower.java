package lessonFive.number_to_power;

public class NumberToPower {
    public int power(int number, int power) {
        if (power==1) return number;
        return (power % 2 == 0 ? 1 : number) * power(number * number, power / 2);
    }
}
