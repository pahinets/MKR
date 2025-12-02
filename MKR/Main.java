package MKR;

public class Main {
    public static void main(String[] args) {
        // 1. Ініціалізація компонентів
        LoggerModule logger = new LoggerModule();
        UIModule ui = new UIModule();
        AuthModule auth = new AuthModule();

        // 2. Отримання єдиного екземпляра менеджера (Singleton)
        EventManager manager = EventManager.getInstance();

        // 3. Підписка компонентів (Observer logic)
        manager.subscribe(logger);
        manager.subscribe(ui);
        manager.subscribe(auth);

        // 4. Демонстрація роботи системи
        auth.loginUser("Student_MKR");
        auth.triggerError();
    }
}
