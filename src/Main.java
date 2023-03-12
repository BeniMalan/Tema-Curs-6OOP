public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ion", 30, false);
        Person person1=new Person("Vasile",40,true);
        Person person2=new Person("Radu",35,true);
        System.out.println("Nume:"+person.getName()+" Varsta:"+person.getAge()+" marriage :"+person.isMarried());
        System.out.println("Nume:"+person1.getName()+" Varsta:"+person1.getAge()+" marriage :"+person1.isMarried());
        System.out.println("Nume:"+person2.getName()+" Varsta:"+person2.getAge()+" marriage :"+person2.isMarried());
Product produs1=new Product("Cola",10,2,"sucuri",10,"sucuri");
System.out.println("Nume: "+produs1.getName()+" Pret: "+produs1.getPrice()+" Cantitate:"+produs1.getQuantity()+" Categoria:"+produs1.getCategory()+" Este stoc: "+produs1.isStock()+" categoria sucuri?:"+produs1.isCategory());
Product produs2=new Product("Fanta",8,3,"sucuri",3,"sucuri");
System.out.println("Nume: "+produs2.getName()+" Pret:"+produs2.getPrice()+" Cantitate:"+produs2.getQuantity()+" Categoria:"+produs2.getCategory()+" Este stoc:"+produs2.isStock()+" categoria sucuri?:"+produs2.isCategory());
Product produs3=new Product("Pepsi",6,30,"sucuri",30,"sucuri");
        System.out.println("Nume: "+produs3.getName()+" Pret:"+produs3.getPrice()+" Cantitate:"+produs3.getQuantity()+" Categoria:"+produs3.getCategory()+" Este stoc:"+produs3.isStock()+" Categoria sucuri?:"+produs3.isCategory());
       Bottle sticla=new Bottle( 100,50,true);
        System.out.println("Are exces de lichid sticla? "+sticla.hasMoreLiquid());
        System.out.println("Cantitatea de lichid: "+sticla.getAvailableLiquid());
        System.out.println("Sticla goala are capacitatea:"+sticla.getEmptyCapacityOfBottle());
        System.out.println(sticla.openTheBottle());
        System.out.println(sticla.closeTheBottle());
        sticla.drinkSpecificAmount();



    }


}
