package cn.qingmings.case1;

public enum Price {


    ApplePrice("Apple", "苹果"),
    BananaPrice("Banana","香蕉"),
    OrangePrice("Orange","橘子"),
    Watermelon("Watermelon","西瓜"),
    ;

    private String component;
    private String desc;


    Price(String component, String desc) {
        this.component = component;
        this.desc = desc;
    }


    public static Price get(String component) {
        for (Price value : Price.values()) {
            if (component.equals(value.component)) {
                return value;
            }
        }
        return null;

    }

    public String getComponent() {
        return component;
    }

    public String getDesc() {
        return desc;
    }
}
