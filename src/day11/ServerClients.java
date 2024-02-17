package day11;

public class ServerClients {
    public static void main(String[] args) {
        Server server1 = new Server("Alex",64,21.93,true);
        server1.takeOrder();
        server1.cleanTable();
        System.out.println(server1);
    }
}
