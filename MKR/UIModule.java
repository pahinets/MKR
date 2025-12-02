package MKR;

public class UIModule implements ISubscriber {
    @Override
    public void update(String message) {
        switch (message) {
            case "user_login":
                System.out.println("[UI] >> UserInterface: Ласкаво просимо в систему!");
                break;
            case "access_error":
                System.out.println("[UI] >> UserInterface: УВАГА! Доступ заборонено.");
                break;
            default:
                System.out.println("[UI] >> Отримано повідомлення: " + message);
        }
    }
}
