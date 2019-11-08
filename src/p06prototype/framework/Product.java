package p06prototype.framework;

public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
