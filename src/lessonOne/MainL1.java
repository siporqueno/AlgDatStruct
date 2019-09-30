package lessonOne;

public class MainL1 {
    public static void main(String[] args) {
        Cat cOne = new Cat("Мурзик");
        Cat cTwo = new Cat("Мурзик");
        Cat cThree = new Cat("Васька");
        System.out.println(cOne.equals(cTwo) ? "Все одноименные коты равны" : "Нет, имя не делает котов равными");
        System.out.println(cOne.equals(cThree) ? "Имя не делает разницы" : "Разница в имени тебя выделяет и отличает!");
    }
}
