import java.util.Scanner;
public class Person {
    public static String personInfo(String fName, String lName, String city, String pNum) {
        String call = "Зателефонувати громадянину " + fName + " " + lName +" із міста " + city + " можна за номером " + pNum;
        return call;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fNames[] = new String[]{"Роман", "Джозеф", "Орест"};
        String lNames[] = new String[]{"Михневич", "Джостар", "Лютий"};
        String cities[] = new String[]{"Житомир", "Нью-Йорк", "Тернопіль"};
        String pNums[] = new String[]{"0968584758", "152625456", "0663259863"};
        for (int i = 0; i < 3; i++) {
            System.out.println(personInfo(fNames[i], lNames[i], cities[i], pNums[i]));
        }
    }
}
