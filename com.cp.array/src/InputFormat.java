import java.util.*;
public class InputFormat {
    public static boolean isInteger(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static boolean isStringBoolean(String str){
        return "True".equalsIgnoreCase(str) || "False".equalsIgnoreCase(str);
    }
    public static boolean isString(String str){
        return str.chars().allMatch(Character::isAlphabetic);
    }
    public static boolean isLong(String str){
        try{
            Long.parseLong(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static boolean isDouble(String str){
        try{
            Double.parseDouble(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String input = scr.next();
        if(isInteger(input)){
            System.out.println("Integer");
            int int_input = Integer.parseInt(input);
            System.out.println(int_input);
        } else if (isStringBoolean(input)) {
            System.out.println("Boolean");
            boolean bool_input=Boolean.parseBoolean(input);
            System.out.println(bool_input);
        }else if (isString(input)) {
            System.out.println("String");
        }else if (isLong(input)) {
            System.out.println("Long");
        }else if (isDouble(input)) {
            System.out.println("Double");
        }
    }
}
