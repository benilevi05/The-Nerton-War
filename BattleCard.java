import javax.swing.*;
import java.awt.*;

public class BattleCard extends JPanel implements CardInterface {
    public String name;
    public String desc;
    public String imageLoc;
    public int hitponits;
    public int attack;    
    public int manaCost;
    public CardType cardType;
    public CardClass cardClass;
    enum CardType {
        LIGHTWEIGHT,
        HEAVYWEIGHT
    }
    enum CardClass {
        MELEE,
        RANGE,
        MAGE
    }

    public BattleCard(String name, String desc, int hitponits, int attack, CardType cardType, CardClass cardClass) {
        this.name = name;
        this.desc = desc;
        this.hitponits = hitponits;
        this.attack = attack;
        this.cardType = cardType;
        this.cardClass = cardClass;
        setManaCost();
        }

        public BattleCard(String name, String desc, String imageLoc, int hitponits, int attack, CardType cardType, CardClass cardClass) {
        this.name = name;
        this.desc = desc;
        this.imageLoc = imageLoc;
        this.hitponits = hitponits;
        this.attack = attack;
        this.cardType = cardType;
        this.cardClass = cardClass;
        setManaCost();
        }

    public JPanel panel(){
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Color purple = new Color(128, 100, 200);
        Color blue = new Color(20, 60, 160);
        panel.setBackground(purple);

        JLabel hpLabel = new JLabel("" + hitponits);
        JPanel hpPanel = new JPanel();
        hpPanel.setBackground(Color.RED);
        hpPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        hpPanel.add(hpLabel);
        JLabel manaCostLabel = new JLabel("" + manaCost, SwingConstants.RIGHT);
        JPanel manaCostPanel = new JPanel();
        manaCostPanel.setBackground(blue);
        manaCostPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        manaCostPanel.add(manaCostLabel);
        JLabel pngLabel = new JLabel();
        if (imageLoc != null) {
            System.out.println("Not null");
            ImageIcon icon = new ImageIcon(imageLoc);
            pngLabel.setIcon(icon);
        } else {
            System.out.println("Null");
            pngLabel.setText(this.name + ".png");
        }
        JPanel pngPanel = new JPanel();
        pngPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pngPanel.add(pngLabel);
        JLabel attackLabel = new JLabel("" + attack);
        JPanel attackPanel = new JPanel();
        attackPanel.setBackground(Color.LIGHT_GRAY);
        attackPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        attackPanel.add(attackLabel);
        JLabel descLabel = new JLabel(desc);
        JPanel descPanel = new JPanel();
        descPanel.setBackground(Color.orange);
        descPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        descPanel.add(descLabel);

        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(hpPanel, c);
        c.gridx = 1;
        c.gridy = 0;
        panel.add(manaCostPanel, c);
        c.gridx = 0;
        c.gridy = 1;
        c.ipady = 40;
        c.gridwidth = 2;
        panel.add(pngPanel, c);
        c.gridx = 0;
        c.gridy = 2;
        c.ipady = 1;
        c.gridwidth = 1;
        panel.add(attackPanel, c);
        c.gridx = 0;
        c.gridy = 3;
        c.ipady = 20;
        c.gridwidth = 2;
        panel.add(descPanel, c);
        

        return panel;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setHitpoints(int hitponits) {
        this.hitponits = hitponits;
    }

    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public void setManaCost() {
        if(cardType == CardType.LIGHTWEIGHT) {
            manaCost = 1;
        } else {
            manaCost = 3;
        }
    }
}
