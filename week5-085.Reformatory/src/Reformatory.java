
public class Reformatory {

    private int weightMeasuredCount = 0;

    public int weight(Person person) {
        // returns the weight of the parameter
        weightMeasuredCount++;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured(){
        return weightMeasuredCount;
    }
}
