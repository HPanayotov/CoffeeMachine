import java.util.Scanner;

public class MakeCoffee {

    private static int water = 400;
    private static int milk = 540;
    private static int coffee_beans = 120;
    private static int cups = 9;
    private static int money = 550;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");

            String action =reader.next();

            switch (action) {
                case "remaining":
                    System.out.println(water + " " + "of water");
                    System.out.println(milk + " " + "of milk");
                    System.out.println(coffee_beans + " " + "of coffee beans");
                    System.out.println(cups + " " + "of disposable cups");
                    System.out.println("$" + money + " " + "of money");
                    break;

                case "fill":
                    System.out.print("Write how many ml of water do you want to add: ");
                    water += reader.nextInt();
                    System.out.print("Write how many ml of milk do you want to add: ");
                    milk += reader.nextInt();
                    System.out.print("Write how many grams of coffee beans do you want to add: ");
                    coffee_beans += reader.nextInt();
                    System.out.print("Write how many disposable cups of coffee do you want to add: ");
                    cups += reader.nextInt();
                    break;

                case "buy":
                    System.out.print("What do you want to bye? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");

                    String choice = reader.next();

                    switch (choice) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry,not enough water!");
                                break;
                            } else if (coffee_beans < 16) {
                                System.out.println("Sorry, not enough coffee beans");
                                break;
                            }
                            water = water - 250;
                            coffee_beans = coffee_beans - 16;
                            money = money + 4;
                            System.out.println("I have enough resources,making you a coffee!");
                            break;

                        case "2":
                            if (water < 350) {
                                System.out.println("Sorry,not enough water!");
                                break;
                            } else if (coffee_beans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            }
                            water = water - 350;
                            milk = milk - 75;
                            coffee_beans = coffee_beans - 20;
                            money = money + 7;
                            System.out.println("I have enough resources,making you a coffee!");
                            break;

                        case "3":
                            if (water < 200) {
                                System.out.println("Sorry,not enough water!");
                                break;
                            } else if (coffee_beans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            }
                            water = water - 200;
                            milk = milk - 100;
                            coffee_beans = coffee_beans - 12;
                            money = money + 6;
                            System.out.println("I have enough resources,making you a coffee!");
                            break;

                        case "back":
                            break;
                    }
                    break;

                case "take":
                    System.out.print("I gave you " + "$" + money);
                    money = 0;
                    break;

                case "exit":
                    return;
                default:
                    System.out.println("Unknown command");
                    break;
            }
            System.out.println();
        }
    }
}






