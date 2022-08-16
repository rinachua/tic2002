public class Main {

    public static void printPrice(String item) {
        //TODO: Add your code here
        String itemWithoutSpace = item.replaceAll("\\s+","");
        int dividerPosition = itemWithoutSpace.indexOf("--");
        String itemName = itemWithoutSpace.substring(0, dividerPosition);
        String itemPrice = itemWithoutSpace.substring(dividerPosition + 3, itemWithoutSpace.length()).replace("/", ".");
        System.out.println(itemName.trim().toUpperCase() + ": " + itemPrice);
    }

    public static void main(String[] args) {
        //WARNING: Do not change the code below
        printPrice("sandwich  --$4/50");
        printPrice("  soda --$10/00");
        printPrice("  fries --$0/50");
    }
}