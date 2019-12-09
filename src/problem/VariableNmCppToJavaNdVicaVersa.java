package problem;

/**
 * Problem : Convert input string from "helloWorld" to "hello_world" and vica versa.
 */
public class VariableNmCppToJavaNdVicaVersa {

    public static void main(String[] args) {
        String[] inputArray = {"helloWorld", "hello_World", "Hello_World", "ThisIsASequence"};

        for (String i : inputArray) {
            String response = modifyString(i);
            System.out.println("Response-" + response);
        }
    }

    private static String modifyString(String input) {

        StringBuilder finalStr = new StringBuilder();
        if (input != null || !"".equals(input)) {
            if (containsCharacter(input, '_')) {
                String[] strArr = input.split("_");
                finalStr = new StringBuilder();
                if (strArr.length > 0) {
                    finalStr.append(strArr[0].replace(strArr[0].charAt(0),Character.toLowerCase(strArr[0].charAt(0))));
                    for (int i = 1; i < strArr.length; i++) {
                        finalStr.append(strArr[i].replace(strArr[i].charAt(0), Character.toUpperCase(strArr[i].charAt(0))));
                    }
                } else {
                    finalStr = new StringBuilder(input);
                }
            } else {
                finalStr = new StringBuilder();

                for (int i = 0; i < input.length(); i++) {
                    if (Character.isUpperCase(input.charAt(i))) {
                        if (i > 0) {
                            finalStr.append("_");
                        }
                        finalStr.append(Character.toLowerCase(input.charAt(i)));
                    } else {
                        finalStr.append(input.charAt(i));
                    }
                }
            }
        }
        return finalStr.toString();
    }

    private static boolean containsCharacter(String i, char c) {
        return i.contains(Character.toString(c));
    }
}
