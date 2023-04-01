public class Test {
    public int a = 5;

    public String printA() {
        String updatedValue = String.format("\"---<%d>---\"%n", a);
        System.out.println(updatedValue);
        return updatedValue;
    }
}
