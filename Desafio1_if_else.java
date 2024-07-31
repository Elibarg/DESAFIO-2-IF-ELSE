import javax.swing.JOptionPane;

public class Desafio1_if_else 
{
    public static void main(String[] args) 
    {
        int idade = 0;
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a sua idade: "));
        if(idade < 18)
        {
            JOptionPane.showMessageDialog(null, "criança");
        } else if (idade == 18 || idade == 30)
        {
            JOptionPane.showMessageDialog(null, "jovem");
        }if (idade == 30 || idade == 60)
        {
            JOptionPane.showMessageDialog(null, "adulto");
        }else if (idade > 60)
        {
            JOptionPane.showMessageDialog(null, "idoso");
        }
    }
}