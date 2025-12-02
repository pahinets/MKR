package MKR;

import java.util.ArrayList;
import java.util.List;

/**
 * ПАТЕРН: Singleton (Одинак)
 * Клас відповідає за управління підписками та розсилку повідомлень.
 */
public class EventManager {
    
    // --- Початок реалізації Singleton ---
    private static EventManager instance;

    // Приватний конструктор: забороняємо створення через new
    private EventManager() {
        subscribers = new ArrayList<>();
    }

    // Глобальна точка доступу
    public static EventManager getInstance() {
        if (instance == null) {
            instance = new EventManager();
        }
        return instance;
    }
    // --- Кінець реалізації Singleton ---

    
    // --- Початок реалізації Observer (Subject) ---
    private List<ISubscriber> subscribers;

    public void subscribe(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notify(String message) {
        for (ISubscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
    // --- Кінець реалізації Observer ---
}
