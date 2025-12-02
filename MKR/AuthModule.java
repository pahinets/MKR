package MKR;

public class AuthModule implements ISubscriber {
    @Override
    public void update(String message) {
        // Auth може реагувати на інші події, якщо потрібно
    }

    // Метод входу, який запускає ланцюжок подій
    public void loginUser(String username) {
        System.out.println("\n--- [AuthModule] Спроба входу користувача " + username + " ---");
        System.out.println("[AuthModule] Користувач авторизувався.");

        // Звертаємось до Singleton і повідомляємо всіх
        EventManager.getInstance().notify("user_login");
    }

    // Метод імітації помилки
    public void triggerError() {
        System.out.println("\n--- [AuthModule] Виявлено проблему безпеки ---");
        EventManager.getInstance().notify("access_error");
    }
}