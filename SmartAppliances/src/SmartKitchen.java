public class SmartKitchen {

   private CoffeeMaker brewMaster;
   private CoffeeMaker.Refrigerator iceBox;
   private CoffeeMaker.Dishwasher dishwasher;

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public CoffeeMaker.Refrigerator getIceBox() {
        return iceBox;
    }

    public CoffeeMaker.Dishwasher getDishwasher() {
        return dishwasher;
    }

    public void setBrewMaster(CoffeeMaker brewMaster) {
        this.brewMaster = brewMaster;
    }

    public void setIceBox(CoffeeMaker.Refrigerator iceBox) {
        this.iceBox = iceBox;
    }

    public void setDishwasher(CoffeeMaker.Dishwasher dishwasher) {
        this.dishwasher = dishwasher;
    }

    public SmartKitchen() {
       brewMaster = new CoffeeMaker();
    

   }

   public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.OrderFood();
        dishwasher.WashingDishes();

   }



}



class CoffeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }



    public void brewCoffee() {

        if (hasWorkToDo) {
            System.out.println("Ordering Food ");
            hasWorkToDo = false;
        }
    }


    class Refrigerator {

        private boolean hasWorkTodo;

        public boolean isHasWorkTodo() {
            return hasWorkTodo;
        }

        public void OrderFood() {

            if(hasWorkToDo) {
                System.out.println("Ordering Food");
                hasWorkToDo = false;

            }
        }
    }

    class Dishwasher {

        private boolean hasWorkTodo;

        public boolean isHasWorkTodo() {
            return hasWorkTodo;
        }

        public void WashingDishes() {

            if(hasWorkToDo) {
                System.out.println("Washing Dishes");
                hasWorkToDo = false;

            }
        }
    }

}


