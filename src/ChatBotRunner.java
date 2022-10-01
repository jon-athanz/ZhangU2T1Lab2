public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot ChatBot1 = new ChatBot("Johnny", 7, 45);
        ChatBot1.greeting("Jonathan");
        System.out.println("");

        System.out.println("Hi! I'm doing good today.");
        System.out.println("How old are you? I'm 14 years old.");
        System.out.println("Oh wow, I am " + ChatBot1.age(14) + " years older than you.");
        System.out.println("");

        System.out.println("Would you happen to know the weather for today?");
        System.out.println("");

        ChatBot1.weather();
        System.out.println("");

        System.out.println("HAHAHAHAHA, your funny");
        System.out.println("");

        ChatBot1.hobby();
        System.out.println("");

        System.out.println("Wow! I like to play guitar, play games, and play tennis.");
        System.out.println("Also, What's your favorite number? Mines is the number 15.");
        System.out.println("");

        ChatBot1.favoriteNumber(15);
        System.out.println("");

        System.out.println("Oh wow, that's interesting!");
        System.out.println("Do u know how much 17 feet is in meters?");
        System.out.println("Yes, 17 feet is equal to about " + (int) ChatBot1.convertFeetToMeters(17) + " meters.");
        System.out.println("");

        System.out.println("Oh I see, what is the sum of those three numbers?");
        System.out.println("The sum would be " + ChatBot1.addNumbers(7, 15, 5));
        System.out.println("");

        System.out.println("Oh Wow! Well I think it's time for me to go.");
        System.out.println("Oh well, " + ChatBot1.goodbye());

    }
}
