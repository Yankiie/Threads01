package Main;
import Controller.Principal;
public class chamarTrhead {
    public static void main(String[] args){
        for (int idThread = 0 ; idThread < 5 ; idThread++){
            Thread Threadid = new Principal(idThread);
            Threadid.start();
        }
    }
}
