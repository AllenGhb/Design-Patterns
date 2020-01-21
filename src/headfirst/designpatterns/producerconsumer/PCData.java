package headfirst.designpatterns.producerconsumer;

/**
 * 容器数据类型
 *
 * @author 周何圳 2020年01月21日 新建
 */
public class PCData {

    private final int intData;

    public PCData(int intData) {
        this.intData = intData;
    }

    public PCData(String d){
        intData = Integer.parseInt(d);
    }

    public int getIntData() {
        return intData;
    }

    @Override
    public String toString() {
        return "PCData{" +
                "intData=" + intData +
                '}';
    }
}
