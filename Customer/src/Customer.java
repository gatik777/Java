public class Customer {

    Customer customer = new Customer() {

        private String name;
        private String creditLimit;
        private String emailAddress;

        private String Customer(String name, String creditLimit, String emailAddress) {

            return name + creditLimit + emailAddress;


        }

    };


}

