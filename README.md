Home work 7 tasks.
===============
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
 
 2\.a Improvements
 -------------
 Improve COW Iterator, so that it should obtain copy of initial collection only when some modification
 functionality is going to be called.