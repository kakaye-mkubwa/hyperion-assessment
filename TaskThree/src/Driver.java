import java.util.HashMap;
import java.util.Stack;

public class Driver {
    static int placesCount;
    static HashMap<Integer,String> voiceNumbersHashMap = new HashMap<>();
    static HashMap<Integer,String> voicePlacesHashMap = new HashMap<>();
    static Stack<ThreePlaceGroup> placeGroupStack = new Stack<>();

    static char[] inputCharArray;

    public static void main(String[] args) {
        long input = 1128435347;
//        long input = 100;
//        long input = Long.parseLong(args[0]);

        Driver driver = new Driver();

        if (!driver.validateInput(input)){
            System.out.println("Number must be between 0 to 999,999,999,999,999.");
            return;
        }

        inputCharArray = String.valueOf(input).toCharArray();
        placesCount = inputCharArray.length;

        driver.loadVoiceNumbersHashMap();
        driver.loadPlaceValueVoicesHashMap();

        driver.loadPlaceGroupStack();

        System.out.println(driver.voiceNumber());
    }

    /**
     * Populate the placeGroupStack with values from the numberDigitsStack accordingly
     */
    public void loadPlaceGroupStack(){
        ThreePlaceGroup threePlaceGroup = new ThreePlaceGroup();

        for (int i = inputCharArray.length-1; i >= 0; i--) {
            if(!threePlaceGroup.addPlaceDigit(Character.getNumericValue(inputCharArray[i]))){
                placeGroupStack.add(threePlaceGroup);
                threePlaceGroup = new ThreePlaceGroup(Character.getNumericValue(inputCharArray[i]));
            }
        }

        if (!threePlaceGroup.isEmpty()){
            placeGroupStack.add(threePlaceGroup);

        }
    }

    /**
     * Load the verbal equivalent of each word
     *      For example: 8 -> eight
     *                  9 -> nine
     * The various edge case scenarios are stored, i.e
     *      verbal equivalents of 0-10, 11-19, and
     *      numbers divisible by ten that are less than 100
     *      For example:
     *          20,30,40,50, e.t.c.
     */
    public void loadVoiceNumbersHashMap(){
        voiceNumbersHashMap.put(0,"");
        voiceNumbersHashMap.put(1,"one");
        voiceNumbersHashMap.put(2,"two");
        voiceNumbersHashMap.put(3,"three");
        voiceNumbersHashMap.put(4,"four");
        voiceNumbersHashMap.put(5,"five");
        voiceNumbersHashMap.put(6,"six");
        voiceNumbersHashMap.put(7,"seven");
        voiceNumbersHashMap.put(8,"eight");
        voiceNumbersHashMap.put(9,"nine");
        voiceNumbersHashMap.put(10,"ten");

        voiceNumbersHashMap.put(11,"eleven");
        voiceNumbersHashMap.put(12,"twelve");
        voiceNumbersHashMap.put(13,"thirteen");
        voiceNumbersHashMap.put(14,"fourteen");
        voiceNumbersHashMap.put(15,"fifteen");
        voiceNumbersHashMap.put(16,"sixteen");
        voiceNumbersHashMap.put(17,"seventeen");
        voiceNumbersHashMap.put(18,"eighteen");
        voiceNumbersHashMap.put(19,"nineteen");

        voiceNumbersHashMap.put(20,"twenty");
        voiceNumbersHashMap.put(30,"thirty");
        voiceNumbersHashMap.put(40,"forty");
        voiceNumbersHashMap.put(50,"fifty");
        voiceNumbersHashMap.put(60,"sixty");
        voiceNumbersHashMap.put(70,"seventy");
        voiceNumbersHashMap.put(80,"eighty");
        voiceNumbersHashMap.put(90,"ninety");
    }

    /**
     * Load the voiceHashMap with respective values
     */
    public void loadPlaceValueVoicesHashMap(){
        voicePlacesHashMap.put(0,".");
        voicePlacesHashMap.put(1,"thousand,");
        voicePlacesHashMap.put(2,"million,");
        voicePlacesHashMap.put(3,"billion,");
        voicePlacesHashMap.put(4,"trillion,");
    }

    /**
     * Returns a verbal equivalent of the numbers present in the placeGroupStack:Stack
     * @return String
     */
    public String voiceNumber(){
        StringBuilder stringBuilder = new StringBuilder();

        int i = placeGroupStack.size()-1;
        while (!placeGroupStack.isEmpty()){
            stringBuilder.append(placeGroupStack.pop().voiceNumber())
                    .append(" ")
                    .append(voicePlacesHashMap.get(i))
                    .append(" ");
            i--;
        }

        String completeWord = stringBuilder.toString();
        String output = completeWord.substring(0,1).toUpperCase()+completeWord.substring(1,completeWord.length()-3);
        return output+".";
    }

    /**
     * Validate user input whether it meets required criteria
     * @param input : number provided by the user
     * @return boolean
     *          if the input is not within the required range, false is returned,
     *          otherwise, true is returned
     */
    public boolean validateInput(long input){
        return input >= 0 && input <= 999999999999999L;
    }
}