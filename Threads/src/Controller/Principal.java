package Controller;

public class Principal extends Thread {
    private int idThread;

    public Principal(int idThread) {
    }

    public void Threadid(int idThread){
        this.idThread = idThread;

    }
    public void run(){
        int id = (int) getId();
        System.out.println(id);

    }
}
