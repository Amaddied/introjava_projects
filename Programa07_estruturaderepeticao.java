import javax.swing.*;

class Programa07 {
    public static void main(String entrada[]) {
        int tabuada;
        char op = 0;
        String msg = "";
        //entrada de dados
        tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para visualizar a sua tabuada"));
        op = (JOptionPane.showInputDialog("Escolha o número para a estrutura de repetição: \n1-for \n2-while \n3-do/while")).charAt(0);
        //processamento
        
        switch (op) {
            case '1':{
                msg = msg+ "Tabuada do " + tabuada + " pelo for: \n \n";
                for(int i=1; i<=10; i=i+1){
                    msg = msg + tabuada + " x " + i + " = " + tabuada*i +"\n";
                }
                
                break;
            }
            case '2':{
                msg = msg+ "Tabuada do " + tabuada + " pelo while: \n \n";
                int i = 1;
                while(i<=10){
                    msg = msg + tabuada + " x " + i + " = " + tabuada*i +"\n";
                    i=i+1;
                }
                break;
            }
            case '3':{
                msg = msg+ "Tabuada do " + tabuada + " pelo do/while: \n \n";
                int i=1;
                do{
                    msg = msg + tabuada + " x " + i + " = " + tabuada*i +"\n";
                    i=i+1;    
                } while(i<=10);
                break;
            }
            default: JOptionPane.showMessageDialog(null, "Opcao invalida, calculos não realizados");
        }
        //saida de resultados
        if (op >= '1' && op <= '2') {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
}
    