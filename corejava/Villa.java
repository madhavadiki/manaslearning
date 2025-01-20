public class Villa implements Building {
    public void build(){
        System.out.println("Building a villa");
    }
    public static void main(String[] args){
        Villa v = new Villa();
        v.build();
    }
}
