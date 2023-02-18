public class Example2 extends  Example{

    public Example2() {
        super();
        System.out.println("Example class constructor");
    }

    public void sing(){
        dance();
        play();
        System.out.println(name);
    }

    public void dance(){
        System.out.println("Lets dance");
    }
}
