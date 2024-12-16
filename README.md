# Groovy Null Check and Collection Combination Issue

This repository demonstrates a potential issue in Groovy related to null checks and the handling of collections.  The `bug.groovy` file shows the issue, and `bugSolution.groovy` offers a solution.

The problem arises from Groovy's dynamic typing. When a null check is performed before operating on a collection, the expected behavior might not occur, especially when the null check is combined with a method or operation that accepts a collection as an argument.