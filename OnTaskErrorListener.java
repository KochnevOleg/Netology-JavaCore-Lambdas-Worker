package Unit2.JavaCore.Lambdas.Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError (String errorMessage);
}
