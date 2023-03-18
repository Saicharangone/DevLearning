public class child extends parent {

    public child(){
        System.out.println("Im in constructor of child class");
    }

    public void bikes(){

        System.out.println("Im in bike method of child class");
    }
    public  void bikes(int a){
        System.out.println("Im in bike method of child class, Bike name: "+ a);
    }
    public  void bikes(int a, String model){
        System.out.println("Im in bike method of child class, Bike name: "+ a + model);
    }
//    public void cars(){
//        System.out.println("Cars method of child class");
//
//    }


}
