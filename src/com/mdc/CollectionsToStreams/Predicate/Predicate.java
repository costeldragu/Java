package com.mdc.CollectionsToStreams.Predicate;

@FunctionalInterface
public interface Predicate<T> {
    static <U> Predicate<U> isEqualaTo(U string) {
        return s -> s.equals(string);
    }

    /**
     * Functional method test
     * @param t
     * @return
     */
    public boolean test(T t);

    /**
     *
     * @param other
     * @return
     */
    public default Predicate<T> and(Predicate<T> other) {
        return t -> test(t) && other.test(t);
    }

    public default Predicate<T> or(Predicate<T> other) {
        return t -> test(t) || other.test(t);
    }
}
