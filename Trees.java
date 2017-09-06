
public class Trees {

    final int height;
    final String sort;
    static int count = 0;

    public Trees(int height, String sort) {
            this.height = height;
            this.sort = sort;
            count++;
    }

    public Trees(String sort) {
        this(10, sort);
        //this.sort = sort;
        //height = 10;
        //count++
    }

    public void info(){
        System.out.println("The sort is " + sort + " and the height is " + height);
    }

}
