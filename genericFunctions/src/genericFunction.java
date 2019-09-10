import java.lang.*;

public class genericFunction<T> {
    private T element1;
    private T element2;
    private T finalVar;

    public genericFunction(){
        element1 = null;
        element2 = null;
    }

    public genericFunction(T element1, T element2){
        this.element1 = element1;
        this.element2 = element2;
        genericAdder(element1, element2);
    }

    /*
        Adds two elements of any type
        Must be the same type element
     */
    public void genericAdder(T element1, T element2) {

        if (element1 == null || element2 == null) {
            finalVar = null;
        }

        if (element1 instanceof Double) {
            finalVar = (T) new Double( ((Double) element1).doubleValue() + ((Double) element2).doubleValue());
        } else if (element1 instanceof Integer) {
            finalVar = (T) new Integer( ((Integer) element1).intValue() + ((Integer) element2).intValue());
        } else {
            throw new IllegalArgumentException("Type " + element1.getClass() + " is not supported by this method");
        }
    }

    public String toString(){
        return "element 1 + element 2 is " + finalVar;
    }
}
