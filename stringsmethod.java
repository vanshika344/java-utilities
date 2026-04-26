public class stringsmethod {
    public static void main(String[] args) {
        String name = "vanshi";
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
    
        String nonTrimmedString = "   vanshi   ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

    System.out.println(name.substring(1, 4));
        System.out.println(name.replace("vanshi", "banshi"));
        System.out.println(name.startsWith("van"));
        System.out.println(name.endsWith("shi"));
        System.out.println(name.charAt(2));
        String modifiedName="vannshi";
        System.out.println(name.equals(modifiedName));
        System.out.println(name.indexOf("n"));
        System.out.println(name.lastIndexOf("n"));
        System.out.println(name.equals("hedue"));
        System.out.println(name.equalsIgnoreCase("vanshi"));
        // escape sequence
        System.out.println("I am escape sequence \"double quote\" ");
   // \n is used for new line
        System.out.println("I am escape sequence \\n new line");
        System.out.println("I am escape sequence \\t tab");
   
    }

}
