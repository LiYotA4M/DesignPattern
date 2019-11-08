package p07builder;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上至下午");
        builder.makeItems(new String[]{"Morning","Afternoon"});
        builder.makeString("晚上");
        builder.makeItems(new String[]{"Evening","Night","GoodBye"});
        builder.close();
    }
}
