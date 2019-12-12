package composicao.enums;

import java.util.HashMap;
import java.util.Map;

public enum WorkerLevel {

	JUNIOR(1),
	MID_LEVEL(2),
	SENIOR(3);

	private int value;
	private static Map<Object, Object> map = new HashMap<>();
	
    private WorkerLevel(int value) {
        this.value = value;
    }

    static {
        for (WorkerLevel workerLevel : WorkerLevel.values()) {
            map.put(workerLevel.value, workerLevel);
        }
    }

    public static WorkerLevel valueOf(int workerLevel) {
        return (WorkerLevel) map.get(workerLevel);
    }

    public int getValue() {
        return value;
    }
	
}
