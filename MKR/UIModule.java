package MKR;

public class UIModule implements ISubscriber {
    @Override
    public void update(String message) {
        if (message.equals("user_login")) {
            System.out.println("[UI] UserInterface: Ласкаво просимо!");
        } else if (message.equals("access_error")) {
            System.out.println("[UI] UserInterface: Увага! Помилка доступу.");
        } else {
            System.out.println("[UI] Отримано системне сповіщення: " + message);
        }
    }
}