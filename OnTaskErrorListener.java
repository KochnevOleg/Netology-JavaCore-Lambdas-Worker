package Unit2.JavaCore.Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError (String errorMessage);
}
