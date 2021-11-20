import java.util.Locale;
import entities.Character;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        int operator = 0;
        String[] menu = new String[] {
            "CREATE A CHARACTER",
            "USE EXISTING CHARACTER",
            "LEAVE"
        };
    
         do {
            operator = JOptionPane.showOptionDialog(null, "Choose what you want to do: ", "MENU SELECTION", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);
            if (operator == 0) {
                int confirmOperator = 0;
                String[] confirm = new String[] {"YES", "NO"};
                confirmOperator = JOptionPane.showOptionDialog(null, "Deseja criar um novo personagem?", "CONFIRM YOUR DECISION", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, confirm, confirm[0]);
                if(confirmOperator == 0) {
                    String name = JOptionPane.showInputDialog(null, "Defina o nome do seu personagem", "CHARACTER MAKER", JOptionPane.QUESTION_MESSAGE);
                    String classe = JOptionPane.showInputDialog("Classe: ");
                    String breed = JOptionPane.showInputDialog("Breed: ");
                    Character character = new Character(name, classe, breed); 
                    int level = Integer.parseInt(JOptionPane.showInputDialog("Qual level quer que seu personagem seja?"));
                    character.levelUp(level);
                    character.showStats();
                }
            }

        }while(operator != 2);


    }
}
