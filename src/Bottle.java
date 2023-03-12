 class Bottle {
     private int totalCapacity;
     private int availableLiquid;
     private boolean open;

     public Bottle(int totalCapacity, int availableLiquid, boolean open) {
         this.totalCapacity = totalCapacity;
         this.availableLiquid = availableLiquid;
         this.open = open;
     }

     public int getEmptyCapacityOfBottle() {
         return totalCapacity;
     }

     public int getAvailableLiquid() {
         return availableLiquid;
     }

     public boolean hasMoreLiquid() {
         if (getEmptyCapacityOfBottle() > getAvailableLiquid()) {
             return false;
         } else
             return true;
     }

     public String openTheBottle() {
         if (open == true) {
             return "Bottle is open";
         }
         return "";
     }

     public String closeTheBottle() {
         if (open == false) {
             return "Bottle is closed";
         }
         return "";
     }

     public void drinkSpecificAmount() {
         int specificAmount=20;

         if (open == false) {
             System.out.println("Connot drink ,bottle is closed");
         }
         else if (availableLiquid == 0) {
             System.out.println("Bottle is empty");
         } else {
             specificAmount=availableLiquid-specificAmount;
             System.out.println(" Dont't try to open the bottle is already open!..you consumed " +specificAmount+ " ml");

         }
     }
 }





