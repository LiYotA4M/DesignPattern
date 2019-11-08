package p04factory.idcard;

import p04factory.framework.Factory;
import p04factory.framework.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();
    @Override
    protected Product createProduct(String owner ,String idType) {
        if (Objects.equals("A", idType))
            return new IDCardA(owner);
        return new IDCardB(owner);
    }
    @Override
    protected void registerProduct(Product product) {
        owners.add(product.getOwner());
    }
    public List<String> getOwners() {
        return owners;
    }
}
