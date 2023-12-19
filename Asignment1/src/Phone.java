package Asignment1;

import java.util.Arrays;

public class Phone {
    private String number;
    private float weight;
    private String model;

    public Phone(String model, String number, float weight) {
        setValues(model, number, weight);
        System.out.println(getValues());
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
        System.out.println(getValues());
    }

    public Phone() {

    }
    public void setValues(String model, String number, float weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public String getValues() {
        String info = "Asignment1.Phone model: " + this.model + ". Asignment1.Phone number: " + this.number + ". Asignment1.Phone weight: " + this.weight + ".";
        return info;
    }

    public static void receiveCall(String name) {
        System.out.println(name + " is ringing");
    }
    public static void receiveCall(String name, String number) {
        System.out.println(name + " is ringing. " + "Asignment1.Phone number: " + number);
    }

    public String getNumber() {
        return number;
    }

    public static void sendMessage(String... numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}