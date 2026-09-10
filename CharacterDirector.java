public class CharacterDirector {
    public Character constructWarrior(CharacterBuilder builder){
        return builder
                .name("Рекрут")
                .hp(120)
                .mana(0)
                .weapon("Деревянный меч")
                .build();
    }
    public Character constructMagician(CharacterBuilder builder){
        return builder
                .name("Ученик")
                .hp(60)
                .mana(120)
                .weapon("Деревянная палочка")
                .build();
    }
}
