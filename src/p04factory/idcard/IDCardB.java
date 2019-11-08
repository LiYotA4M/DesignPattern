package p04factory.idcard;

import p04factory.framework.Product;

public class IDCardB extends Product {
    private String owner;
    public IDCardB(String owner) {
        System.out.println("制作" + owner + "的BID卡。");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("使用" + owner + "的BID卡。");
    }
    @Override
    public String getOwner() {
        return owner;
    }
}
