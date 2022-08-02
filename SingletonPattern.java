class Scratch {
    public static void main(String[] args) {
        Restaurant restaurant1 = Restaurant.getInstance();
        Restaurant restaurant2 = Restaurant.getInstance();
        if (restaurant1 == restaurant2) {
            System.out.println("both are same instances");
        } else {
            System.out.print("non single instances");
        }
    }
}

class Restaurant {
    private static Restaurant instance = null;
    public static Restaurant getInstance() {
        if(instance == null)
            return new Restaurant();
        return instance;
    }
}