//using abstraction

//abstract class Machine{
//    public abstract void code();
//}
//
//class Laptop extends Machine{
//    public void code(){
//        System.out.println("Code -> Complie -> Run             ||  in Laptop");
//    }
//}
//
//class Desktop extends Machine{
//    public void code(){
//        System.out.println("Code -> Complie -> Run             ||  in Desktop");
//    }
//}

//using interface

interface Machine{
    void code();
}

class Laptop implements Machine{
    public void code(){
        System.out.println("Code -> Complie -> Run             ||  in Laptop");
    }
}

class Desktop implements Machine{
    public void code(){
        System.out.println("Code -> Complie -> Run             ||  in Desktop");
    }
}

class Developer{
    public void devApp(Machine machine){
        machine.code();
    }
}



public class interfaceExample {
    public static void main(String[] args) {

        Machine lap = new Laptop();
        Machine desk = new Desktop();

       Developer srish = new Developer();
       srish.devApp(lap);
       srish.devApp(desk);

    }
}
