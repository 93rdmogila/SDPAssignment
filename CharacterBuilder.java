public interface CharacterBuilder{
    CharacterBuilder name(String name);
    CharacterBuilder hp(int hp);
    CharacterBuilder mana(int mana);
    CharacterBuilder weapon(String weapon);

    Character build();
}