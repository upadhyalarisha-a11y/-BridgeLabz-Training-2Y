public class Strings {
    public static void main(String[] args) {
        String name ="  Unnati    ";
        System.out.println(name);
        name = name.trim();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.concat(" Agarwal"));
        System.out.println(name.toCharArray());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        for(int i:name.toCharArray()){
            System.out.println(i);
        }
    }
}