package MKR;

public class LoggerModule implements ISubscriber {
    @Override
    public void update(String message) {
        System.out.println("[Logger] Записано в лог подію: " + message);
    }
}