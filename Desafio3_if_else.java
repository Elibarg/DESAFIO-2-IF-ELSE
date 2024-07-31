import javax.swing.JOptionPane;

public class Desafio3_if_else 
{
    public static void main(String[] args) 
    {
        int salPorHora = 20;
        int horaTrabalhada = 0;
        int salario = 0;
    
        horaTrabalhada = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas horas você trabalhou: "));
        if(horaTrabalhada > 160)
        {

        }else
        {
            salario = salPorHora * horaTrabalhada;
            salario = Math.round(salario);
        }
        JOptionPane.showMessageDialog(null, "Seu salario: "+salario);
    }
}
