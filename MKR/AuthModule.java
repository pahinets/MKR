package MKR;

public class AuthModule implements ISubscriber {
    
    // Реалізація методу підписника (якщо модуль має реагувати на події інших)
    @Override
    public void update(String message) {
        // Наприклад, при помилці можна блокувати ввід
    }

    // Бізнес-логіка: Успішний вхід
    public void loginUser(String username) {
        System.out.println("\n--- [Auth] Користувач " + username + " намагається увійти ---");
        System.out.println("[Auth] Авторизація успішна.");
        
        // Виклик Singleton для сповіщення інших
        EventManager.getInstance().notify("user_login");
    }

    // Бізнес-логіка: Помилка
    public void triggerError() {
        System.out.println("\n--- [Auth] Детекція підозрілої активності ---");
        
        // Виклик Singleton для сповіщення інших
        EventManager.getInstance().notify("access_error");
    }
}
