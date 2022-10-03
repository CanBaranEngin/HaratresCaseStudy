public class MergeStringCase {
    public static String createMergeStrings(String letterFirst,String letterSecond){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < letterFirst.length(); i++) {
            result.append(letterFirst.charAt(i));
            result.append(letterSecond.charAt(i));

        }
        return result.toString();
    }


}
