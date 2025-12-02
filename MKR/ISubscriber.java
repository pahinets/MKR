package MKR;

/**
 * ПАТЕРН: Observer (Спостерігач)
 * Інтерфейс для всіх компонентів, які хочуть отримувати сповіщення.
 */
public interface ISubscriber {
    void update(String message);
}
