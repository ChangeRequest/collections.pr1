package school.lemon.changerequest.java.collections.pr1;

import java.util.Iterator;
import java.util.List;

public interface ExtendedList<E> extends List<E> {
    /**
     * Returns an iterator over the elements in this list in sequence, based on given filter object
     *
     * @param filter object to use in iterator
     * @return an iterator over the elements in this list sequence, based on given filter object
     * @throws IllegalArgumentException if filter is null
     */
    ConditionalIterator<E> conditionalIterator(Filter<E> filter) throws IllegalArgumentException;

    /**
     * Returns an iterator over the elements in this list, that supports copy-on-write schema
     *
     * @return an iterator over the elements in this list, that supports copy-on-write schema
     */
    Iterator<E> cowIterator();
}
