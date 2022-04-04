package Unit2.JavaCore.Worker;


@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
