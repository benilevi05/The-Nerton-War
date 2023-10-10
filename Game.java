import java.awt.*;

import javax.swing.*;

class Game {
    void test(){
        SwingUtilities.invokeLater(() -> {
            //TEST 
            JFrame frame = new JFrame("The Nerton War");
            JPanel mainPanel = new JPanel(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            c.fill = GridBagConstraints.HORIZONTAL;
            c.weightx = 0.5;
            BattleCard wizard = new BattleCard("Wizard", "Handles magic like nobody does.", "WizardCard.png", 100, 100,
                BattleCard.CardType.LIGHTWEIGHT, BattleCard.CardClass.MAGE);
            c.gridx = 0;
            c.gridy = 0;
            mainPanel.add(wizard.panel(), c);

            BattleCard sorcerrer = new BattleCard("Sorcerrer", "Likes to throw fire", 75 , 150,
            BattleCard.CardType.HEAVYWEIGHT , BattleCard.CardClass.MAGE);
            c.gridx = 1;
            c.gridy = 0;
            mainPanel.add(sorcerrer.panel(), c);

            BattleCard bandit = new BattleCard("Bandit", "Steals stuff", 50 , 150,
            BattleCard.CardType.LIGHTWEIGHT , BattleCard.CardClass.MELEE);
            c.gridx = 0;
            c.gridy = 1;
            mainPanel.add(bandit.panel(), c);

            BattleCard archer = new BattleCard("Archer", "Arrow go brrrr", 100 , 100,
            BattleCard.CardType.LIGHTWEIGHT , BattleCard.CardClass.MELEE);
            c.gridx = 1;
            c.gridy = 1;
            mainPanel.add(archer.panel(), c);


            frame.add(mainPanel);
            frame.setSize(900, 600);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
    public static void main(String[] args) {
        new Game().test();
    }
}