public class Patron{
    private String name;
    private int id;
    private List<Item> checkedOutItems;

    public Patron(String name,int id){
        this.name=name;
        this.id=id;
        this.checkedOutItems = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public List<Item> checkedOutItems(){
        return checkedOutItems;
    }

    public void checkedOutItems(Item item){
        if (checkedOutItems.size() < 10){
            checkedOutItems.add(item);
        }
    }

    public void returnItem(Item item){
        checkedOutItems.remove(item);
    }

    public int getNumItemsCheckedOut(){
        return checkedOutItems.size();
    }

    public String getCheckedOutItemsString(){
        StringBuilder sb= new StringBuilder();
        for (Item item : checkedOutItems){
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }

    public double getTotalLateFees(){
        double totalLateFees= 0.0;
        for (Item item : checkedOutItems){
            if (item.isOverdue()){
                totalLateFees += item.getLateFee();
            }
        }
        return totalLateFees;
    }

    public void payLateFees(double amount){
        for(Item item : checkedOutItems){
            if(item.isOverdue()){
                double lateFee = item.getLateFee();
                if(amount >= lateFee){
                    amount -= lateFee;
                    item.setOverdue(false);
                }
                else{
                    item.setOverdue(true);
                    break;
                }
            }
        }
    }

    public void checkOutItem(Item item){
        if(checkedOutItems.size() < 10){
            checkedOutItems.add(item);
        }
    }

    public void returnItem(Item item){
        checkedOutItems.remove(item);
    }

    public int getNumItemsCheckedOut(){
        return checkedOutItems.size();
    }


}