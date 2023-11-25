public class Dice {

    public int getValue() {
        return value;
    }

    private int value;

    public void roll(){
        this.value = (int)(Math.random() * 6) + 1;
    }


}
