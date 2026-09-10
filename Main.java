public class Main {
    public static void main(String[] args) {
        CharacterDirector director = new CharacterDirector();

        System.out.println("=== 1. СОЗДАНИЕ ЧЕРЕЗ ДИРЕКТОРА ===");
        Character recruit = director.constructWarrior(new WarriorBuilder());
        System.out.println(recruit);

        Character apprentice = director.constructMagician(new MagicianBuilder());
        System.out.println(apprentice);

        System.out.println("\n=== 2. РУЧНАЯ СБОРКА ЧЕРЕЗ FLUENT API ===");
        Character customWarrior = new WarriorBuilder()
                .name("Конан")
                .hp(200)
                .mana(5)
                .weapon("Секира")
                .build();
        System.out.println(customWarrior);

        System.out.println("\n=== 3. ТЕСТИРОВАНИЕ ВАЛИДАЦИИ И ИСКЛЮЧЕНИЙ ===");
        try {
            System.out.println("Попытка установить отрицательное HP...");
            new WarriorBuilder().hp(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймали ошибку: " + e.getMessage());
        }

        try {
            System.out.println("Попытка дать воину посох...");
            new WarriorBuilder()
                    .name("Артур")
                    .weapon("Волшебный посох")
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Поймали ошибку: " + e.getMessage());
        }

        try {
            System.out.println("Попытка сделать мага с 10 маны...");
            new MagicianBuilder()
                    .name("Гэндальф")
                    .mana(10)
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Поймали ошибку: " + e.getMessage());
        }
    }
}