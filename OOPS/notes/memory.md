# Stack vs Heap Memory in Java

## **1. Stack Memory** 🗂️
- **Stores**:
  - Function calls (methods, constructors) 📞
  - Local variables (primitives: `int`, `boolean`, `char`, etc.) 📌
  - Reference variables (pointing to objects in heap) 🎯
- **Structure**: **LIFO (Last In, First Out)** 🏗️
- **Speed**: **Fast** ⏩ (direct memory access)
- **Lifespan**: Exists **only during method execution** ⏳
- **Automatic Cleanup**: Stack frames are **removed immediately** after function execution 🚀
- **Analogy**: Like a **to-do list**, where the last task added is completed first ✅

## **2. Heap Memory** 🏦
- **Stores**:
  - Objects (`new` keyword) 🛠️
  - Class instances 🌱
- **Speed**: **Slower** compared to stack ⏳ (dynamic allocation & garbage collection)
- **Lifespan**: Objects remain **until garbage collector removes them** 🗑️
- **Garbage Collection**: JVM removes unreferenced objects automatically 🧹
- **Analogy**: Like a **warehouse**, where items stay until they are removed 🏢

---

## **3. Stack vs Heap: Key Differences** 📊

| Feature        | Stack Memory 📂       | Heap Memory 🏦        |
|---------------|----------------|----------------|
| **Stores**       | Methods, local variables | Objects, class instances |
| **Access Speed**  | 🚀 Fast (LIFO)   | 🐢 Slower (Garbage Collection) |
| **Lifespan**  | Function scope  | Exists until GC removes it |
| **Allocation**  | Static (fixed size)  | Dynamic (grows as needed) |
| **Cleanup**  | Automatic (frame removed after function execution) | Garbage Collector handles it |
| **Usage** | Temporary storage for function execution | Stores long-lived objects |

---

## **4. Example: Understanding Stack & Heap** 🏗️
```java
class Demo {
    int x = 10; // Stored in heap (inside object)
    
    void show() {
        int y = 20; // Stored in stack (local variable)
    }

    public static void main(String[] args) {
        Demo obj = new Demo(); // 'obj' is in stack, object is in heap
        obj.show(); // 'y' is created in stack when 'show()' runs
    }
}
```
### **Memory Allocation for `main()` Execution:**
- **Stack:** Stores `obj` (reference variable) & `y` (inside `show()` method)
- **Heap:** Stores `x = 10` (inside `obj`)

---

## **5. Key Takeaways** 🎯
- **Stack is faster** but limited in size 🏎️
- **Heap is slower** but used for long-term storage 📦
- **Primitive data types & method calls → Stack** 📂
- **Objects & class instances → Heap** 🏗️
- **Garbage Collector cleans up heap memory** 🗑️

---

💡 **Tip for Java Developers:**
- Use **stack for temporary storage** (method execution, local variables)
- Use **heap for objects** that should persist beyond a method call

---

