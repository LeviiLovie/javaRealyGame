public class Main {
    public static void main(String[] args) {
        MainStart();
    }
    
    static void MainStart() {
        Start start = new Start();
        start.Hello();
    }
}



class Start {
    public void Hello() {
        System.out.println("Hello, in the limun game!");
    }
}