package checkdependency;



public class Call {
    public static void main(String[] args){
        AddCalc addcalc = new AddCalc();
        Integer result = addcalc.calc(10,5);
        System.out.println(result);
    }
}
