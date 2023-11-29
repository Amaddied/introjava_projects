import javax.swing.*;

class AtvPratica16 {
    public static void soma(int vet[]) {
        int s=0;
        for (int i=0; i<vet.length;i++){
            s =s+vet[i];
        }
        JOptionPane.showMessageDialog(null, "A somatoria eh "+s);
    }
    public static int produto(int vet[]){
        int p =1;
        for(int i=0; i<vet.length;i++){
            p = p*vet[i];
        }
        return p;
    }
    public static void main(String entrada[]) {
        int r, vetor[] = new int[5];
        for(int i=0; i<vetor.length;i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para a posicao " + i+ "\n"));
        }
        soma(vetor);
        r = produto(vetor);
        JOptionPane.showMessageDialog(null, "A produtoria eh " + r);
        System.exit(0);
    }
    
}
