package pizza;

public class Pizza {
    private  int  price;
    private Boolean veg;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price =300;
        }else {
            this.price=400;
        }
    }
    public void getPrice(){
        System.out.println(this.price);
    }

    public  void addExtraCheese(){

        this.price+=100;
        System.out.println("Added extra cheese + 100");


    }
    public  void addExtraTopping(){

        this.price+=100;
        System.out.println("Added extra topping + 100 " );



    }public  void takeAway(){

        this.price+=20;
        System.out.println("takeAway + 100 ");



    }
    public  void getBill(){

        System.out.println("your bill:" + this.price);



    }
}
