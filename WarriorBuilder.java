public class WarriorBuilder implements CharacterBuilder{
    private String name = "Безымянный Воин";
    private int hp = 150;
    private int mana = 0;
    private String weapon = "Меч";
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
        if(hp < 100){
            throw new IllegalStateException("Воин слишком слаб! Минимальное XP - 100.");
        }
        if(mana > 20){
            throw new IllegalStateException("Ошибка: Воин не может иметь больше 20 маны!");
        }
        if(weapon.toLowerCase().contains("палочка") || weapon.toLowerCase().contains("посох")){
            throw new IllegalStateException("Ошибка: Воин не использует магическое оружие: " + weapon);
        }
        return new Character(name, Role.WARRIOR, hp, mana, weapon);
    }
}