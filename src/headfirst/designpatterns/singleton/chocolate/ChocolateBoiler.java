package headfirst.designpatterns.singleton.chocolate;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/11
 */
public class ChocolateBoiler {

    private boolean empty;

    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(uniqueInstance == null){
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    /**
    * @Discription: 盛水
    * @Author: allen
    * @Date: 12:02 2017/7/11
    */
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    /**
    * @Discription: 烧水
    * @Author: allen
    * @Date: 13:57 2017/7/11
    */
    public void boil(){
        if(!isEmpty()&&!isBoiled()){
            boiled = true;
        }
    }

    /**
    * @Discription: 倒水
    * @Author: allen
    * @Date: 13:57 2017/7/11
    */
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
        }
    }



    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

}
