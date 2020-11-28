package examenjimmy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author PORTO
 */
public class File{

    ArrayList<DataRec> SavedData = new ArrayList<>();
    
    public ArrayList<DataRec> leer() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("RsaSaved.txt"));
            SavedData = (ArrayList<DataRec>) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Inicio...");
        }
        return SavedData;
    }
    
    public ArrayList leerCif() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Cipher.txt"));
            SavedData = (ArrayList) in.readObject();
            in.close();
        } catch (Exception e) {
            System.out.println("Waiting...");
        }
        return SavedData;
    }
    
    void serializar(ArrayList<DataRec> listaSeriar) {
        try {
            FileOutputStream out = new FileOutputStream("RsaSaved.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(listaSeriar);
            objOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    void serializarCif(ArrayList<DataRec> listaSeriar) {
        try {
            FileOutputStream out = new FileOutputStream("Cipher.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(listaSeriar);
            objOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
