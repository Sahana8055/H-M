class P{
    
        int money=20000;
        String Car="bmw";
        private String newCar="BENZ";
        int site= 5;
        void use(){
        System.out.println("money :"+money);
        System.out.println("car:"+Car);
        System.out.println("gg"+newCar);
        System.out.println("site"+site);

        }
    }

    class C extends P{
    
        int money=10000;
        
        void use(){
            System.out.println("money"+super.money);
        System.out.println("money :"+money);
        System.out.println("car:"+Car);
        System.out.println("site"+site);

        }
    }
    class demo3
    {
        public static void main(String[] args) {
            C c = new C();
            c.use();
        

        }
    }