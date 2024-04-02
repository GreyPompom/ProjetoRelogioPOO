/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import javax.swing.JOptionPane;
import model.Relogio;
/**
 *
 * @author emely
 */
public class Principal {
    public static void main(String[] args){
          String entrada = JOptionPane.showInputDialog("Digite HH:MM:SS");
          String partes []= entrada.split(":");
          
          int hora =Integer.parseInt(partes[0]) ;
          int minuto =Integer.parseInt(partes[1]) ;
          int segundo =Integer.parseInt(partes[2]) ;
          
          Relogio relogio = new Relogio(hora, minuto, segundo);
          
         
           int tempoEmSegundos = relogio.hourToSecound();
          JOptionPane.showMessageDialog(null, "Tempo em segundos: "+tempoEmSegundos);
          
          relogio.incrementSecound();
          JOptionPane.showMessageDialog(null, "Tempo após adicionar 1 segundo: "+relogio.ToString());
          
          relogio.incrementMinuto();
          JOptionPane.showMessageDialog(null, "Tempo após adicionar 1 minuto: "+relogio.ToString());
          
          relogio.incrementHour();
          JOptionPane.showMessageDialog(null, "Tempo após adicionar 1 hora: "+relogio.ToString());
          
          relogio.decrementSecound();
          JOptionPane.showMessageDialog(null, "Tempo após tirar 1 segundo: "+relogio.ToString());
          
          relogio.decrementMinuto();
          JOptionPane.showMessageDialog(null, "Tempo após tirar 1 minuto: "+relogio.ToString());
          
          relogio.decrementHour();
          JOptionPane.showMessageDialog(null, "Tempo após tirar 1 hora: "+relogio.ToString());
          
      }
}
