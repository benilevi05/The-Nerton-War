public class BattleCard implements CardInterface {
    public String name;
    public int hitponits;
    public int attack;
    public int defence;
    public int manaCost;

    public BattleCard(){
        this.name = name;
        this.hitponits = hitponits;
        this.attack = attack;
        this.defence = defence;
        this.manaCost = manaCost;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void setHitpoints(int hitponits){
        this.hitponits = hitponits;
    }

    @Override
    public void setAttack(int attack){
        this.attack = attack;
    }

    @Override
    public void setDefence(int defence){
        this.defence = defence;
    }

    @Override
    public void setManaCost(int manaCost){
        this.manaCost = manaCost;
    }
}
