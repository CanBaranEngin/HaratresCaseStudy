public class MergeStringCase {
    public static String createMergeStrings(String letterFirst,String letterSecond){
        if(letterFirst.length()>1 && letterSecond.length()>1 && letterFirst.length()<10 && letterSecond.length()<10){
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < letterFirst.length(); i++) {
                result.append(letterFirst.charAt(i));
                result.append(letterSecond.charAt(i));

            }
            return result.toString();
        }
        else
            throw new RuntimeException("Please enter valid string value!! ");
    }


}
