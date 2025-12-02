package MKR;

public class Main {
    public static void main(String[] args) {
        // 1. Створення компонентів
        LoggerModule logger = new LoggerModule();
        UIModule ui = new UIModule();
        AuthModule auth = new AuthModule();

        // 2. Підписка компонентів через Singleton
        EventManager manager = EventManager.getInstance();
        manager.subscribe(logger);
        manager.subscribe(ui);
        manager.subscribe(auth);

        // 3. Демонстрація роботи
        // Сценарій: Успішний вхід
        auth.loginUser("Oleg");

        // Сценарій: Помилка
        auth.triggerError();
    }
}