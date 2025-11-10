package Lamda-Expression;

public class SmartHome {
    package LamdaExpression;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.*;

public class SmartHome {
    public static void main(String[] args) {
        // Consumer example: different light behaviors based on trigger
        Consumer<String> lightAction = trigger -> {
            switch (trigger.toLowerCase()) {
                case "motion":
                    System.out.println("[motion] Turning ON hallway lights.");
                    break;
                case "time":
                    System.out.println("[time] Dimming lights for evening mode.");
                    break;
                case "voice":
                    System.out.println("[voice] Activating living room lights.");
                    break;
                default:
                    System.out.println("[default] No matching trigger.");
            }
        };

        lightAction.accept("motion");
        lightAction.accept("time");
        lightAction.accept("voice");
        lightAction.accept("unknown");

        // Predicate example (could be reused for notifications)
        Predicate<String> isNight = s -> s.equalsIgnoreCase("time");
        System.out.println("Is 'time' a night trigger? " + isNight.test("time"));
    }
}

}
