package school.lemon.changerequest.java.hw7;

public interface Filter<T> {
    /**
     * Identified if element matches some condition
     *
     * @param element element to match condition
     * @return true, if element matches some condition, otherwise - false
     */
    boolean match(T element);
}
