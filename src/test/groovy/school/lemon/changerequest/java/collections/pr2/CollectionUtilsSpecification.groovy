package school.lemon.changerequest.java.collections.pr2

import spock.lang.Specification
import spock.lang.Unroll

class CollectionUtilsSpecification extends Specification {

    @Unroll
    def "difference should return #expectedResult for #a and #b"() {
        expect:
        CollectionUtils.difference(a, b) == expectedResult
        where:
        a               | b               || expectedResult
        []              | []              || []
        [null]          | [null]          || []
        [null]          | [null, null]    || [null]
        ['a']           | ['b']           || ['a', 'b']
        ['1', '3']      | ['3', '4']      || ['1', '4']
        [1, 2, 3, 4, 5] | [2, 3, 4, 1, 5] || []
    }

    @Unroll
    def "difference should throw IllegalArgumentException if any argument is null. a=#a, b=#b"() {
        when:
        CollectionUtils.difference(a, b)
        then:
        thrown(IllegalArgumentException)
        where:
        a    | b
        null | []
        []   | null
    }

    @Unroll
    def "intersectionWithoutDuplicate should return #expectedResult for #a and #b"() {
        expect:
        CollectionUtils.intersectionWithoutDuplicate(a, b) == expectedResult
        where:
        a                    | b                    || expectedResult
        []                   | []                   || [] as Set
        [null]               | [null]               || [null] as Set
        [null]               | [null, null]         || [null] as Set
        ['a']                | ['b']                || [] as Set
        ['1', '3']           | ['3', '4']           || ['3'] as Set
        [1, 2, 3, 4, 5]      | [2, 3, 4, 1, 5]      || [1, 2, 3, 4, 5] as Set
        ['1', '3', '3', '3'] | ['3', '4', '3', '3'] || ['3'] as Set
    }

    @Unroll
    def "intersectionWithoutDuplicate should throw IllegalArgumentException if any argument is null. a=#a, b=#b"() {
        when:
        CollectionUtils.intersectionWithoutDuplicate(a, b)
        then:
        thrown(IllegalArgumentException)
        where:
        a    | b
        null | []
        []   | null
    }

    @Unroll
    def "unionWithoutDuplicate should return #expectedResult for #a and #b"() {
        expect:
        CollectionUtils.unionWithoutDuplicate(a, b) == expectedResult
        where:
        a            | b          || expectedResult
        []           | []         || [] as Set
        ['a']        | ['b']      || ['a', 'b'] as Set
        ['1', '3']   | ['2', '4'] || ['1', '3', '2', '4'] as Set
        ['a']        | []         || ['a'] as Set
        []           | ['a']      || ['a'] as Set
        [null]       | []         || [null] as Set
        [null]       | [null]     || [null] as Set
        [1, 2, 3]    | [null]     || [1, 2, 3, null] as Set
        [1, 2, 3, 4] | [1, 3, 4]  || [1, 2, 3, 4] as Set
    }

    @Unroll
    def "unionWithoutDuplicate should throw IllegalArgumentException if any argument is null. a=#a, b=#b"() {
        when:
        CollectionUtils.union(a, b)
        then:
        thrown(IllegalArgumentException)
        where:
        a    | b
        null | []
        []   | null
    }

    @Unroll
    def "intersection should return #expectedResult for #a and #b"() {
        expect:
        CollectionUtils.intersection(a, b) == expectedResult
        where:
        a               | b               || expectedResult
        []              | []              || []
        [null]          | [null]          || [null]
        [null]          | [null, null]    || [null]
        ['a']           | ['b']           || []
        ['1', '3']      | ['3', '4']      || ['3']
        [1, 2, 3, 4, 5] | [2, 3, 4, 1, 5] || [1, 2, 3, 4, 5]
    }

    @Unroll
    def "intersection should throw IllegalArgumentException if any argument is null. a=#a, b=#b"() {
        when:
        CollectionUtils.intersection(a, b)
        then:
        thrown(IllegalArgumentException)
        where:
        a    | b
        null | []
        []   | null
    }

    @Unroll
    def "union should return #expectedResult for #a and #b"() {
        expect:
        CollectionUtils.union(a, b) == expectedResult
        where:
        a            | b          || expectedResult
        []           | []         || []
        ['a']        | ['b']      || ['a', 'b']
        ['1', '2']   | ['3', '4'] || ['1', '2', '3', '4']
        ['a']        | []         || ['a']
        []           | ['a']      || ['a']
        [null]       | []         || [null]
        [null]       | [null]     || [null, null]
        [null, 1, 2] | [3]        || [null, 1, 2, 3]
    }

    @Unroll
    def "unit should throw IllegalArgumentException if any argument is null. a=#a, b=#b"() {
        when:
        CollectionUtils.union(a, b)
        then:
        thrown(IllegalArgumentException)
        where:
        a    | b
        null | []
        []   | null
    }
}