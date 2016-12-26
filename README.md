Collections. Practice task 1
===============

[![Join the chat at https://gitter.im/changerequest/collections.pr1](https://badges.gitter.im/changerequest/collections.pr1.svg)](https://gitter.im/changerequest/collections.pr1?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
1\. CollectionUtils
---------------
Implement `CollectionUtils` utility class, that implements following useful functions:

```
union
intersection
unionWithoutDuplicate
intersectionWithoutDuplicate
difference
```

Please check `CollectionUtils` interface for additional info.

Also create your own unit tests to for functionality you have implemented.

2\. Copy-on-write iterator
--------------
Implement copy-on-write iterator and also check that `ExtendedList` now supports 
fail-fast schema for concurrent modification.

Any method that modifies collection, should now throw `ConcurrentModificationException` if collection is going
 to be modified concurrently, for example is this case:
```
List<String> strings = new ArrayList<>();
strings.add("a");
Iterator<String> iterator = strings.iterator();
strings.remove(0);
iterator.next();
```
Also create your own unit tests to for functionality you have implemented.
 
 2\.a Improvements
--------------
 Improve COW Iterator, so that it should obtain copy of initial collection only when some modification
 functionality is going to be called.
