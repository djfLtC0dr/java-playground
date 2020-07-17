class User implements Comparable, Cloneable {
    String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Object o) {
        User u = (User) o;
        if (this.getName().compareTo(u.getName()) > 0) {
            return 1;
        } else if (this.getName().compareTo(u.getName()) < 0) {
            return -1;
        }
        return 0;
    }

    // Returns true if the class of the given object
    // implements the Comparable interface
    public int isComparable(Object o){
        String strComp = ((User) o).getName();

        //it would return the length of strComp compared to name
        return (this.name.compareTo(strComp));
    }
}
class Employee extends User {
    // Returns true if the given object is an Employee object
    // or a subclass of it.
    boolean isEmployee(Object o) {
        return o instanceof Employee;
    }
}

class Manager extends Employee {
    // Returns true if the given object is a Manager object.
    boolean isManager(Object o) {
        return o instanceof Manager;
    }
}

class Customer extends User {
    // Returns true if the given object is a Customer object.
    boolean isCustomer(Object o) {
        return o instanceof Customer;
    }
}