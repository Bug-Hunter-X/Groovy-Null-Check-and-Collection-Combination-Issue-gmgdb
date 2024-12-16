```groovy
class MyClass {
    def myMethod(arg1, arg2) {
        if (arg1 == null) {
            println "arg1 is null"
            return
        }
        if (arg1 instanceof Collection) {
            println arg1.sum() + arg2
        } else {
            println arg1 + arg2
        }
    }
}

MyClass myInstance = new MyClass()
myInstance.myMethod(null, 5)
myInstance.myMethod([1,2,3], 5)
```