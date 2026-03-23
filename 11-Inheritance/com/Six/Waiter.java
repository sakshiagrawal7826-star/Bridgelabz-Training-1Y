package com.Six;
class Waiter extends Person implements Worker {
    int tablesAssigned;
    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }
    @Override
    public void performDuties() {
        displayInfo();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Duties: Taking orders and serving food 🍽️\n");
    }
}
