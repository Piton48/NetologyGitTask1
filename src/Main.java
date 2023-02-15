public class Main {
    public static void main(String[] args){
        SalesManager manager = new SalesManager(new long[]{1, 10, 100, 5, 7, 1000, 10, 10, 9, 40, 3, 15});
        System.out.println(manager.averageSales());
    }
}