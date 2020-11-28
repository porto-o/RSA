package examenjimmy;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;

public class DataL implements Serializable {

    private ArrayList<DataRec> Data;
    private File file = new File();

    public DataL() {
        Data = new ArrayList<>();
    }

    public void addRSA(int tamPrimo, BigInteger n, BigInteger q, BigInteger p, BigInteger totient, BigInteger e, BigInteger d, String emisor) {
        Data = file.leer();
        DataRec obj = new DataRec(tamPrimo, n, q, p, totient, e, d, emisor);
        Data.add(obj);
    }

    public void addCifrado(int tamPrimo, BigInteger n, BigInteger q, BigInteger p, BigInteger totient, BigInteger e, BigInteger d, String emisor, int mensaje, BigInteger[] msjCifrado) {
        Data = file.leerCif();
        DataRec obj = new DataRec(tamPrimo, n, q, p, totient, e, d, emisor);
        obj.setMensaje(mensaje);
        obj.setMsjCifrado(msjCifrado);
        Data.set(0, obj);
    }

    public void getDatosArch() {
        Data = file.leer();
        if (Data.isEmpty()) {
        } else {
            System.out.println("No se we xD");
        }
    }

    public void getDescifrado() {
        Data = file.leerCif();
    }

    public ArrayList<DataRec> getListaDatos() {
        return Data;
    }

    public void setListaDatos(ArrayList<DataRec> ListaDatos) {
        this.Data = Data;
    }

    public File getObjArchivo() {
        return file;
    }

    public void setObjArchivo(File objArchivo) {
        this.file = objArchivo;
    }

    public void grabarRSA() {
        getObjArchivo().serializar(Data);
    }

    public void grabarCifrado() {
        getObjArchivo().serializarCif(Data);
    }

}
