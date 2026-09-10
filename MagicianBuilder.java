public class MagicianBuilder implements CharacterBuilder{
    private String name = "Безымянный волшебник";
    private int hp = 70;
    private int mana = 100;
    private String weapon = "Палочка";
    @Override
    public CharacterBuilder name(String name){
        this.name = name;
        return this;
    }
    @Override
    public CharacterBuilder hp(int hp){
        if(hp <= 0) throw new IllegalArgumentException("Ошибка: Ваш персонаж мертв.");
        this.hp = hp;
        return this;
    }
    @Override
    public CharacterBuilder mana(int mana){
        this.mana = mana;
        return this;
    }
    @Override
    public CharacterBuilder weapon(String weapon){
        if(weapon == null || weapon.trim().isEmpty()) throw new IllegalArgumentException(
            "Ошибка: Отсутствует оружие");
        this.weapon = weapon;
        return this;
    }
    @Override
    public Character build(){
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Ошибка: Имя персонажа не может быть пустым!");
        }
        if(hp > 100){
            throw new IllegalStateException("Ошибка: Максимальное количество у  XP у мага - 100.");
        }
        if(mana < 50){
            throw new IllegalStateException("Ошибка: Для колдовства нужно минимум 50 маны");
        }
        if(weapon.toLowerCase().contains("меч") || weapon.toLowerCase().contains("топор")){
            throw new IllegalStateException("Ошибка: Маг не использует оружие: " + weapon);
        }
        return new Character(name, Role.MAGICIAN, hp, mana, weapon);
    }
}