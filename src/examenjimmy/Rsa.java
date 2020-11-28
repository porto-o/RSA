package examenjimmy;

import java.math.BigInteger;
import java.util.*;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Rsa extends Thread {

    //variables
    int primSize;
    BigInteger n, q, p;
    BigInteger totient;
    BigInteger e, d;
    public JTextField JTFp, JTFq, JTFn, JTFphi, JTFd, JTFe;
    public JTextArea JTAmensaje;

    public Rsa() {
    }

    public Rsa(int tamanoPrimo, JTextField JTFp, JTextField JTFq, JTextField JTFn, JTextField JTFphi, JTextField JTFd, JTextField JTFe, JTextArea JTAmensaje) {
        this.primSize = tamanoPrimo;
        this.JTFp = JTFp;
        this.JTFq = JTFq;
        this.JTFn = JTFn;
        this.JTFphi = JTFphi;
        this.JTFd = JTFd;
        this.JTFe = JTFe;
        this.JTAmensaje = JTAmensaje;
    }

    @Override
    public void run() {
        p = new BigInteger(primSize, 10, new Random());
        do {
            q = new BigInteger(primSize, 10, new Random());
        } while (q.compareTo(p) == 0);
        System.out.println(p + "\n" + q);

        this.JTFp.setText(p.toString());
        this.JTFq.setText(q.toString());

        n = p.multiply(q);
        totient = p.subtract(BigInteger.valueOf(1));
        totient = totient.multiply(q.subtract(BigInteger.valueOf(1)));
        do {
            e = new BigInteger(2 * primSize, new Random());
        } while (e.compareTo(totient) != -1 || e.gcd(totient).compareTo(BigInteger.valueOf(1)) != 0);

        d = e.modInverse(totient);

        System.out.println("holi");
        this.JTFd.setText(d.toString());
        this.JTFe.setText(e.toString());
        this.JTFn.setText(n.toString());
        this.JTFphi.setText(totient.toString());

    }

    public BigInteger[] encriptar(String mensaje, BigInteger e, BigInteger n) {

        int i;
        byte[] temp = new byte[1];
        byte[] digitos = mensaje.getBytes();
        BigInteger[] bigdigitos = new BigInteger[digitos.length];
        for (i = 0; i < bigdigitos.length; i++) {

            temp[0] = digitos[i];
            bigdigitos[i] = new BigInteger(temp);

        }
        BigInteger[] encriptado = new BigInteger[bigdigitos.length];

        for (i = 0; i < bigdigitos.length; i++) {

            encriptado[i] = bigdigitos[i].modPow(e, n);

        }

        return encriptado;

    }

    public String desencriptado(BigInteger[] encriptado) {

        BigInteger[] desencriptar = new BigInteger[encriptado.length];

        for (int i = 0; i < desencriptar.length; i++) {

            desencriptar[i] = encriptado[i].modPow(d, n);

        }

        char[] charArray = new char[desencriptar.length];

        for (int i = 0; i < charArray.length; i++) {

            charArray[i] = (char) (desencriptar[i].intValue());

        }

        return (new String(charArray));

    }

    public int getPrimSize() {
        return primSize;
    }

    public BigInteger getN() {
        return n;
    }

    public BigInteger getQ() {
        return q;
    }

    public BigInteger getP() {
        return p;
    }

    public BigInteger getTotient() {
        return totient;
    }

    public BigInteger getE() {
        return e;
    }

    public BigInteger getD() {
        return d;
    }

    public void setPrimSize(int primSize) {
        this.primSize = primSize;
    }

    public void setN(BigInteger n) {
        this.n = n;
    }

    public void setQ(BigInteger q) {
        this.q = q;
    }

    public void setP(BigInteger p) {
        this.p = p;
    }

    public void setTotient(BigInteger totient) {
        this.totient = totient;
    }

    public void setE(BigInteger e) {
        this.e = e;
    }

    public void setD(BigInteger d) {
        this.d = d;
    }

}
