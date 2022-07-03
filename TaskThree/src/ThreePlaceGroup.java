/**
 * Class that defines the grouping of utmost 3 numbers as they are usually
 * grouped in writing of numerical values.
 */
public class ThreePlaceGroup {
    private int first //this is the first digit of a number from the right when represented in writing
            ,second //middle number
            ,third ; //left-most digit in a written number

    /**
     * Constructor to initialise the values of the various parameters
     */
    public ThreePlaceGroup() {
        this.first = -1;
        this.second = -1;
        this.third = -1;
    }

    public ThreePlaceGroup(int first) {
        this.first = first;
        this.second = -1;
        this.third = -1;
    }

    public ThreePlaceGroup(int first, int second) {
        this.first = first;
        this.second = second;
        this.third = -1;
    }

    public ThreePlaceGroup(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Add a digit to this object
     * If the object is already full, false is returned, otherwise, the digit is
     * added accordingly and true returned.
     *
     * @param x : digit to be added
     * @return boolean
     */
    public boolean addPlaceDigit(int x){
        if (first == -1){
            this.first = x;
            return true;
        }else if(second == -1){
            this.second = x;
            return true;
        }else if (third == -1){
            this.third = x;
            return true;
        }else{
            return false;
        }
    }

    /**
     * Check whether the object is empty
     * This is done by checking whether the value of the first digit
     * has been defined.
     * If defined, false is returned, otherwise, true is returned
     * @return
     */
    public boolean isEmpty(){
        return first == -1;
    }

    /**
     * Get first
     * @return
     */
    public int getFirst() {
        return first;
    }

    /**
     * Set first
     * @param first
     */
    public void setFirst(int first) {
        this.first = first;
    }

    /**
     * Get second
     * @return
     */
    public int getSecond() {
        return second;
    }

    /**
     * Set second
     * @param second
     */
    public void setSecond(int second) {
        this.second = second;
    }

    /**
     * Get third
     * @return
     */
    public int getThird() {
        return third;
    }

    /**
     * Set third
     * @param third
     */
    public void setThird(int third) {
        this.third = third;
    }

    /**
     * Return a verbal representation of this object
     * For example, One hundred and twenty eight in case of 128
     *              Eight hundred and thirty two in case of 832
     * @return String: the verbal equivalent of this number
     */
    public String voiceNumber(){
        if (this.third == -1 && this.second == -1){
            return Driver.voiceNumbersHashMap.get(first);
        }else if (third == -1){
            return tensPlaceString();
        }else{
            return Driver.voiceNumbersHashMap.get(third) + " hundred" +
                    ((second != 0 || first != 0) ? " and ": "")+
                    tensPlaceString();
        }
    }

    /**
     * Return a verbal representation of the value at the tens place in this object
     *      For example: Seventy two in case of 72
     *                  Seventeen in case of 17
     * @return String
     */
    public String tensPlaceString(){
        if (Driver.voiceNumbersHashMap.containsKey((second*10)+first)){
            return Driver.voiceNumbersHashMap.get((second*10)+first);
        }
        return Driver.voiceNumbersHashMap.get(second*10) + " " + Driver.voiceNumbersHashMap.get(first);
    }

    /**
     * Return a string representation of this object
     * @return
     */
    @Override
    public String toString() {
        return "ThreePlaceGroup{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
