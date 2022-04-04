package Unit2.JavaCore.Lambdas.Worker;


@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
