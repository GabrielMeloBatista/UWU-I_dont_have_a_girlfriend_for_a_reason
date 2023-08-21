import javax.swing.*;

public class Main {
    static String nomeClasse;
    public static void main(String[] args) {
        Reflexao reflexao = new Reflexao();
        Class<?> cls;
        nomeClasse = JOptionPane.showInputDialog(null,"Digite o nome da classe (Avo, Pai ou Filho)");

        cls = Reflexao.getClass(nomeClasse);
        Reflexao.printAttributes(cls);
        Reflexao.printMethods(cls);
    }
}