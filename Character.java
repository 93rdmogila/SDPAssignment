public record Character(
    String name,
    Role role,
    int hp,
    int mana,
    String weapon
){
    @Override
    public String toString(){
        return role.getRole() + " " + name + " " + " [HP: " + hp + ", Mana: "
        + mana + ", Оружая: " + weapon + "]";
    }
}