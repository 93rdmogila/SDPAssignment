public enum Role{
    WARRIOR("Воин"),
    MAGICIAN("Маг");

    private final String displayedRole;
    Role(String displayedRole){
        this.displayedRole = displayedRole;
    }
    public String getRole(){
        return displayedRole;
    }
}