import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Desk {
    public enum Function{WHEEL,MOTION,GLASS,DRAWER};
    final Set<Function> functions;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Function> functions = EnumSet.noneOf(Function.class);

        public T addFunction(Function function) {
            functions.add(Objects.requireNonNull(function));
            return self();
        }

        abstract Desk build();

        protected abstract T self();
    }

    Desk(Builder<?> builder) {
        functions = builder.functions.clone();
    }


}
