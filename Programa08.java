import javax.swing.*;

class Programa08 { 
    public static void main(String[] entrada) {
        int n1,n2, soma=0;
        char op = 0;
        String msg = "";
    
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número inteiro/n"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número inteiro /n"));
        op = (JOptionPane.showInputDialog("Digite 1 para adição\n2 para somatório")).charAt(0);

        switch (op) {
            case '1':{
                if(n1 % 2 == 0 && n2 % 2 == 0 ){
                soma = n1+n2;
                msg = msg + "soma de " +n1+ " por " + n2+ " = "+soma+"\n\n";
                }
                break;
            }
            case '2':{
                for(int i=1;i<=n2; i=i+1){
                    soma = soma + n1;
                }
                msg = msg + "somatoria de " +n1 +", " +n2+ " vezes eh: " + soma + "\n\n";
                break;
            }
    
        default:JOptionPane.showMessageDialog(null, "Opcao invalida, calculos não realizados");
            break;
        }    
    
        if (op >= '1' && op <= '2') {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
    
}
