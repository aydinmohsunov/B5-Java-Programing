package day07_relational_operators;

public class Cheese {
    public static void main (String[] args){
        String typeOfPizza = "Cheese";
        int numOfSlices = 20;
        int numOfPeople = 6;

        // calculate how many full slices each person will get
        // 20 / 6 = 3
        int fullSliceForEachPerson = numOfSlices / numOfPeople;


        //Calculate how many slices are left over
        // 20 - ( 6 * 3) = 20 - 18 = 2
        int leftOverSlices1 = numOfSlices - (numOfPeople * fullSliceForEachPerson);

        // 20 % 6 = 2
        int leftOverSlices2 = numOfSlices % numOfPeople;

        String result = "We bought " + typeOfPizza + " pizza. It has " + numOfSlices + " slices and we are " + numOfPeople + " people. Each of us will get " + fullSliceForEachPerson + " full slices and there will be " + leftOverSlices2 + " slices left over.";

        System.out.println(result);
        System.out.println(result);

    }
}