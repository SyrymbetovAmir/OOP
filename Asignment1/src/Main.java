package Asignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Phone iPhone = new Phone("14", "87075310037", 130.4f);
        Phone Samsung = new Phone("S21 super","87786167957");

        Phone.receiveCall("Amir");
        Phone.receiveCall("Amir", "102");
        System.out.println(iPhone.getNumber());
        System.out.println(Samsung.getNumber());

        Phone.sendMessage("12151212", "123131232");


//        Asignment1.Person
        Person Miras = new Person();
        Person Amir = new Person("Amir Syrymbetov", 18);
        Amir.talk();
        Miras.talk();
        Amir.move();

//        Asignment1.Matrix
        Matrix First = new Matrix();
        First.newMatrix(2,5);

//        Library Asignment1.Reader
        Reader PetrovVV = new Reader();
        PetrovVV.takeBook(3);
        PetrovVV.takeBook("Adventure Dictionary Encyclopedia");
        PetrovVV.returnBook("Adventure Dictionary Encyclopedia");
        PetrovVV.returnBook(3);

    }
}
