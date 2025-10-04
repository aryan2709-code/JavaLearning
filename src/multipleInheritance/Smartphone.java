package multipleInheritance;

// Error: A class in Java cannot extend more than one class.
// Java supports:
//  - Single inheritance (one class extends another)
//  - Multi-level inheritance (class → subclass → sub-subclass)
//  - Hierarchical inheritance (multiple classes extend the same parent)
//
// But Java does NOT support multiple inheritance with classes.
// This restriction is to avoid ambiguity (e.g., the Diamond Problem).

public class Smartphone extends Camera {

}
