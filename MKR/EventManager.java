package MKR;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    // Статичне поле для зберігання єдиного екземпляра
    private static EventManager instance;

    // Список підписників
    private List<ISubscriber> subscribers;

    // Приватний конструктор: забороняємо створення об'єктів через new
    private EventManager() {
        subscribers = new ArrayList<>();
    }

    // Публічний статичний метод доступу (Lazy Initialization)
    public static EventManager getInstance() {
        if (instance == null) {
            instance = new EventManager();
        }
        return instance;
    }

    // Підписатися на події
    public void subscribe(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Відписатися
    public void unsubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Розсилка повідомлень (Notify)
    public void notify(String message) {
        for (ISubscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}