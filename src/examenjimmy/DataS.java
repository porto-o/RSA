package examenjimmy;

import javax.swing.JTextField;
import javax.swing.JTextArea;

public class DataS {

    int tamano;
    public JTextField p, q, n, phi, d, e;
    public JTextArea message;

    public DataS(int size, JTextField p, JTextField q, JTextField n, JTextField phi, JTextField d, JTextField e, JTextArea message) {
        this.tamano = size;
        this.p = p;
        this.q = q;
        this.n = n;
        this.phi = phi;
        this.d = d;
        this.e = e;
        this.message = message;

        Rsa rsa = new Rsa(size, p, q, n, phi, d, e, message);
        rsa.start();

    }
}
