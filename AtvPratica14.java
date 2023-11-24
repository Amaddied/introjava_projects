import javax.swing.*;

class AtvPratica14 {
    public static void main(String entrada[]) {
        int n1,n2,div;
        double pot;
        String msg = "";

        //entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
        //processamento
        div = (int)n1/(int)n2;
        pot = Math.pow(n1,n2);
        //saida de resultados
        msg = "divisao de "+ n1+ " por "+ n2+ " = "+div+ "\n" + " e a potencia de "+n1+"por "+n2+" é: "+pot;
        JOptionPane.showMessageDialog(null,msg);
        System.exit(0);
    }
    
}
