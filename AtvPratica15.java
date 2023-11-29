import javax.swing.*;

class Atvpratica15 {
    public static void main(String[] entrada) {
        int n1, n2, multi = 1;
        char op=0;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: \n"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: \n"));
        op = (JOptionPane.showInputDialog("Digite 1 para multiplicacao\nDigite 2 para a produtoria")).charAt(0);

        switch (op) {
            case '1':{ 
                if(n1>0 && n2>0){
                    multi = n1 * n2;
                    msg = msg + "O produto de " + n1+ " X " +n2 + " = " +multi+"\n\n";
                }
                break;
            }
            case '2':{
                for(int i=1; i<=n2; i=i+1){
                    multi = multi*n1;
                }
                msg = msg + "produtoria de " +n1 +", " +n2+ " vezes eh: " + multi + "\n\n";
                break;
            }
            default: JOptionPane.showMessageDialog(null, "Opcao invalida, calculos não realizados");
        }
        if (op >= '1' && op <= '2') {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
    
}
