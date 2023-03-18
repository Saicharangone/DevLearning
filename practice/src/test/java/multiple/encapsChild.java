package multiple;

public class encapsChild extends encaps{

    public static void main(String[] args) {
        encapsChild e=new encapsChild();
        System.out.println(e.getA());
        e.setA(10);

        System.out.println(e.getA());
    }

}
