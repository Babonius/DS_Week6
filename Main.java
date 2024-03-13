public class Main {
    public static void main(String[]args){
        ListStack<String> mystackarray = new ListStack<String>();
        mystackarray.push("A");
        mystackarray.push("B");
        mystackarray.push("C");
        mystackarray.pop();
        mystackarray.push("D");
        mystackarray.push("E");
        mystackarray.pop();

        System.out.println(mystackarray.toString());
    }
}
