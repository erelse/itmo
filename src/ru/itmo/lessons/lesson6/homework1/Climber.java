package ru.itmo.lessons.lesson6.homework1;

    public class Climber {
        private String name;
        private String address;

        public Climber(String name, String address) {
            this.name = name;
            this.address = address;
            setName(name);
            setAddress(address);
        }

        public void setName(String name) {
            if (name == null || name.length() < 3) {
                throw new IllegalArgumentException("name не менее 3 символов");
            }
            this.name = name;
        }

        public void setAddress(String address) {
            if (address == null || address.length() < 5) {
                throw new IllegalArgumentException("address должен быть не менее пяти символов");
            }
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public void printNameAdress(){
            System.out.println(name+" "+address);
        }

    }

