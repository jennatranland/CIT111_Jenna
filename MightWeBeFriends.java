
package Friends;
import java.util.Scanner;
// author Jenna
public class MightWeBeFriends {
        public static void main(String[] notUsed) {
        int compatScore = 0;
        final int threshold = 60;
        int userResponse = 0;
        Scanner inputScanner;
        boolean passedThreshold = false;
        
        inputScanner = new Scanner(System.in);
        //Introduction 
        System.out.println("Hello, I'm Jenna Tran; do you think we could be friends?");
        System.out.println("Let's find out.");
        //Question 1: Video Games
        System.out.println("Q1: Do you like video games?");
        System.out.println("1. Yes.");
        System.out.println("2. No."); 
        userResponse = inputScanner.nextInt();
        if(userResponse == 1){
             // Yes
            compatScore = compatScore + 15;
            System.out.println("Great, me too!");
        } else if (userResponse == 2){
            // No
            compatScore = compatScore + 10;
            System.out.println("No big deal, I'm sure we have other similarities.");
        }   
        //Question 2: What Video Games? Press 1 if Q1 was No
        System.out.println("Q2: What is your favorite video game?");
        System.out.println("1. Next Question!");
        System.out.println("2. League of Legends");
        System.out.println("3. Valorant");
        System.out.println("4. Minecraft");
        System.out.println("5. World of Warcraft");
        System.out.println("6. Animal Crossing");
        System.out.println("7. Other");
        System.out.println("8. Sorry, I play console only!");
        userResponse = inputScanner.nextInt();
        if(userResponse == 1){
            //Going to next Question if answered No for first Question
            compatScore = compatScore + 0;
        }else if (userResponse == 2){
            //League of Legends
            compatScore = compatScore + 30;
            System.out.println("League is my favorite game too!");
        }else if (userResponse == 3){
            //Valorant
            compatScore = compatScore + 25;
            System.out.println("Valorant is very fun to play.");
        }else if (userResponse == 4){
            //Minecraft
            compatScore = compatScore + 20;
            System.out.println("Minecraft is an easy game to play together.");
        }else if (userResponse == 5){
            //World of Warcraft
            compatScore = compatScore + 15;
            System.out.println("WoW is not my favorite, but we can play it together.");
        }else if (userResponse == 6){
            //Animal Crossing
            compatScore = compatScore + 10;
            System.out.println("Animal Crossing is a great game, but we can't do much together on it.");
        }else if (userResponse == 7){
            //Other
            compatScore = compatScore + 5;
            System.out.println("Well, I hope it's multiplayer.");
        }else if (userResponse == 8){
            //Console Player
            compatScore = compatScore + 0;
            System.out.println("I don't play on a console, but maybe we can find something else in common.");
        }
        //Question 3: Favorite Subject
        System.out.println("Q3: What is your favorite school subject?");
        System.out.println("1. Math");
        System.out.println("2. Science");
        System.out.println("3. Social Studies");
        System.out.println("4. Computer Science");
        System.out.println("5. English/Writing");
        System.out.println("6. Liberal Arts");
        userResponse = inputScanner.nextInt();
        if(userResponse == 1){
            //Math
            compatScore = compatScore + 30;
            System.out.println("Math is my favorite subject, because I'm a math major.");
        }else if (userResponse == 2){
            //Science
            compatScore = compatScore + 25;
            System.out.println("Great! Science is an interesting class!");
        }else if (userResponse == 3){
            //Social Studies
            compatScore = compatScore + 20;
            System.out.println("Not my favorite, but history is very interesting.");
        }else if (userResponse == 4){
            //Computer Science
            compatScore = compatScore + 15;
            System.out.println("I get it, you are probably majoring computer science.");
        }else if (userResponse == 5){
            //English/Writing
            compatScore = compatScore + 10;
            System.out.println("I'm not too interested in what this subject has to offer.");
        }else if (userResponse == 6){
            //Liberal Arts
            compatScore = compatScore + 5;
            System.out.println("These classes are really boring to me, sorry.");
        }
        //Question 4: Fast Food
        System.out.println("Q4: What is your favorite fast food place?");
        System.out.println("1. Chick-Fil-A");
        System.out.println("2. Taco Bell");
        System.out.println("3. McDonald's");
        System.out.println("4. Pizza");
        System.out.println("5. Arby's");
        System.out.println("6. Burger King");
        System.out.println("7. Other");
        userResponse = inputScanner.nextInt();
        if (userResponse == 1){
            //Chick-Fil-A
            compatScore = compatScore + 30;
            System.out.println("Yum! They have great chicken with great sauces.");
        }else if (userResponse == 2){
            //Taco Bell
            compatScore = compatScore + 25;
            System.out.println("Awesome, I can't wait for the potatoes to come back.");
        }else if (userResponse == 3){
            //McDonald's
            compatScore = compatScore + 20;
            System.out.println("I only ever eat the fish sandwich or chicken nuggets.");
        }else if (userResponse == 4){
            //Pizza
            compatScore = compatScore + 15;
            System.out.println("Pizza is pizza regardless of the place, it's usually always delicious.");
        }else if (userResponse == 5){
            //Arby's
            compatScore = compatScore + 10;
            System.out.println("I've only had their curly fries, but boy are they good.");
        }else if (userResponse == 6){
            //Burger King
            compatScore = compatScore + 5;
            System.out.println("Their food is okay, but their curly fries are bomb.");
        }else if (userResponse == 7){
            //Other
            compatScore = compatScore + 1;
            System.out.println("It's alright, food doesn't define friendship.");  
        }
        //Question 5: My Dog
        System.out.println("Q5. Is my dog cute? He is a black pomeranian.");
        System.out.println("1. Yes, he is adorable!");
        System.out.println("2. No, he is a rat.");
        userResponse = inputScanner.nextInt();
        if (userResponse == 1){
            //Yes
            compatScore = compatScore + 30;
            System.out.println("Yeah I already know that he is.");
        }else if (userResponse == 2){
            //No
            compatScore = compatScore - 1000;
        }
        //Adding Up Points
        System.out.println("Will we be friends?");
        if(compatScore >= threshold){
            passedThreshold = true;
            System.out.println("Yay, you have made a new friend!");
        }else {
            System.out.println("I guess we can't be friends, sorry!");
        }
        System.out.println("Score: " + compatScore);
        }
}
