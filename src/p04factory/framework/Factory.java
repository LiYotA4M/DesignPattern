package p04factory.framework;

public abstract class Factory {
    public final Product create(String owner, String idType) {
        Product p = createProduct(owner, idType);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner, String idType);
    protected abstract void registerProduct(Product product);
}
